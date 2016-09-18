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
public class descadapter extends ArrayAdapter<desc> {

    public descadapter(Context context, ArrayList<desc> descs) {
        super(context, 0, descs);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.category_desc_item, parent, false);
        }
        desc currentdesc = getItem(position);
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.heading);
        titleTextView.setText(currentdesc.gettitle());

        TextView stitleTextView = (TextView) listItemView.findViewById(R.id.desc);
        stitleTextView.setText(currentdesc.getdesc());

        ImageView img=(ImageView) listItemView.findViewById(R.id.pic);
        img.setImageResource(currentdesc.getimg());

        return listItemView;

    }

}
