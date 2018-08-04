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
public class TelenorSms extends Fragment {


    public TelenorSms() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.packages_list,container,false);

        ArrayList<Packages> packages = new ArrayList<Packages>();


        packages.add(new Packages("Daily SMS Bundle (TalkShawk)".toUpperCase(),
                "1 Day",
                "200 + 40 SMS",
                "Rs. 4.00" ,
                "*345*116#",
                "N/A",
                "*111#"));
        packages.add(new Packages("5 Day SMS Bundle (TalkShawk)".toUpperCase(),
                "5 Days",
                "300 SMS",
                "Rs. 7.00" ,
                "*345*015#",
                "N/A",
                "*111#"));
        packages.add(new Packages("Weekly SMS Bundle (TalkShawk)".toUpperCase(),
                "7 Days",
                "1200 SMS",
                "Rs. 11.00" ,
                "*345*117#",
                "N/A",
                "*111#"));
        packages.add(new Packages("15 Day Economy SMS Bundle (TalkShawk)".toUpperCase(),
                "15 Days",
                "200 SMS",
                "Rs. 4.00" ,
                "*345*112#",
                "N/A",
                "*111#"));
        packages.add(new Packages("Monthly SMS Bundle (TalkShawk)".toUpperCase(),
                "30 Days",
                "6000 SMS",
                "Rs. 40.00" ,
                "*345*363#",
                "N/A",
                "*111#"));
        packages.add(new Packages("Daily SMS Bundle (Djuice)".toUpperCase(),
                "10 Day",
                "300 SMS",
                "Rs. 2.00" ,
                "*2*2*1#",
                "N/A",
                "*111#"));
        packages.add(new Packages("Weekly SMS Bundle (Djuice)".toUpperCase(),
                "7 Days",
                "1200 SMS",
                "Rs. 10.00" ,
                "*2*2*2#",
                "N/A",
                "*111#"));
        packages.add(new Packages("15 Day SMS Bundle (Djuice)".toUpperCase(),
                "15 Days",
                "3500 SMS + 200 Mb Whatsapp",
                "Rs. 35.00" ,
                "*2*2*5#",
                "N/A",
                "*111#"));
        packages.add(new Packages("Monthly SMS Bundle (Djuice)".toUpperCase(),
                "30 Days",
                "10,000 SMS",
                "Rs. 40.00" ,
                "*2*2*3#",
                "N/A",
                "*111#"));
        packages.add(new Packages("SMS Minutes Bundle (Djuice)".toUpperCase(),
                "30 Days",
                "700 SMS + 12 Telenor Minutes",
                "Rs. 11.95" ,
                "*345*105#",
                "N/A",
                "*222#"));


        PackagesAdapter packagesAdapter = new PackagesAdapter(getActivity(),packages);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(packagesAdapter);


        return rootView;
    }

}
