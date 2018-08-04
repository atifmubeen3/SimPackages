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
public class UfoneInternet extends Fragment {


    public UfoneInternet() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.packages_list,container,false);

        ArrayList<Packages> packages = new ArrayList<Packages>();


        packages.add(new Packages("Streaming Offer\n" +
                "(1 hour)".toUpperCase(),
                "1 Hour",
                "500 MBs for Youtube & Dailymotion",
                "Rs. 8.00"
                , "*78#",
                "N/A",
                "*706#"));

        packages.add(new Packages("Daily Light".toUpperCase(),
                "1 Day",
                "40 MBs + Free (FB,Twitter,Whatsapp & LINE)",
                "Rs. 10.00"
                , "*2256#",
                "N/A",
                "*706#"));

        packages.add(new Packages("Daily Heavy".toUpperCase(),
                "1 Day",
                "75 MBs + Free (FB,Twitter,Whatsapp & LINE)",
                "Rs. 15.00"
                , "*2258#",
                "N/A",
                "*706#"));

        packages.add(new Packages("Special Daily\n" +
                "01 AM- 09 PM".toUpperCase(),
                "1 Day",
                "50 MBs + Free (FB,Twitter,Whatsapp & LINE)",
                "Rs. 5.00"
                , "*3461#",
                "N/A",
                "*706#"));

        packages.add(new Packages("Mega Internet Bucket\n" +
                "1 AM - 8 AM".toUpperCase(),
                "1 Day",
                "2 GBs",
                "Rs. 12.00"
                , "*550#",
                "N/A",
                "*706#"));

        packages.add(new Packages("3 Day Bucket".toUpperCase(),
                "3 Days",
                "100 MBs + Free (FB,Twitter,Whatsapp & LINE)",
                "Rs. 25.00"
                , "*3350#",
                "N/A",
                "*706#"));

        packages.add(new Packages("Weekly Light".toUpperCase(),
                "7 Days",
                "250 MBs + Free (FB,Twitter,Whatsapp & LINE)",
                "Rs. 50.00"
                , "*7811#",
                "N/A",
                "*706#"));
        packages.add(new Packages("Super Internet".toUpperCase(),
                "7 Days",
                "1224 MBs",
                "Rs. 100.00"
                , "*220#",
                "N/A",
                "*706#"));

        packages.add(new Packages("Weekly Internet Plus".toUpperCase(),
                "7 Days",
                "3,072 MBs",
                "Rs. 150.00"
                , "*260#",
                "N/A",
                "*706#"));

        packages.add(new Packages("Monthly Light".toUpperCase(),
                "30 Days",
                "1 GBs + Free (FB,Twitter,Whatsapp & LINE)",
                "Rs. 250.00"
                , "*7807#",
                "N/A",
                "*706#"));

        packages.add(new Packages("Monthly Heavy".toUpperCase(),
                "30 Days",
                "3 GBs + Free (FB,Twitter,Whatsapp & LINE)",
                "Rs. 500.00"
                , "*803#",
                "N/A",
                "*706#"));

        packages.add(new Packages("Monthly Max".toUpperCase(),
                "30 Days",
                "10 GBs + Free (FB,Twitter,Whatsapp & LINE)",
                "Rs. 1000.00"
                , "*5100#",
                "N/A",
                "*706#"));

        packages.add(new Packages("Social Daily".toUpperCase(),
                "1 Day",
                "100 MBs + Free (FB,Twitter & Whatsapp)",
                "Rs. 5.00"
                , "*4422#",
                "N/A",
                "*706#"));

        packages.add(new Packages("Daily Chat".toUpperCase(),
                "1 Day",
                "10,000 SMS\n" +
                        "+ Unlimited Whatsapp",
                "Rs. 5.00"
                , "*3465#",
                "N/A",
                "*706#"));

        packages.add(new Packages("Social Monthly".toUpperCase(),
                "30 Days",
                "Free (FB,Twitter & Whatsapp)",
                "Rs. 50.00"
                , "*5858#",
                "N/A",
                "*706#"));







        PackagesAdapter packagesAdapter = new PackagesAdapter(getActivity(),packages);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(packagesAdapter);


        return rootView;
    }

}
