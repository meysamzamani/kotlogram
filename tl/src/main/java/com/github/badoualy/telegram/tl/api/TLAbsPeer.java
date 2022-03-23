package com.github.badoualy.telegram.tl.api;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLPeerChannel}: peerChannel#a2a5371e</li>
 * <li>{@link TLPeerChat}: peerChat#36c6019a</li>
 * <li>{@link TLPeerUser}: peerUser#59511722</li>
 * </ul>
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
public abstract class TLAbsPeer extends TLObject {

    public TLAbsPeer() {
    }
}
