package com.github.badoualy.telegram.tl.api;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLObject;
import com.github.badoualy.telegram.tl.core.TLVector;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

/**
 * @author Meysam Zamani meysamzamani@gmail.com
 * @see <a href="https://github.com/meysamzamani/kotlogram">https://github.com/meysamzamani/kotlogram</a>
 */
public class TLWebDocumentNoProxy extends TLObject {

    public static final int CONSTRUCTOR_ID = 0xf9c8bcc6;

    protected String url;

    protected int size;

    protected String mimeType;

    protected TLVector<TLAbsDocumentAttribute> attributes;

    private final String _constructor = "webDocumentNoProxy#f9c8bcc6";

    public TLWebDocumentNoProxy() {
    }

    public TLWebDocumentNoProxy(String url, int size, String mimeType, TLVector<TLAbsDocumentAttribute> attributes) {
        this.url = url;
        this.size = size;
        this.mimeType = mimeType;
        this.attributes = attributes;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeString(url, stream);
        writeInt(size, stream);
        writeString(mimeType, stream);
        writeTLVector(attributes, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        url = readTLString(stream);
        size = readInt(stream);
        mimeType = readTLString(stream);
        attributes = readTLVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += computeTLStringSerializedSize(url);
        size += SIZE_INT32;
        size += computeTLStringSerializedSize(mimeType);
        size += attributes.computeSerializedSize();
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public TLVector<TLAbsDocumentAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(TLVector<TLAbsDocumentAttribute> attributes) {
        this.attributes = attributes;
    }
}
