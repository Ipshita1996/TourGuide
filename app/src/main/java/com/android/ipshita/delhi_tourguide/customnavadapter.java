package com.android.ipshita.delhi_tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ipshita on 16-09-2016.
 */
public class customnavadapter extends ArrayAdapter<customnav> {


    public customnavadapter(Context context, ArrayList<customnav> navs){
        super(context, 0, navs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

// Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.navitem, parent, false);
        }


        customnav current = getItem(position);
        TextView cTextView = (TextView) listItemView.findViewById(R.id.text);
        cTextView.setText(current.getText());

        ImageView img=(ImageView) listItemView.findViewById(R.id.icon);
        img.setImageResource(current.getimageID());

        return listItemView;

    }
}
