package com.example.android.miwok;

/**
 * Created by yug on 12/19/17.
 */

public class Word {

    /** Default translation for the word. */
    private String defaultTranslation;

    /** Miwok translation for the word. */
    private String miwokTranslation;

    /** Constructor to set default and miwok translation of a word. */
    public Word(String defaultTranslation, String miwokTranslation){
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    /** gets the default translation of the word. */
    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    /** gets the miwok translation of a word. */
    public String getMiwokTranslation() {
        return miwokTranslation;
    }


}
