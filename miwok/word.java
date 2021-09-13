package com.example.android.miwok;

public class word {

    private String mDefaulttranslation;

    private String mMiwokTranslation;

    public word(String defaulttranslation, String miwokTranslation){
        mDefaulttranslation = defaulttranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getmDefaulttranslation(){
        return mDefaulttranslation;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }
}
