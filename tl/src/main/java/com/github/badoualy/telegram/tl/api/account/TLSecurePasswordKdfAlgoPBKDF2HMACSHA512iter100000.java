package com.github.badoualy.telegram.tl.api.account;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLBytes;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.StreamUtils.readTLBytes;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.computeTLBytesSerializedSize;

public class TLSecurePasswordKdfAlgoPBKDF2HMACSHA512iter100000 extends TLAbsSecurePasswordKdfAlgo {

    public static final int CONSTRUCTOR_ID = 0xbbf2dda0;

    protected TLBytes salt;

    private final String _constructor = "securePasswordKdfAlgoPBKDF2HMACSHA512iter100000#bbf2dda0";

    public TLSecurePasswordKdfAlgoPBKDF2HMACSHA512iter100000() {
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
