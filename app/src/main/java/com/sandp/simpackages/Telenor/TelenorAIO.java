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
public class TelenorAIO extends Fragment {


    public TelenorAIO() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.packages_list,container,false);

        ArrayList<Packages> packages = new ArrayList<Packages>();


        packages.add(new Packages("Lagatar Calls Offer (Talkshawk)".toUpperCase(),
                "1 Day",
                "Unlimited On-net Minutes + 60 Mb",
                "Rs. 13.00" ,
                "*556#",
                "N/A",
                "*N/A"));
        packages.add(new Packages("3 Day ALL In One Offer (Talkshawk)".toUpperCase(),
                "7 Days",
                "150 On-net Minutes + 150 SMS + 150 MBs",
                "Rs. 30.00" ,
                "*345*210#",
                "N/A",
                "*N/A"));
        packages.add(new Packages("Haftawar Sahulat OFFER (Talkshawk)".toUpperCase(),
                "7 Days",
                "70 Off-net + 1000 On-net Minutes + 700 SMS + 100 MBs + 350 MB Social Pack",
                "Rs. 95.00" ,
                "*5*7#",
                "N/A",
                "*N/A"));
        packages.add(new Packages("3 DIN SAHULAT OFFER (Talkshawk)".toUpperCase(),
                "3 Days",
                "25 Off-net + 250 On-net Minutes + 250 SMS + 50 MBs + 100 Mb Social Pack ",
                "Rs. 30.00" ,
                "*5*3#",
                "N/A",
                "*N/A"));
        packages.add(new Packages("Telenor Easy Card (Talkshawk)".toUpperCase(),
                "30 Day",
                "150 Off-net + 1500 On-net + 500 PTCL Minutes + 2000 SMS + 2000 MBs",
                "Rs. 600.00" ,
                "Telenor Easy Card",
                "N/A",
                "*N/A"));
        packages.add(new Packages("Telenor 3/3 OFFER (Talkshawk)".toUpperCase(),
                "3 Days",
                "600 On-net Minutes + 300 SMS + 50 MBs",
                "Rs. 36.00" ,
                "*345*243#",
                "N/A",
                "*N/A"));
        packages.add(new Packages("Haftwar Chappar Phar Offer (Talkshawk + Djuice)".toUpperCase(),
                "7 Days",
                "1200 + 800 On-net Minutes",
                "Rs. 50.00" ,
                "Offer can only be activated through the website and My Telenor App.",
                "N/A",
                "*N/A"));
        packages.add(new Packages("TELENOR MAHANA RAKHWALA OFFER (Talkshawk)".toUpperCase(),
                "30 Days",
                "3000 On-net Minutes (100/day) + 3000 SMS + 300 MBs",
                "Rs. 418.00" ,
                "*345*30#",
                "N/A",
                "*N/A"));
        packages.add(new Packages("7 DAY MINI BUDGET OFFER OFFER (Talkshawk)".toUpperCase(),
                "7 Days",
                "500 On-net Minutes + 1000 SMS + 50 MBs",
                "Rs. 86.00" ,
                "*345*247#",
                "N/A",
                "*N/A"));
        packages.add(new Packages("00 MINUTES MINI BUDGET OFFER (Talkshawk)".toUpperCase(),
                "1 Day",
                "100 On-net Minutes + 300 SMS",
                "Rs. 18.00" ,
                "*050#",
                "N/A",
                "*N/A"));
        packages.add(new Packages("50 MINUTES MINI BUDGET OFFER (Talkshawk)".toUpperCase(),
                "1 Day",
                "50 On-net Minutes + 300 SMS + 4 MB",
                "Rs. 418.00" ,
                "*240#",
                "N/A",
                "*N/A"));
        packages.add(new Packages("WEEKLY INTERNET ALL IN ONE OFFER (Djuice))".toUpperCase(),
                "7 Days",
                "100 Minutes For All Networks + 100 SMS + 1500 MBs",
                "Rs. 100.00" ,
                "*345*75#",
                "N/A",
                "200# For Minutes \n *999# For MBs"));
        packages.add(new Packages("MONTHLY ALL IN ONE OFFER (Djuice)".toUpperCase(),
                "30 Days",
                "150 Minutes For All Networks + 150 SMS + 5000MB",
                "Rs. 350.00" ,
                "*345*246#",
                "N/A",
                "*200# For Minutes \n *999# For MBs"));

        packages.add(new Packages("WEEKLY PLUS OFFER (Djuice)".toUpperCase(),
                "7 Days",
                "150 Telenor minutes and Rs.50 for all network calls and SMS + 3500 MBs",
                "Rs. 160.00" ,
                "*345*88#",
                "N/A",
                "*200# For Minutes \n *999# For MBs"));

        packages.add(new Packages("ALL IN ONE OFFER (Djuice)".toUpperCase(),
                "3 Days",
                "Rs 75 Balance for All Network Calls & SMS + 500 MB",
                "Rs. 50.00" ,
                "2*20#",
                "N/A",
                "*200# For Minutes \n *999# For MBs"));

        packages.add(new Packages("3 DAY ONNET OFFER (Djuice)".toUpperCase(),
                "3 Days",
                "250 Telenor Minutes + 500 SMS + 15 MB (3G)",
                "Rs. 30.00" ,
                "*730#",
                "N/A",
                "N/A"));

        packages.add(new Packages("DAILY 3 KA SCENE OFFER (Djuice)".toUpperCase(),
                "1 Day",
                "Free onnet FNF calls + 200 SMS + 5 MBs",
                "Rs. 13.00" ,
                "*345*031#",
                "N/A",
                "N/A"));

        packages.add(new Packages("3 DAY 3 KA SCENE OFFER (Djuice)".toUpperCase(),
                "3 Days",
                "Free on-net FNF calls + 500 SMS + 50 MBs",
                "Rs. 34.00" ,
                "*030#",
                "N/A",
                "N/A"));

        packages.add(new Packages("KARACHI OFFER (Djuice)".toUpperCase(),
                "1 Days",
                "Unlimited On-net Minutes + 1000 SMS",
                "Rs. 10.00" ,
                "*345**21#",
                "N/A",
                "N/A"));

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
