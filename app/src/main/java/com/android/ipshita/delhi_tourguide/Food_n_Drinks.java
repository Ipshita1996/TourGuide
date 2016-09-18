package com.android.ipshita.delhi_tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Food_n_Drinks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_n__drinks);

        final ArrayList<item> items=new ArrayList<item>();
        items.add(new item(R.string.food_title_1,R.string.food_stitle_1,R.drawable.food));

        itemadapter itemsAdapter = new itemadapter(this, items);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Intent goToNextActivity = new Intent(Food_n_Drinks.this, toptenfoods.class);
                    startActivity(goToNextActivity);
                }
            }
        });


    }
}
