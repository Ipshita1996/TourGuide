package com.android.ipshita.delhi_tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class topseventravel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topseventravel);

        final ArrayList<desc> descs=new ArrayList<desc>();
        descs.add(new desc(R.string.title11,R.string.desc11,R.drawable.n));
        descs.add(new desc(R.string.title12,R.string.desc12,R.drawable.o));
        descs.add(new desc(R.string.title13,R.string.desc13,R.drawable.p));
        descs.add(new desc(R.string.title14,R.string.desc14,R.drawable.k));
        descs.add(new desc(R.string.title15,R.string.desc15,R.drawable.l));
        descs.add(new desc(R.string.title16,R.string.desc16,R.drawable.m));

        descadapter adapter = new descadapter(this, descs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
