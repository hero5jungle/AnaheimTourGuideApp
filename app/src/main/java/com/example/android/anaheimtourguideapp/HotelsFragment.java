package com.example.android.anaheimtourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.listview, container, false);

        final ArrayList<Location> locationArrayList = new ArrayList<Location>();
        locationArrayList.add(new Location(R.string.candy_cane, R.string.candy_cane_address,
                R.drawable.candy_cane));
        locationArrayList.add(new Location(R.string.courtyard_anaheim, R.string.courtyard_anaheim_address,
                R.drawable.courtyard));
        locationArrayList.add(new Location(R.string.homewood_suites, R.string.homewood_suites_address,
                R.drawable.homewood));
        locationArrayList.add(new Location(R.string.indigo, R.string.indigo_address,
                R.drawable.indigo));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locationArrayList);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
