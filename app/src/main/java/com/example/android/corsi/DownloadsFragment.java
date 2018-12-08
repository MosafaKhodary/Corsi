package com.example.android.corsi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class DownloadsFragment extends Fragment {


    public DownloadsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_downloads, container, false);



        // Inflate the layout for this fragment
        ArrayList<Downloads> downloads = new ArrayList<Downloads>();
        downloads.add(new Downloads("Lesson 1","Android apps"));
        downloads.add(new Downloads("Lesson 1","Android apps"));
        downloads.add(new Downloads("Lesson 1","Android apps"));
        downloads.add(new Downloads("Lesson 1","Android apps"));
        downloads.add(new Downloads("Lesson 1","Android apps"));
        downloads.add(new Downloads("Lesson 1","Android apps"));
        downloads.add(new Downloads("Lesson 1","Android apps"));
        downloads.add(new Downloads("Lesson 1","Android apps"));
        downloads.add(new Downloads("Lesson 1","Android apps"));
        downloads.add(new Downloads("Lesson 1","Android apps"));
        downloads.add(new Downloads("Lesson 1","Android apps"));
        downloads.add(new Downloads("Lesson 1","Android apps"));
        downloads.add(new Downloads("Lesson 1","Android apps"));
        downloads.add(new Downloads("Lesson 1","Android apps"));
        downloads.add(new Downloads("Lesson 1","Android apps"));

        DownloadsAdapter arrayAdapter = new DownloadsAdapter(getActivity(),downloads);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(arrayAdapter);

     //   return inflater.inflate(R.layout.fragment_downloads, container, false);
        return rootView;
    }

}
