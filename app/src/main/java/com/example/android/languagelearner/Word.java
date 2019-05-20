package com.example.android.languagelearner;

import android.widget.ImageView;

public class Word {

    private String mSindhiTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId;

    public Word(String sindhiTranslation,String defaultTranslation,int imageResourceId)
    {
        mSindhiTranslation=sindhiTranslation;
        mDefaultTranslation=defaultTranslation;
        mImageResourceId=imageResourceId;
    }

    public String getSindhiTranslation()
    {
        return mSindhiTranslation;
    }
    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }
    public int getImageResourceId()
    {
        return mImageResourceId;
    }

}
