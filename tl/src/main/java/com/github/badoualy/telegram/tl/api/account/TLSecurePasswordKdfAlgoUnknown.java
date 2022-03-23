package com.github.badoualy.telegram.tl.api.account;

public class TLSecurePasswordKdfAlgoUnknown extends TLAbsSecurePasswordKdfAlgo {

    public static final int CONSTRUCTOR_ID = 0x4a8537;

    private final String _constructor = "securePasswordKdfAlgoUnknown#4a8537";

    public TLSecurePasswordKdfAlgoUnknown() {
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
