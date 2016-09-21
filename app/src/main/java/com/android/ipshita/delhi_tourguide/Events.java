package com.android.ipshita.delhi_tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);


        final ArrayList<item> items=new ArrayList<item>();
        items.add(new item(R.string.event_title1,R.string.travel_stitle_1,R.drawable.event));

        itemadapter itemsAdapter = new itemadapter(this, items);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent goToNextActivity = new Intent(Events.this, flowerevents.class);
                startActivity(goToNextActivity);
            }
        });

    }
}
