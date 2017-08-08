package com.example.android.miwok;

/**
 * Created by sufya on 17-06-2017.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mSoundResourceId;

    public Word(String defaultTranslation,String miwokTranslation,int soundResourceId)
    {
        this.mDefaultTranslation=defaultTranslation;
        this.mMiwokTranslation=miwokTranslation;
        this.mSoundResourceId=soundResourceId;
    }

    public Word(String defaultTranslation,String miwokTranslation,int miwokimgresid,int soundResourceId)
    {
        this.mDefaultTranslation=defaultTranslation;
        this.mMiwokTranslation=miwokTranslation;
        this.mImageResourceId=miwokimgresid;
        this.mSoundResourceId=soundResourceId;
    }

    public String getDefaultTranslation()
    {
        return this.mDefaultTranslation;
    }

    public  String getMiwokTranslation()
    {
        return this.mMiwokTranslation;
    }

    public int getImageResourceId(){return this.mImageResourceId;}

    // check whether image resource id is provided or not
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getSoundResourceId(){return this.mSoundResourceId;}
}

