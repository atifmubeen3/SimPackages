package com.sandp.simpackages.Warid;


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
public class WaridAIO extends Fragment {


    public WaridAIO() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.packages_list,container,false);

        ArrayList<Packages> packages = new ArrayList<Packages>();


        packages.add(new Packages("Weekly All Network Offer", "7 Days", "700 Jazz+Warid Minutes + 700 SMS + 250Mbs + 50 Mins (off-net)",
                "Rs. 120 (Including Tax)" , "*700#",  "*700*4#","*700*2#"));

        packages.add(new Packages("Weekly Super Duper Offer", "7 Days", "1000Mbs + 1000 Jazz + Warid Minutes + 1000SMS",
                "Rs. 150 (Including Tax)" , "*770#",  "*770*4#","*770*2#"));

        packages.add(new Packages("Jazz Gold Monthly Offer", "30 Days", "1800 Jazz+Warid Minutes + 1800 SMS + 1800MBs + 180 Mins (Off-net)",
                "Rs. 590 (Including Tax)","*707#", "*707*4#","*707*2#"));


        packages.add(new Packages("Super Duper Monthly Offer", "30 Days", "1200 Jazz+Warid Minutes + 1200 SMS + 1000MBs + 100 Mins (Off-net)",
                "Rs. 380 (Including Tax)","*706#", "*706*4#","*706*2#"));

        packages.add(new Packages("Monthly All Rounder Offer", "30 Days", "200 Minutes (All Networks) + 5000Mbs + 200 SMS",
                "Rs. 499 (Including Tax)","*2000#", "N/A","N/A"));

        packages.add(new Packages("Haftawar Offer", "7 Days", "700 Jazz+Warid Minutes + 700 SMS + 70MBs",
                "Rs. 75 (Including Tax)","*407#", "*407*4#","*407*2#"));

        packages.add(new Packages("Monthly Hybrid Bundle", "30 Days", "6000 Jazz+Warid Minutes + 6000 SMS + 600MBs",
                "Rs. 370 (Including Tax)","*430#", "*430*4#","*430*2#"));

        packages.add(new Packages("Supreme Offer", "x+29 Days", "1000 (on-net) & 100 (off-net) Minutes + 1000SMS + 100Mbs",
                "Rs. 299.00 (Including Tax) ", "*3500#",  "N/A","N/A"));

        PackagesAdapter packagesAdapter = new PackagesAdapter(getActivity(),packages);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(packagesAdapter);


        return rootView;
    }

}
