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
public class RestaurantsFragments extends Fragment {


    public RestaurantsFragments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view,container,false);

        final ArrayList<Word> word = new ArrayList<Word>();

        word.add(new Word(R.string.jollibee_text,R.string.jollibee_description,R.drawable.rsz_jollibee));
        word.add(new Word(R.string.chow_king_text,R.string.chow_king_description,R.drawable.rsz_chowking));
        word.add(new Word(R.string.kamayan_text,R.string.kamayan_description,R.drawable.rsz_kamayan));
        word.add(new Word(R.string.harbor_view_text,R.string.harbor_view_description,R.drawable.rsz_harbor_view));
        word.add(new Word(R.string.leau_vive_text,R.string.leau_vive_description,R.drawable.rsz_leau_vive));
        word.add(new Word(R.string.aristocrats_text,R.string.aristocrats_description,R.drawable.rsz_aristocrats));
        word.add(new Word(R.string.spices_text,R.string.spices_description,R.drawable.rsz_the_spices));





        UserAdapter adapter = new UserAdapter(getActivity(), word);

        ListView listView = (ListView) rootView.findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        return rootView;
    }

}
