package com.github.badoualy.telegram.tl.api;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLChatParticipant}: chatParticipant#c02d4007</li>
 * <li>{@link TLChatParticipantAdmin}: chatParticipantAdmin#a0933f5b</li>
 * <li>{@link TLChatParticipantCreator}: chatParticipantCreator#e46bcee4</li>
 * </ul>
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
public abstract class TLAbsChatParticipant extends TLObject {

    protected long userId;

    public TLAbsChatParticipant() {
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
