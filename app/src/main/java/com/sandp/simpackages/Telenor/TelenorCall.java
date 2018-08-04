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
public class TelenorCall extends Fragment {


    public TelenorCall() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.packages_list,container,false);

        ArrayList<Packages> packages = new ArrayList<Packages>();



        packages.add(new Packages("Haftwar Chappar Phar Offer\n (Talkshawk + Djuice)".toUpperCase(),
                "7 Days",
                "1200 + 800 On-net Minutes",
                "Rs. 50.00" ,
                "Offer can only be activated through the website and My Telenor App.",
                "N/A",
                "N/A"));

        packages.add(new Packages("TELENOR 2 PAISA WEEKLY OFFER (Talkshawk)".toUpperCase(),
                "7 Days",
                " 2 paisa/sec for all network",
                "Rs. 4.78 (+tax)" ,
                "*345*227#",
                "N/A",
                "N/A"));

        packages.add(new Packages("3 DIN SAHULAT OFFER (Talkshawk)".toUpperCase(),
                "3 Days",
                "25 Off-net + 250 On-net Minutes + 250 SMS + 50 MBs + 100 Mb Social Pack ",
                "Rs. 30.00" ,
                "*5*3#",
                "N/A",
                "*N/A"));

        packages.add(new Packages("Haftawar Sahulat OFFER (Talkshawk)".toUpperCase(),
                "7 Days",
                "70 Off-net + 1000 On-net Minutes + 700 SMS + 100 MBs + 350 MB Social Pack",
                "Rs. 95.00" ,
                "*5*7#",
                "N/A",
                "*N/A"));

        packages.add(new Packages("TELENOR GOOD TIME OFFER (Talkshawk)".toUpperCase(),
                "2 Hours",
                "  Unlimited on-net Minutes + 250MB (Facebook)",
                "Rs. 6.00" ,
                "*345*20#",
                "N/A",
                "N/A"));

        packages.add(new Packages("TELENOR 2 PAISA DAILY (Talkshawk)".toUpperCase(),
                "1 Day",
                "Rs. 0.02/Sec (+ Tax)\n",
                "Rs. 1.20" ,
                "*020#",
                "N/A",
                "N/A"));

        packages.add(new Packages("3 DAY DIN BHAR OFFER (Talkshawk)".toUpperCase(),
                "3 Days",
                "6 AM to 6 PM free on-net calls )",
                "Rs. 24.50" ,
                "*345*626#",
                "N/A",
                "N/A"));

        packages.add(new Packages("3 DAY SUPER HIT (Talkshawk)".toUpperCase(),
                "3 Days",
                "Free on-net Calls Except 7pm to 10pm",
                "Rs. 34.00" ,
                "*345*299#",
                "N/A",
                "N/A"));

        packages.add(new Packages("TELENOR SUPERLOAD OFFER   (Talkshawk)".toUpperCase(),
                "Till Midnight",
                "20 Minutes For All Network Upon Recharge Of 100 Or More ",
                "Rs. 0.50" ,
                "*5*100#",
                "N/A",
                "N/A"));

        packages.add(new Packages("24 HR POORA PAKISTAN OFFER (Talkshawk)".toUpperCase(),
                "Till Midnight",
                "75 On-net Minutes",
                "Rs. 16.73" ,
                "*345*24#",
                "N/A",
                "N/A"));

        packages.add(new Packages("3 DAY ONNET OFFER (Djuice)".toUpperCase(),
                "3 Days",
                "250 Telenor Minutes + 500 SMS + 15 MB (3G)",
                "Rs. 30.00" ,
                "*730#",
                "N/A",
                "N/A"));

        packages.add(new Packages("DAILY HYBRID BUNDLE (Djuice)".toUpperCase(),
                "30 Days",
                "50 Telenor Minutes + 10 MB",
                "Rs. 10.00" ,
                "*345*700#",
                "N/A",
                "N/A"));

        packages.add(new Packages("DJUICE TEAM OFFER (Djuice)".toUpperCase(),
                "1 Day",
                "Unlimited djuice and on-net FNF calls + Unlimited Social Pack)",
                "Rs. 6.00+ Tax For First Call" ,
                "*345*11#",
                "N/A",
                "N/A"));


        PackagesAdapter packagesAdapter = new PackagesAdapter(getActivity(),packages);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(packagesAdapter);


        return rootView;
    }

}
