package com.example.android.anaheimtourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Context context, ArrayList<Location> locationArrayList) {
        super(context, 0, locationArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.listview, parent, false);

        }

//        Get current item of the arraylist
        Location currentLocation = getItem(position);

//        Set location name
        TextView locationNameTextView = (TextView) listItemView.findViewById(R.id.location_name);
        locationNameTextView.setText(currentLocation.getLocationNameId());

//        Set location address
        TextView locationAddressTextView = (TextView) listItemView.findViewById(R.id.location_address);
        locationAddressTextView.setText(currentLocation.getLocationAddressId());

//        Set location image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentLocation.hasImage()) {
            imageView.setImageResource(currentLocation.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
