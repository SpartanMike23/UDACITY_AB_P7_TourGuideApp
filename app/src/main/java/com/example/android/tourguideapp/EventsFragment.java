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
public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view,container,false);

        final ArrayList<Word> word = new ArrayList<Word>();
        word.add(new Word(R.string.concert_text,R.string.concert_description,R.drawable.rsz_special));
        word.add(new Word(R.string.food_and_drink_text,R.string.food_and_drink_description,R.drawable.rsz_food_drink));
        word.add(new Word(R.string.dirty_text,R.string.dirty_description,R.drawable.rsz_dirty));
        word.add(new Word(R.string.fitness_wellness_text,R.string.fitness_wellness_description,R.drawable.rsz_fitness));
        word.add(new Word(R.string.mbc_text,R.string.mbc_description,R.drawable.rsz_mbc));
        word.add(new Word(R.string.wwe_text,R.string.wwe_description,R.drawable.rsz_wwe));

        UserAdapter adapter = new UserAdapter(getActivity(), word);

        ListView listView = (ListView) rootView.findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        return rootView;
    }

}
