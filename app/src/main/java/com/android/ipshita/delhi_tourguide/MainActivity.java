package com.android.ipshita.delhi_tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView grid;
    int[] web = {
            R.string.bakery,
            R.string.coffee,
            R.string.comedy,
            R.string.formal,
            R.string.edc,
            R.string.restaurant
    } ;
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

        custom_grid adapter = new custom_grid(MainActivity.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);

        ScrollableGridView gridView = (ScrollableGridView) findViewById(R.id.grid);
        gridView.setExpanded(true);

        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });

    }

}
