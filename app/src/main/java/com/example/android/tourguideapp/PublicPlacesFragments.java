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
public class PublicPlacesFragments extends Fragment {


    public PublicPlacesFragments() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view,container,false);

        final ArrayList<Word> word = new ArrayList<Word>();

        word.add(new Word(R.string.mall_of_asia_text,R.string.mall_of_asia_description,R.drawable.rsz_mall_of_asia));
        word.add(new Word(R.string.mega_mall_text,R.string.mega_mall_description,R.drawable.rsz_mega_mall));
        word.add(new Word(R.string.glorietta_text,R.string.glorietta_description,R.drawable.rsz_glorietta));
        word.add(new Word(R.string.green_belt_text,R.string.green_belt_description,R.drawable.rsz_greenbelt));
        word.add(new Word(R.string.trinoma_text,R.string.trinoma_description,R.drawable.rsz_trinoma));
        word.add(new Word(R.string.robinson_text,R.string.robinson_description,R.drawable.rsz_robinson));


        UserAdapter adapter = new UserAdapter(getActivity(), word);

        ListView listView = (ListView) rootView.findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        return rootView;
    }

}
