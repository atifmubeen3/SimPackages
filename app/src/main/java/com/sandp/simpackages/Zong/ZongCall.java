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
public class ZongCall extends Fragment {


    public ZongCall() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.packages_list,container,false);

        ArrayList<Packages> packages = new ArrayList<Packages>();


        packages.add(new Packages("Zong Unlimited Offer (Daily)".toUpperCase(),
                "Till Midnight",
                "Unlimited On-net MInutes",
                "Rs. 12.00" ,
                "*522#",
                "N/A",
                "N/A"));

        packages.add(new Packages("Zong Unlimited Offer".toUpperCase(),
                "7 Days",
                "Unlimited On-net MInutes",
                "Rs. 63.00" ,
                "Send \"PK7\" to 522",
                "N/A",
                "N/A"));

        packages.add(new Packages("Zong Unlimited Offer".toUpperCase(),
                "30 Days",
                "Unlimited On-net MInutes",
                "Rs. 255.00" ,
                "Send \"PK30\" to 522",
                "N/A",
                "N/A"));

        packages.add(new Packages("Supreme Offer".toUpperCase(),
                "30 Days",
                "4000 On-net + 300 off-net Minutes + 4000 SMS + 4000 MB + 4 GB Whatsapp",
                "Rs. 800" ,
                "*3030#",
                "N/A",
                "N/A"));

        packages.add(new Packages("Supreme Plus New".toUpperCase(),
                "30 Days",
                "10,000 On-net + 600 off-net Minutes + 10,000 SMS + 10,000 MB + 4 GB Whatsapp",
                "Rs. 1300" ,
                "*1500#",
                "N/A",
                "N/A"));

        packages.add(new Packages("Combo Pack".toUpperCase()
                , "15 Days",
                " 50 Mniutes(all networks) + 3000 MBs",
                "Rs. 200.00 "
                , "*15#",
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


        packages.add(new Packages("Super Student Bundle".toUpperCase(),
                "2 Hours",
                "Unlimited On-net Minutes + 30 MB ",
                "Rs. 5.00" ,
                "*5555#",
                "N/A",
                "N/A"));

        PackagesAdapter packagesAdapter = new PackagesAdapter(getActivity(),packages);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(packagesAdapter);


        return rootView;
    }

}
