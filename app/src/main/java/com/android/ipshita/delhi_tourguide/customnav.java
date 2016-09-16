package com.android.ipshita.delhi_tourguide;

/**
 * Created by Ipshita on 16-09-2016.
 */
public class customnav {
    private int mImageID;
    private String mText;

    public customnav(int ImageID, String Text){
        mImageID=ImageID;
        mText=Text;
    }

    public int getimageID(){
        return mImageID;
    }
    public String getText(){
        return mText;
    }
}
