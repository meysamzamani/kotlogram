package com.github.badoualy.telegram.tl.api;

import com.github.badoualy.telegram.tl.TLContext;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
public class TLChatParticipantsForbidden extends TLAbsChatParticipants {

    public static final int CONSTRUCTOR_ID = 0x8763d3e1;

    protected int flags;

    protected TLAbsChatParticipant selfParticipant;

    private final String _constructor = "chatParticipantsForbidden#8763d3e1";

    public TLChatParticipantsForbidden() {
    }

    public TLChatParticipantsForbidden(long chatId, TLAbsChatParticipant selfParticipant) {
        this.chatId = chatId;
        this.selfParticipant = selfParticipant;
    }

    private void computeFlags() {
        flags = 0;
        flags = selfParticipant != null ? (flags | 1) : (flags & ~1);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeLong(chatId, stream);
        if ((flags & 1) != 0) {
            if (selfParticipant == null) throwNullFieldException("selfParticipant", flags);
            writeTLObject(selfParticipant, stream);
        }
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        chatId = readLong(stream);
        selfParticipant = (flags & 1) != 0 ? readTLObject(stream, context, TLAbsChatParticipant.class, -1) : null;
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += SIZE_INT64;
        if ((flags & 1) != 0) {
            if (selfParticipant == null) throwNullFieldException("selfParticipant", flags);
            size += selfParticipant.computeSerializedSize();
        }
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

    public long getChatId() {
        return chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    public TLAbsChatParticipant getSelfParticipant() {
        return selfParticipant;
    }

    public void setSelfParticipant(TLAbsChatParticipant selfParticipant) {
        this.selfParticipant = selfParticipant;
    }
}
