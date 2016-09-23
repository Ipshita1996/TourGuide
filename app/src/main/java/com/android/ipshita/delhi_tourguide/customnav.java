package com.android.ipshita.delhi_tourguide;

/**
 * Created by Ipshita on 16-09-2016.
 */
public class customnav {
    private int mImageID;
    private int mText;

    public customnav(int ImageID, int Text){
        mImageID=ImageID;
        mText=Text;
    }

    public int getimageID(){
        return mImageID;
    }
    public int getText(){
        return mText;
    }
}
