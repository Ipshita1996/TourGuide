package com.android.ipshita.delhi_tourguide;

/**
 * Created by Ipshita on 18-09-2016.
 */
public class item {
    private int mtitle;
    private int msubtitle;
    private int mimage;

    public item(int title,int subtitle,int image){
        mtitle=title;
        msubtitle=subtitle;
        mimage=image;
    }
    public int get_title(){return mtitle;}
    public int get_subtitle(){return msubtitle;}
    public int getimage(){return mimage;}
}
