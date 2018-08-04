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
public class UfoneAIO extends Fragment {


    public UfoneAIO() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.packages_list,container,false);

        ArrayList<Packages> packages = new ArrayList<Packages>();


        packages.add(new Packages("SIM Lagao Offer".toUpperCase()
                , "30 Days",
                "3000 U2U & PTCL Minutes + 3000MBs  + 3000 SMS",
                "Customers who have not used their SIM for over 60 days can avail this offer "
                , "*5000#",
                "N/A",
                "N/A"));

        packages.add(new Packages("Nayi Sim Double Offer (Rs. 520)".toUpperCase()
                , "30 Days",
                "2000 On-net + PTCL & 300 Off-net Minutes + 2400Mbs + 8000 SMS",
                "On recharge of Super Card (Rs. 520.00)"
                , "*141#",
                "N/A",
                "*706#"));

        packages.add(new Packages("Nayi Sim Double Offer (Rs. 599)".toUpperCase()
                , "30 Days",
                "2400 On-net + PTCL & 360 Off-net Minutes + 3000Mbs + 8400 SMS",
                "On recharge of Super Card (Rs. 599.00)"
                , "*141#",
                "N/A",
                "*706#"));

        packages.add(new Packages("Nayi SIM Offer".toUpperCase()
                , "30 Days",
                "500 On-net + 25 Off-net Minutes + 1000MBs + 500 SMS",
                "Upon Recharge Of Rs. 50.00"
                , "*1000#",
                "N/A",
                "N/A"));

        packages.add(new Packages("Combo Pack".toUpperCase()
                , "15 Days",
                " 50 Mniutes(all networks) + 3000 MBs",
                "Rs. 200.00 "
                , "*15#",
                "N/A",
                "N/A"));

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

        PackagesAdapter packagesAdapter = new PackagesAdapter(getActivity(),packages);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(packagesAdapter);


        return rootView;
    }

}
