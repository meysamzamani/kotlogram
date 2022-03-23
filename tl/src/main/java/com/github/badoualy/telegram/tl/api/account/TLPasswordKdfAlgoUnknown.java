package com.github.badoualy.telegram.tl.api.account;

public class TLPasswordKdfAlgoUnknown extends TLAbsPasswordKdfAlgo {

    public static final int CONSTRUCTOR_ID = 0xd45ab096;

    private final String _constructor = "passwordKdfAlgoUnknown#d45ab096";

    public TLPasswordKdfAlgoUnknown() {
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
