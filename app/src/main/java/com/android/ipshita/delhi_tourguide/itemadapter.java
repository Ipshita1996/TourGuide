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
 * Created by Ipshita on 18-09-2016.
 */
public class itemadapter extends ArrayAdapter<item> {

    public itemadapter(Context context, ArrayList<item> items){
        super(context, 0, items);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.category_list_item, parent, false);
        }
        item currentitem = getItem(position);
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);
        titleTextView.setText(currentitem.get_title());

        TextView stitleTextView = (TextView) listItemView.findViewById(R.id.stitle);
        stitleTextView.setText(currentitem.get_subtitle());

        ImageView img=(ImageView) listItemView.findViewById(R.id.category_image);
        img.setImageResource(currentitem.getimage());

        return listItemView;

    }
}