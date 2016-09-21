package com.android.ipshita.delhi_tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class toptenfoods extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toptenfoods);

        final ArrayList<desc> descs=new ArrayList<desc>();
        descs.add(new desc(R.string.title1,R.string.desc1,R.drawable.a));
        descs.add(new desc(R.string.title2,R.string.desc2,R.drawable.b));
        descs.add(new desc(R.string.title3,R.string.desc3,R.drawable.c));
        descs.add(new desc(R.string.title4,R.string.desc4,R.drawable.d));
        descs.add(new desc(R.string.title5,R.string.desc5,R.drawable.e));
        descs.add(new desc(R.string.title6,R.string.desc6,R.drawable.f));
        descs.add(new desc(R.string.title7,R.string.desc7,R.drawable.g));
        descs.add(new desc(R.string.title8,R.string.desc8,R.drawable.h));
        descs.add(new desc(R.string.title9,R.string.desc9,R.drawable.i));
        descs.add(new desc(R.string.title10,R.string.desc10,R.drawable.j));

        descadapter adapter = new descadapter(this, descs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
