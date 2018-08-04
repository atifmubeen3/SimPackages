package com.sandp.simpackages.Ufone;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.sandp.simpackages.Packages;
import com.sandp.simpackages.PackagesAdapter;
import com.sandp.simpackages.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class UfoneSms extends Fragment {


    public UfoneSms() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.packages_list,container,false);

        ArrayList<Packages> packages = new ArrayList<Packages>();


        packages.add(new Packages("Daily Package".toUpperCase(),
                "24 Hours ",
                "1,600 SMS",
                "Rs. 4.77",
                "SMS \"Sub\" to 605",
                "SMS \"Unsub\" to 506",
                "Blank SMS to 606"));

        packages.add(new Packages("Fortnightly Package".toUpperCase(),
                "14 Days",
                "10,500 SMS",
                "Rs. 35.85",
                "SMS \"Sub\" to 603",
                "SMS \"Unsub\" to 506",
                "Blank SMS to 606"));

        packages.add(new Packages("Unlimited Package".toUpperCase(),
                "30 Days",
                "21,000 SMS",
                "Rs. 95.60",
                "SMS \"Sub\" to 607",
                "SMS \"Unsub\" to 506",
                "Blank SMS to 606"));

        packages.add(new Packages("Yearly SMS Package".toUpperCase(),
                "1 Year",
                "Unlimited SMS",
                "Rs. 795.87",
                "SMS \"Sub\" to 601",
                "SMS \"Unsub\" to 506",
                "Blank SMS to 606"));

        packages.add(new Packages("*Weekly SMS Bucket".toUpperCase(),
                "7 Days",
                "1,250 SMS",
                "Rs. 11.95",
                "SMS \"Sub\" to 608 ",
                "SMS \"Unsub\" to 8066",
                "Blank SMS to 606"));

        packages.add(new Packages("45 Day SMS Bucket".toUpperCase(),
                "45 Days",
                "31,000 SMS",
                "Rs. 118.31",
                "SMS \"Sub\" to 614",
                "SMS \"Unsub\" to 506",
                "Blank SMS to 606"));




        PackagesAdapter packagesAdapter = new PackagesAdapter(getActivity(),packages);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(packagesAdapter);


        return rootView;
    }

}
