package com.android.ipshita.delhi_tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    /*nav drawer*/
    private ListView mDrawerList;

    GridView grid;
    int[] web = {
            R.string.bakery,
            R.string.coffee,
            R.string.comedy,
            R.string.formal,
            R.string.edc,
            R.string.restaurant
    };
    int[] imageId = {
            R.drawable.bakery,
            R.drawable.coffee,
            R.drawable.comedy,
            R.drawable.formal,
            R.drawable.edc,
            R.drawable.restsurant
    };


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*nav drawer*/
        mDrawerList = (ListView) findViewById(R.id.left_drawer);
        addDrawerItems();

        /*grid view*/
        custom_grid adapter = new custom_grid(MainActivity.this, web, imageId);
        grid = (GridView) findViewById(R.id.grid);

        ScrollableGridView gridView = (ScrollableGridView) findViewById(R.id.grid);
        gridView.setExpanded(true);

        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " + web[+position], Toast.LENGTH_SHORT).show();

            }
        });

    }


    private void addDrawerItems() {
        final ArrayList<customnav> navs=new ArrayList<customnav>();
        navs.add(new customnav(R.drawable.logo,"Android"));
        navs.add(new customnav(R.drawable.logo,"IOS"));
        navs.add(new customnav(R.drawable.logo,"Windows"));
        customnavadapter adapternav=new customnavadapter(this,navs);
        mDrawerList.setAdapter(adapternav);
    }

}