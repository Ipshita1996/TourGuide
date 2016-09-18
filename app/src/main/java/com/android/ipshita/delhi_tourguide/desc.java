package com.android.ipshita.delhi_tourguide;

/**
 * Created by Ipshita on 18-09-2016.
 */
public class desc {
    private int mtitle;
    private int mdesc;
    private int mimg;

    public desc(int title,int desc,int img)
    {
        mtitle=title;
        mdesc=desc;
        mimg=img;
    }
    public int gettitle(){return mtitle;}
    public int getdesc(){return mdesc;}
    public int getimg(){return mimg;}

}
