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
        descs.add(new desc(R.string.title2,R.string.desc1,R.drawable.b));

        descadapter adapter = new descadapter(this, descs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
