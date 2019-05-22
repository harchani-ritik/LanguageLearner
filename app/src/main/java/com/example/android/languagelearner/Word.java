package com.example.android.languagelearner;

import android.widget.ImageView;

public class Word {

    private String mSindhiTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId=NOIMAGERESOURCEID;
    private int mAudioResourceId;

    private static final int NOIMAGERESOURCEID=-1;

    public Word(String sindhiTranslation,String defaultTranslation)
    {
        mSindhiTranslation=sindhiTranslation;
        mDefaultTranslation=defaultTranslation;
    }

    public Word(String sindhiTranslation,String defaultTranslation,int imageResourceId)
    {
        mSindhiTranslation=sindhiTranslation;
        mDefaultTranslation=defaultTranslation;
        mImageResourceId=imageResourceId;
    }
    public Word(String sindhiTranslation,String defaultTranslation,int imageResourceId,int audioResourceId)
    {
        mSindhiTranslation=sindhiTranslation;
        mDefaultTranslation=defaultTranslation;
        mImageResourceId=imageResourceId;
        mAudioResourceId=audioResourceId;
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

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    public boolean hasImage()
    {
        return mImageResourceId!=NOIMAGERESOURCEID;
    }


}
