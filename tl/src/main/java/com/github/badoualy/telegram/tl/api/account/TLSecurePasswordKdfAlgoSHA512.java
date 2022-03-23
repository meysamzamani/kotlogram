package com.github.badoualy.telegram.tl.api.account;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLBytes;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static com.github.badoualy.telegram.tl.StreamUtils.readTLBytes;
import static com.github.badoualy.telegram.tl.StreamUtils.writeTLBytes;
import static com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID;
import static com.github.badoualy.telegram.tl.TLObjectUtils.computeTLBytesSerializedSize;

public class TLSecurePasswordKdfAlgoSHA512 extends TLAbsSecurePasswordKdfAlgo {

    public static final int CONSTRUCTOR_ID = 0x86471d92;

    protected TLBytes salt;

    private final String _constructor = "securePasswordKdfAlgoSHA512#86471d92";

    public TLSecurePasswordKdfAlgoSHA512() {
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLBytes(salt, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        salt = readTLBytes(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += computeTLBytesSerializedSize(salt);
        return size;
    }

    @Override
    public String toString() {
        return _constructor;
    }

    @Override
    public int getConstructorId() {
        return CONSTRUCTOR_ID;
    }

    public TLBytes getSalt() {
        return salt;
    }

    public void setSalt(TLBytes salt) {
        this.salt = salt;
    }
}
