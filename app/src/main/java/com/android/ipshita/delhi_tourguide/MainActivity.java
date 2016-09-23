package com.android.ipshita.delhi_tourguide;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    /*nav drawer*/
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;
    private DrawerLayout mDrawerLayout;
    private String mActivityTitle;

    GridView grid;
    int[] web = {
            R.string.topdishes,
            R.string.travel_title_1,
            R.string.event_title1,
            R.string.food_title2

    };
    int[] imageId = {
            R.drawable.food,
            R.drawable.travel,
            R.drawable.event,
            R.drawable.food2
    };


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //nav drawer

        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        mActivityTitle = getTitle().toString();
        mDrawerList = (ListView) findViewById(R.id.left_drawer);
        addDrawerItems();
        setupDrawer();

        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent goToNextActivity = new Intent(MainActivity.this, Food_n_Drinks.class);
                    startActivity(goToNextActivity);}
                else if(position==1){
                    Intent goToNextActivity = new Intent(MainActivity.this, Travel.class);
                    startActivity(goToNextActivity);
                }
                else if(position==2){
                    Intent goToNextActivity = new Intent(MainActivity.this,Events.class);
                    startActivity(goToNextActivity);
                }
                else if(position==3){
                    Intent goToNextActivity = new Intent(MainActivity.this,Lifestyle.class);
                    startActivity(goToNextActivity);
                }
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        /*grid view*/
        custom_grid adapter = new custom_grid(MainActivity.this, web, imageId);
        grid = (GridView) findViewById(R.id.grid);

        ScrollableGridView gridView = (ScrollableGridView) findViewById(R.id.grid);
        gridView.setExpanded(true);

        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent goToNextActivity = new Intent(MainActivity.this, toptenfoods.class);
                    startActivity(goToNextActivity);}
                else if(position==1){
                        Intent goToNextActivity = new Intent(MainActivity.this, topseventravel.class);
                        startActivity(goToNextActivity);
                    }
                else if(position==2){
                    Intent goToNextActivity = new Intent(MainActivity.this,flowerevents.class);
                    startActivity(goToNextActivity);
                }
                else if(position==3){
                    Intent goToNextActivity = new Intent(MainActivity.this,foodtrail.class);
                    startActivity(goToNextActivity);
                }
            }
        });

    }


    private void addDrawerItems() {
        final ArrayList<customnav> navs=new ArrayList<customnav>();
        navs.add(new customnav(R.drawable.cutlery,R.string.navFood));
        navs.add(new customnav(R.drawable.direction,R.string.navtravel));
        navs.add(new customnav(R.drawable.jewel,R.string.navevent));
        navs.add(new customnav(R.drawable.heart,R.string.navlife));
        customnavadapter adapternav=new customnavadapter(this,navs);
        mDrawerList.setAdapter(adapternav);
    }
    private void setupDrawer() {
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
                R.string.drawer_open, R.string.drawer_close) {

            /** Called when a drawer has settled in a completely open state. */
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getSupportActionBar().setTitle(R.string.nav);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }

            /** Called when a drawer has settled in a completely closed state. */
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                getSupportActionBar().setTitle(mActivityTitle);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }
        };
        mDrawerToggle.setDrawerIndicatorEnabled(true);
        mDrawerLayout.setDrawerListener(mDrawerToggle);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        // Activate the navigation drawer toggle
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}