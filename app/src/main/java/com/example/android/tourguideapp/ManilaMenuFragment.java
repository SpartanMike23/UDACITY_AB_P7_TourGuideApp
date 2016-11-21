package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ManilaMenuFragment extends Fragment {


    public ManilaMenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view,container,false);

        final ArrayList<Word> word = new ArrayList<Word>();

        word.add(new Word(R.string.geography_text,R.string.geography_description,R.drawable.rsz_geography));
        word.add(new Word(R.string.history_text,R.string.history_description,R.drawable.rsz_history));
        word.add(new Word(R.string.cliamte_text,R.string.cliamte_description,R.drawable.rsz_climate));
        word.add(new Word(R.string.population_text,R.string.population_description,R.drawable.rsz_population));
        word.add(new Word(R.string.government_text,R.string.government_description,R.drawable.rsz_government));
        word.add(new Word(R.string.districts_text,R.string.districts_description,R.drawable.rsz_districts));


        UserAdapter adapter = new UserAdapter(getActivity(), word);

        ListView listView = (ListView) rootView.findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        return rootView;

    }



}
