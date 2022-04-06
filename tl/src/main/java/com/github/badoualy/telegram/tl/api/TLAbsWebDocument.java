package com.github.badoualy.telegram.tl.api;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLWebDocument}: webDocument#1c570ed1</li>
 * <li>{@link TLWebDocumentNoProxy}: webDocumentNoProxy#f9c8bcc6</li>
 * </ul>
 *
 * @author Meysam Zamani meysamzamani@gmail.com
 * @see <a href="https://github.com/meysamzamani/kotlogram">https://github.com/meysamzamani/kotlogram</a>
 */
public abstract class TLAbsWebDocument extends TLObject {

    public TLAbsWebDocument() {
    }

    public abstract boolean isEmpty();

    public abstract boolean isNotEmpty();

    public TLWebDocument getAsWebDocument() {
        return null;
    }
}
