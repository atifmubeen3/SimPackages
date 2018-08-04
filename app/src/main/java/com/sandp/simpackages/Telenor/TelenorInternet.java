package com.sandp.simpackages.Telenor;


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
public class TelenorInternet extends Fragment {


    public TelenorInternet() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.packages_list,container,false);

        ArrayList<Packages> packages = new ArrayList<Packages>();


        packages.add(new Packages("TELENOR VIDEO BUNDLE  ".toUpperCase(),
                "1 Hour",
                "500 MBs",
                "Rs. 6.00" ,
                "*60#",
                "N/A",
                "*111#"));

        packages.add(new Packages("MEHRAN INTERNET OFFER  ".toUpperCase(),
                "7 Days",
                "Rs. 50 Balance + 3000 MBs",
                "Rs. 120.00 (Valid Only For Sindh Excluding Karachi)" ,
                "*620#",
                "N/A",
                "*111#"));

        packages.add(new Packages("4G WEEKLY ULTRA  ".toUpperCase(),
                "7 Days",
                "5000 MBs",
                "Rs. 160.00" ,
                "*336#",
                "N/A",
                "*111#"));

        packages.add(new Packages("4G WEEKLY SUPER  ".toUpperCase(),
                "7 Days",
                "2000 MBs",
                "Rs. 100.00" ,
                "*288#",
                "N/A",
                "*111#"));

        packages.add(new Packages("DHAMAL INTERNET OFFER  ".toUpperCase(),
                "7 Days",
                "2000 MBs",
                "Rs. 85.00" ,
                "*812#",
                "N/A",
                "*111#"));

        packages.add(new Packages("SUPER DHAMAL INTERNET OFFER  ".toUpperCase(),
                "7 Days",
                "5000 MBs",
                "Rs. 150.00" ,
                "*946#",
                "N/A",
                "*111#"));

        packages.add(new Packages("4G DAILY UNLIMITED INTERNET BUNDLE  ".toUpperCase(),
                "1 Day",
                "350 MBs (1AM to 7PM)",
                "Rs. 16.00" ,
                "*10#",
                "N/A",
                "*111#"));

        packages.add(new Packages("RAAT DIN OFFER  ".toUpperCase(),
                "12 Hours (12AM to 12PM",
                "1.5 GBs",
                "Rs. 15.00" ,
                "*150#",
                "N/A",
                "*111#"));

        packages.add(new Packages("4G 3 DAY BUNDLE  ".toUpperCase(),
                "3 Days",
                "200 MBs + 200MB For Facebook",
                "Rs. 42.00" ,
                "*32#",
                "N/A",
                "*111#"));

        packages.add(new Packages("4G Weekly Unlimited Internet Bundle  ".toUpperCase(),
                "7 Days (1AM - 7PM)",
                "2500 MBs",
                "Rs. 85.00" ,
                "345*144#",
                "N/A",
                "*111#"));

        packages.add(new Packages("4G Weekly Bundle  ".toUpperCase(),
                "7 Days",
                "750 MBs",
                "Rs. 75.00" ,
                "*72#",
                "N/A",
                "*111#"));

        packages.add(new Packages("Weekly Plus Bundle  ".toUpperCase(),
                "7 Days",
                "1500 MBs",
                "Rs. 120.00" ,
                "*73#",
                "N/A",
                "*111#"));

        packages.add(new Packages("Monthly Data Offer  ".toUpperCase(),
                "30 Days",
                "2000 MBs + 1000s MB (WhatsApp/Goonj/GameBox)",
                "Rs. 170.00" ,
                "*301#",
                "N/A",
                "*111#"));

        packages.add(new Packages("4G Monthly Starter Bundle  ".toUpperCase(),
                "30 Days",
                "4,000 MBs + 4,000s MB (1 AM - 7 AM)",
                "Rs. 250.00" ,
                "*302#",
                "N/A",
                "*111#"));

        packages.add(new Packages("4G Monthly Bundle  ".toUpperCase(),
                "30 Days",
                "9000 MBs",
                "Rs. 500.00" ,
                "*303#",
                "N/A",
                "*111#"));

        packages.add(new Packages("4G Monthly Plus Bundle  ".toUpperCase(),
                "30 Days",
                "10000 MBs",
                "Rs. 750.00" ,
                "*345*136#",
                "N/A",
                "*111#"));

        packages.add(new Packages("Social Pack  ".toUpperCase(),
                "1 Day",
                "100 MBs",
                "Rs. 5.00" ,
                "*345*217#",
                "N/A",
                "*111#"));

        packages.add(new Packages("Punjab Internet Offer ".toUpperCase(),
                "3 Day",
                "300 MBs + 300MBs For Facebook",
                "Rs. 35.00" ,
                "*345*163#",
                "N/A",
                "*111#"));




        PackagesAdapter packagesAdapter = new PackagesAdapter(getActivity(),packages);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(packagesAdapter);


        return rootView;
    }

}
