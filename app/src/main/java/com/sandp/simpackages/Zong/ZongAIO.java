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
public class ZongAIO extends Fragment {


    public ZongAIO() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.packages_list,container,false);

        ArrayList<Packages> packages = new ArrayList<Packages>();


        packages.add(new Packages("SIM Lagao Offer".toUpperCase()
                , "60 Days",
                "6000 Zong Minutes + 6000MBs  + 6000 SMS",
                "Customers who have not used their SIM for over 30 days can avail this offer Recharge Rs. 50.00 or more "
                , "*2244#",
                "N/A",
                "N/A"));


        packages.add(new Packages("Haftawar Load Offer".toUpperCase(),
                "7 Days",
                "1500 on-net + 100 off-net Minutes + 1500 MBs + 1500 SMSs",
                "Rs. 250.00" ,
                "*70#",
                "SMS Unsub weekly250 to 6464",
                "N/A"));

        packages.add(new Packages("All In One Weekly".toUpperCase(),
                "7 Days",
                "500 on-net + 40 off-net Minutes + 500 MBs + 500 SMS",
                "Rs. 150.00" ,
                "SMS weekly150 to 6464",
                "SMS Unsub weekly150 to 6464",
                "N/A"));

        packages.add(new Packages("All In One Monthly".toUpperCase(),
                "30 Days",
                "1500 on-net + 150 off-net Minutes + 1500 MBs + 1500 SMS",
                "Rs. 384.70" ,
                "SMS Monthly500 to 6464",
                "SMS Unsub Monthly500 to 6464",
                "N/A"));

        packages.add(new Packages("Super Student Bundle".toUpperCase(),
                "2 Hours",
                "Unlimited On-net Minutes + 30 MB ",
                "Rs. 5.00" ,
                "*5555#",
                "N/A",
                "N/A"));

        packages.add(new Packages("Shandaar Offer".toUpperCase(),
                "1 Day",
                "Unlimited on-net Minutes + 800 SMS + 50 MB",
                "Rs. 10" ,
                "*999#",
                "N/A",
                "N/A"));

        packages.add(new Packages("Shandaar Haftawaar Offer".toUpperCase(),
                "7 Days",
                "500 On-net + 40 off-net Minutes + 500 SMS + 500 MB",
                "Rs. 90.00" ,
                "*7#",
                "N/A",
                "N/A"));

        packages.add(new Packages("Shandaar Mahana Offer".toUpperCase(),
                "30 Days",
                "1000 On-net + 100 off-net Minutes + 1000 SMS + 1000 MB",
                "Rs. 300.00" ,
                "*1000#",
                "Send “unsub Mahana” to 7091",
                "N/A"));



        PackagesAdapter packagesAdapter = new PackagesAdapter(getActivity(),packages);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(packagesAdapter);


        return rootView;
    }

}
