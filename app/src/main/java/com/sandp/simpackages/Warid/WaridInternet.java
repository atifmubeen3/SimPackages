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
public class WaridInternet extends Fragment {


    public WaridInternet() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.packages_list,container,false);

        ArrayList<Packages> packages = new ArrayList<Packages>();

        packages.add(new Packages("Daily Social Bundle",
                "1 Day",
                "50 Mb For Whatsapp & Facebook",
                "Rs. 5.00" ,
                "*114*5#",
                "N/A",
                "*114*5*2#"));

        packages.add(new Packages("Daily Browser",
                "1 Day",
                "50 MB ",
                "Rs. 12.00" ,
                "*117*11#",
                "N/A",
                "*117*11*2#"));

        packages.add(new Packages("Haftawar Internet Offer",
                "7 Day",
                "2000 MBs",
                "Rs. 120.00" ,
                "*117*99#",
                "N/A",
                "*117*99*2#"));

        packages.add(new Packages("Weekly Streamer",
                "7 Days",
                "700Mb + 200MB (Whatsapp & Facebook)",
                "Rs. 80.00" ,
                "*117*7#",
                "N/A",
                "*117*7*2#"));

        packages.add(new Packages("Weekly Extreme(2AM to 2PM)",
                "7 Days",
                "2500 Mbs",
                "Rs. 70.00" ,
                "*117*14#",
                "N/A",
                "*117*14*2#"));

        packages.add(new Packages("Weekly Premium 1500 MB",
                "7 Days",
                "1500 Mbs",
                "Rs. 110.00" ,
                "*117*47#",
                "N/A",
                "*117*47*2#"));

        packages.add(new Packages("Monthly Browser",
                "30 Days",
                "1500 MBs",
                "Rs. 160.00" ,
                "*117*77#",
                "N/A",
                "*117*77*2#"));

        packages.add(new Packages("Late Night Internet Offer",
                "3 Days",
                "500 Mb (2:00 Am to 8:00AM)",
                "Rs. 15.00" ,
                "*114*14#",
                "N/A",
                "*114*14*2#"));

        packages.add(new Packages("3 Day Lite",
                "3 Days",
                "100 Mbs",
                "Rs. 20.00" ,
                "*117*1#",
                "N/A",
                "*117*1*2#"));

        packages.add(new Packages("Weekly Lite",
                "7 Days",
                "300 Mbs",
                "Rs. 50.00" ,
                "*117*3#",
                "N/A",
                "*117*3*2#"));

        packages.add(new Packages("Monthly Lite",
                "30 Days",
                "3 GBs",
                "Rs. 250.00" ,
                "*117*31#",
                "N/A",
                "*117*31*2#"));

        PackagesAdapter packagesAdapter = new PackagesAdapter(getActivity(),packages);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(packagesAdapter);


        return rootView;
    }

}
