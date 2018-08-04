package com.sandp.simpackages.Ufone;


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
public class UfoneCall extends Fragment {


    public UfoneCall() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.packages_list,container,false);

        ArrayList<Packages> packages = new ArrayList<Packages>();


        packages.add(new Packages("3 Pe 3 Offer".toUpperCase(),
                "2 Hours except (5PM to 9PM)",
                "Unlimited Ufone PTCL & Vfone Minutes",
                "Rs. 5.00 (Including Tax)" ,
                "*343#",
                "N/A"
                ,"N/A"));

        packages.add(new Packages("Beyhisaab Offer".toUpperCase(),
                "1 Day",
                "Unlimited Ufone PTCL & Vfone Minutes",
                "Rs. 10.00 (Including Tax)" ,
                "*5700#",
                "N/A"
                ,"N/A"));
        packages.add(new Packages("Power Hour".toUpperCase()
                , "1 Hour",
                "60 Ufone, PTCL & VFone Minutes + 60 MBs + 60 SMS ",
                "Rs. 7.17 (Tax Included)"
                , "*99#",
                "N/A",
                "N/A"));

        packages.add(new Packages("Asli Chappar Phaar Offer".toUpperCase()
                , "7 Days",
                "100 On-net Minutes + 100 SMS + 1000MBs ",
                "Rs. 80.00 (Tax Included)"
                , "*5050#",
                "N/A",
                "N/A"));

        packages.add(new Packages("Daily Pakistan Offer".toUpperCase()
                , "1 Day",
                " 100 On-net Mniutes + 10 MBs",
                "Rs. 18.00 (Tax Included)"
                , "*888#",
                "*8880#",
                "N/A"));

        packages.add(new Packages("Weekly Pakistan Offer".toUpperCase()
                , "7 Days",
                " 700 On-net Mniutes + 100 MBs",
                "Rs. 100.00 (Tax Included)"
                , "*8888#",
                "*8880#",
                "N/A"));

        packages.add(new Packages("Monthly Pakistan Offer".toUpperCase()
                , "30 Days",
                " 4000 On-net Mniutes + 400 MBs",
                "Rs. 418.00 (Tax Included)"
                , "*8888#",
                "*8880#",
                "N/A"));





        PackagesAdapter packagesAdapter = new PackagesAdapter(getActivity(),packages);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(packagesAdapter);


        return rootView;
    }

}
