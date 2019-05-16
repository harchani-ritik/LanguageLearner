package com.example.android.languagelearner;

public class Word {

    private String mSindhiTranslation;
    private String mDefaultTranslation;

    public Word(String sindhiTranslation,String defaultTranslation)
    {
        mSindhiTranslation=sindhiTranslation;
        mDefaultTranslation=defaultTranslation;
    }

    public String getSindhiTranslation()
    {
        return mSindhiTranslation;
    }
    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }
}