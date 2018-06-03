package com.example.android.anaheimtourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodsFragment extends Fragment {

    public FoodsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.listview, container, false);

        final ArrayList<Location> locationArrayList = new ArrayList<Location>();
        locationArrayList.add(new Location(R.string.jazz_kitchen, R.string.jazz_kitchen_adddress,
                R.drawable.jazz_kitchen));
        locationArrayList.add(new Location(R.string.pancake_house, R.string.pancake_house_address,
                R.drawable.pancake_house));
        locationArrayList.add(new Location(R.string.pf_chang, R.string.pf_chang_address,
                R.drawable.pf_chang));
        locationArrayList.add(new Location(R.string.tiki_bar, R.string.tiki_bar_address,
                R.drawable.tiki_bar));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locationArrayList);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
