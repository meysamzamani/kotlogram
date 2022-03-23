package com.github.badoualy.telegram.tl.api;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLBytes;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.StreamUtils.readTLBytes;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.computeTLBytesSerializedSize;

public class TLInputCheckPasswordSRP extends TLAbsInputCheckPasswordSRP {

    public static final int CONSTRUCTOR_ID = 0xd27ff082;

    protected long srpId;

    protected TLBytes A;

    protected TLBytes M1;

    private final String _constructor = "inputCheckPasswordSRP#d27ff082";

    public TLInputCheckPasswordSRP() {
    }


    public TLInputCheckPasswordSRP(long srpId, TLBytes a, TLBytes m1) {
        this.srpId = srpId;
        A = a;
        M1 = m1;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeLong(srpId, stream);
        writeTLBytes(A, stream);
        writeTLBytes(M1, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        srpId = readLong(stream);
        A = readTLBytes(stream, context);
        M1 = readTLBytes(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT64;
        size += computeTLBytesSerializedSize(A);
        size += computeTLBytesSerializedSize(M1);
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

    public long getSrpId() {
        return srpId;
    }

    public void setSrpId(long srpId) {
        this.srpId = srpId;
    }

    public TLBytes getA() {
        return A;
    }

    public void setA(TLBytes a) {
        A = a;
    }

    public TLBytes getM1() {
        return M1;
    }

    public void setM1(TLBytes m1) {
        M1 = m1;
    }
}
