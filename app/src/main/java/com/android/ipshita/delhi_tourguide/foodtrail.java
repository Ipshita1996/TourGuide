package com.android.ipshita.delhi_tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class foodtrail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodtrail);

        final ArrayList<desc> descs=new ArrayList<desc>();
        descs.add(new desc(R.string.food_title2,R.string.food_content,R.drawable.food2));

        descadapter adapter = new descadapter(this, descs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
