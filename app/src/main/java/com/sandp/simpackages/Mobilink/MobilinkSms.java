package com.sandp.simpackages.Mobilink;


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
public class MobilinkSms extends Fragment {


    public MobilinkSms() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.packages_list,container,false);

        ArrayList<Packages> packages = new ArrayList<Packages>();




        packages.add(new Packages("SMS Plus", "1 Day", "150 SMS",
                "Rs. 2.38(+tax)" , "**106*4#",  "*106*4#","*106*2#"));

        packages.add(new Packages("Daily Sms Bundle",
                "1 Day",
                "1200 SMS",
                "Rs. 4.77 (+tax)",
                "*101*1*01#",
                "*101*4*01#",
                "*101*2*01#"));
        packages.add(new Packages("Daily Sms + Whatsapp Bundle",
                "1 Day",
                "1500 SMS + 10 MB Whatsapp",
                "Rs. 5.98 (+tax)",
                "*334#",
                "*334*4#",
                "*334*2#"));
        packages.add(new Packages("Weekly Sms Bundle + Whatsapp",
                "7 Day",
                "1000 SMS + 25MB Whatsapp",
                "Rs. 13.13 (+tax)",
                "*101*1*07#",
                "*101*4*07#",
                "*101*2*07#"));
        packages.add(new Packages("Monthly Sms Bundle + Whatsapp",
                "1 Day",
                "10000 SMS + Unlimited Whatsapp",
                "Rs. 47.79 (+tax)",
                "*101*1*02#",
                "*101*4*02#",
                "*101*2*02#"));

        PackagesAdapter packagesAdapter = new PackagesAdapter(getActivity(),packages);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(packagesAdapter);
        return rootView;
    }

}
