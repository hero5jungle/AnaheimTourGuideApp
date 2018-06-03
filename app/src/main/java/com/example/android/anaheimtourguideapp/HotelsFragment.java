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
        locationArrayList.add(new Location(R.string.angel, R.string.angel_address,
                R.drawable.angel));
        locationArrayList.add(new Location(R.string.downtown_disney, R.string.downtown_disney_address,
                R.drawable.dtdisney));
        locationArrayList.add(new Location(R.string.little_tokyo, R.string.little_tokyo_address,
                R.drawable.tokyo));
        locationArrayList.add(new Location(R.string.cathedral, R.string.cathedral_address,
                R.drawable.cathedral));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locationArrayList);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
