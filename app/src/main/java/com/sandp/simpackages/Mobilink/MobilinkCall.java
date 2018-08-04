package com.sandp.simpackages.Mobilink;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.sandp.simpackages.Packages;
import com.sandp.simpackages.PackagesAdapter;
import com.sandp.simpackages.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MobilinkCall extends Fragment {


    public MobilinkCall() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.packages_list, container, false);

        ArrayList<Packages> packages = new ArrayList<Packages>();

        packages.add(new Packages("Make Your Own Bundle", "Any Time(1/7/30 Day/Days)", "Any Time You Decide(SMS/Call/Internet) ",
                "As Selected", "*303#", "N/A", "N/A"));

        packages.add(new Packages("Lambi Baat Offer", "Life Time", "Free After First 3 Minutes",
                "Free ", "*326#", "*326*4#", "*326*2#"));

        packages.add(new Packages("New Sim Offer", "7 Days", "700 Jazz+Warid Minutes + 700 SMS + 700 Mbs (except 9PM - 1AM)",
                "Free ", "*191#", "N/A", "N/A"));

        packages.add(new Packages("Day Bundle", "1 Day (12AM to 7PM)", "Unlimited Minutes + 20 Mb + 150 SMS ",
                "Rs. 10.00 ", "*340#", "*340*4#", "*340*2#"));

        packages.add(new Packages("Super Bundle (JAZZ + WARID)", "Till Midnight Same Day", "250 Jazz + Warid Minutes ",
                "Rs. 14.00 ", "*212#", "*212*4#", "*212*2#"));

        packages.add(new Packages("Monthly Hybrid Offer (Jazz + Warid)", "30 Days", "6000 (200 Mins/day) + 600 MBs(3G) + 6000SMSs",
                "Rs. 370.00 ", "*430#", "*430*4#", "*430*2#"));

        packages.add(new Packages("3 Day Bundle", "Next 48 Hours", "500 Minutes",
                "Rs. 36.00 ", "*211#", "*211*4#", "*211*2#"));

        packages.add(new Packages("Har Din Budle", "1 Day ", "500 Minutes + 50 Mbs",
                "Rs. 21.51 ", "*114*4#", "*114*4*4#", "*114*4*2#"));

        packages.add(new Packages("12 Ghanty Offer", "12AM to 12PM", "250 Minutes (On-net)",
                "Rs. 6.00 ", "*281#", "*281*4#", "*281*2#"));

        packages.add(new Packages("Day Bundle", "12AM to 7PM", "Unlimited Minutes (On-net) + 150SMS + 20Mbs",
                "Rs. 10.00 (Including Tax)", "*340#", "*340*4#", "*340*2#"));

        packages.add(new Packages("Super FnF Offer", "1 Day", "On-Net Calls & SMS, Free for 1 FnF No.",
                "Rs. 10.00 (Including Tax) ", "*141*Number#", "N/A", "*141*2#"));

        packages.add(new Packages("LBC KPK", "Same Day Mid-Night", "Unlimited Jazz+Warid Minutes + 100MBs",
                "Rs. 9.99 (Including Tax)", "*291#", "*291*4#", "*204*4#"));

        packages.add(new Packages("Apna Sehar Offer", "Same Day Mid-Night", "Unlimited Jazz Minutes + 1000 SMS + 100MBs",
                "Rs. 9.99 (Including Tax)", "*229#", "*229*4#", "*204*4#"));

        packages.add(new Packages("Punjab Offer", "Same Day Mid-Night", "100 Minutes (On-Net) ",
                "Rs. 7.20 (Including Tax) ", "*6000#", "N/A", "*6000*2#"));

        packages.add(new Packages("Sindh Offer", "Same Day Mid-Night", "200 Minutes (On-Net) ",
                "Rs. 7.00 (Including Tax) ", "*522#", "N/A", "*522*2#"));

        packages.add(new Packages("Supreme Offer", "X + 29 Days", "1000 (on-net) & 100 (off-net) Minutes + 1000SMS + 100Mbs",
                "Rs. 299.00 (Including Tax) ", "*3500#", "N/A", "N/A"));

        packages.add(new Packages("Weekly All Network Offer", "7 Days", "700 Jazz+Warid Minutes + 700 SMS + 250Mbs + 50 Mins (off-net)",
                "Rs. 120.00 (Including Tax)", "*700#", "*700*4#", "*700*2#"));

        packages.add(new Packages("Weekly Super Duper Offer", "7 Days", "1000Mbs + 1000 Jazz + Warid Minutes + 1000SMS",
                "Rs. 150.00 (Including Tax)", "*770#", "*770*4#", "*770*2#"));

        packages.add(new Packages("Har 30 Seconds", "30 Days", "Rs. 0.78/30 Sec",
                "Rs. 6.00 (Including Tax)", "*750#", "*750*4#", "*750*2#"));


        packages.add(new Packages("Jazz Gold Monthly Offer", "30 Days", "1800 Jazz+Warid Minutes + 1800 SMS + 1800MBs + 180 Mins (Off-net)",
                "Rs. 590.00 (Including Tax)", "*707#", "*707*4#", "*707*2#"));


        packages.add(new Packages("Super Duper Monthly Offer", "30 Days", "1200 Jazz+Warid Minutes + 1200 SMS + 1000MBs + 100 Mins (Off-net)",
                "Rs. 380.00 (Including Tax)", "*706#", "*706*4#", "*706*2#"));

        packages.add(new Packages("Monthly All Rounder Offer", "30 Days", "200 Minutes (All Networks) + 5000Mbs + 200 SMS",
                "Rs. 499.00 (Including Tax)", "*2000#", "N/A", "N/A"));

        packages.add(new Packages("Haftawar Offer", "7 Days", "700 Jazz+Warid Minutes + 700 SMS + 70MBs",
                "Rs. 75.00 (Including Tax)", "*407#", "*407*4#", "*407*2#"));

        PackagesAdapter packagesAdapter = new PackagesAdapter(getActivity(), packages);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(packagesAdapter);


        return rootView;
    }

}
