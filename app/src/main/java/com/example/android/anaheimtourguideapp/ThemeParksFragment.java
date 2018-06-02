package com.example.android.anaheimtourguideapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ThemeParksFragment extends Fragment {

    public ThemeParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.listview, container, false);

        final ArrayList<Location> locationArrayList = new ArrayList<Location>();
        locationArrayList.add(new Location(R.string.disneyland, R.string.disneyland_address,
                R.drawable.disneyland));
        locationArrayList.add(new Location(R.string.knotts, R.string.knotts_address,
                R.drawable.knotts));
        locationArrayList.add(new Location(R.string.adventure, R.string.adventure_address,
                R.drawable.cali_adventure));
        locationArrayList.add(new Location(R.string.soak_city, R.string.soak_city_address,
                R.drawable.soak_city));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locationArrayList);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
