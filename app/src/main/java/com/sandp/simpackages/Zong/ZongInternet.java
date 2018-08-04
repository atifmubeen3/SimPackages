package com.sandp.simpackages.Zong;


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
public class ZongInternet extends Fragment {


    public ZongInternet() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.packages_list,container,false);

        ArrayList<Packages> packages = new ArrayList<Packages>();


        packages.add(new Packages("Daily Basic".toUpperCase(),
                "1 Day",
                "100 MB",
                "Rs. 15.00" ,
                "*6464#",
                "N/A",
                "*102#"));

        packages.add(new Packages("Daily Data Max".toUpperCase(),
                "1 Day",
                "500 MB",
                "Rs. 35.00" ,
                "*6464#",
                "N/A",
                "*102#"));

        packages.add(new Packages("Good Night Offer".toUpperCase(),
                "1 Day",
                "2.5 GB (1AM to 9AM)",
                "Rs. 14.5/day" ,
                "SMS \"gno\" to 6464",
                "SMS \"unsub gno\" to 6464",
                "*102#"));

        packages.add(new Packages("Daytime Offer".toUpperCase(),
                "1 Day",
                "1200 MB",
                "Rs. 16/Day" ,
                "SMS \"dto\" to 6464",
                "SMS \"unsub dto\" to 6464",
                "*102#"));

        packages.add(new Packages("Super Student Bundle".toUpperCase(),
                "2 Hours",
                "Unlimited On-net Minutes + 30 MB ",
                "Rs. 5.00" ,
                "*5555#",
                "N/A",
                "N/A"));

        packages.add(new Packages("Super Weekly".toUpperCase(),
                "7 Days",
                "2.5 GB",
                "Rs. 120" ,
                "*6464#",
                "N/A",
                "*102#"));

        packages.add(new Packages("Super Weekly Plus".toUpperCase(),
                "7 Days",
                "5 GB",
                "Rs. 156.00" ,
                "*20#",
                "N/A",
                "*102#"));

        packages.add(new Packages("Monthly Mini 150".toUpperCase(),
                "30 Days",
                "150 MB",
                "Rs. 50.00" ,
                "*6464#",
                "N/A",
                "*102#"));

        packages.add(new Packages("Monthly Basic 500".toUpperCase(),
                "30 Days",
                "500 MB",
                "Rs. 150.00" ,
                "*6464#",
                "N/A",
                "*102#"));

        packages.add(new Packages("Monthly Premium 3GB".toUpperCase(),
                "30 Days",
                "3 GB",
                "Rs. 300.00" ,
                "*6464#",
                "N/A",
                "*102#"));

        packages.add(new Packages("Monthly Premium 12GB".toUpperCase(),
                "30 Days",
                "12GB + free nights (1GB FUP) 1am to 9am/Daily",
                "Rs. 717.00" ,
                "*6464#",
                "N/A",
                "*102#"));






        PackagesAdapter packagesAdapter = new PackagesAdapter(getActivity(),packages);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(packagesAdapter);


        return rootView;
    }

}
