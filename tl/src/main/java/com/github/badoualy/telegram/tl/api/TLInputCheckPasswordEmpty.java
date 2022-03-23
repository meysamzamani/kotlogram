package com.github.badoualy.telegram.tl.api;

public class TLInputCheckPasswordEmpty extends TLAbsInputCheckPasswordSRP {

    public static final int CONSTRUCTOR_ID = 0x9880f658;

    private final String _constructor = "inputCheckPasswordEmpty#9880f658";

    public TLInputCheckPasswordEmpty() {
    }

    @Override
    public String toString() {
        return _constructor;
    }

    @Override
    public int getConstructorId() {
        return CONSTRUCTOR_ID;
    }

}
