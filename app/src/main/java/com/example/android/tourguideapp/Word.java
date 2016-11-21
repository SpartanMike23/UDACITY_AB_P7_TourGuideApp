package com.example.android.tourguideapp;

/**
 * Created by Michael on 9/8/16.
 */
public class Word {
    private int mTextDescription;
    private int mImageResourceId;
    private int mTitle;


    public Word (int title, int textDescription, int imageResourceId) {
        mTitle = title;
        mTextDescription = textDescription;
        mImageResourceId = imageResourceId;


    }

    public int getTitle() {
        return mTitle;
    }

    public int getTextDescription() {
        return mTextDescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
