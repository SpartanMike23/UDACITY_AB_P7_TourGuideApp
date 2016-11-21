package com.example.android.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Michael on 9/8/16.
 */
public class UserAdapter extends ArrayAdapter<Word>  {

    public UserAdapter(Context context, ArrayList<Word> word) {
        //This creates the internal storage for the context and the list
        //second argument calls for a value if using a single TextView
        //the adapter is not going to use the 2nd adapter
        super(context, 0, word);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Get data for this position
        Word currentAttraction = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //Sets Title View
        TextView titleViewAttraction = (TextView) listItemView.findViewById(R.id.title_attractions);
        titleViewAttraction.setText(currentAttraction.getTitle());

        //Sets Description View
        TextView descriptionView = (TextView) listItemView.findViewById(R.id.description_attractions);
        descriptionView.setText(currentAttraction.getTextDescription());

        //Sets Image
        ImageView imageViewAttraction = (ImageView) listItemView.findViewById(R.id.image_attractions);
        imageViewAttraction.setImageResource(currentAttraction.getImageResourceId());


        return listItemView;
    }
}
