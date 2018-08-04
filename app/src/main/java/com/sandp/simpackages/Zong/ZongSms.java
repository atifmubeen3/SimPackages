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
public class ZongSms extends Fragment {


    public ZongSms() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.packages_list,container,false);

        ArrayList<Packages> packages = new ArrayList<Packages>();

        packages.add(new Packages("Daily SMS + WhatsApp Bundle".toUpperCase(),
                "Midnight same day",
                "500 SMS + 100 MMS + 30 Mb Whatsapp/Day",
                "Rs. 3.99" ,
                "*700# and reply with 1 ",
                "Send 'unsubscribe' or 'unsub' to 700",
                "*202*2#"));

        packages.add(new Packages("Zulu SMS Bundle".toUpperCase(),
                "Midnight same day",
                "500 SMS",
                "Rs. 2.50" ,
                "704#",
                "Send 'unsub' to 704 ",
                "*202*2#"));

        packages.add(new Packages("Weekly SMS Bundle".toUpperCase(),
                "7 Days",
                "1500 SMS + 200 Mb Whatsapp",
                "Rs. 17.00" ,
                "*702#",
                "Send 'unsubscribe' or 'unsub' to 700 ",
                "*202*2#"));

        packages.add(new Packages("Monthly SMS + Whatsapp Bundle".toUpperCase(),
                "30 Days + 30 MB Whatsapp/day for 30 days",
                "500 SMS/Day",
                "Rs. 50.00" ,
                "*705#",
                "Send 'unsubscribe' or 'unsub' to 700 ",
                "*202*2#"));




        PackagesAdapter packagesAdapter = new PackagesAdapter(getActivity(),packages);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(packagesAdapter);


        return rootView;
    }

}
