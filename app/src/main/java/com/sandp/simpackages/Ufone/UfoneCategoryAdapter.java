package com.sandp.simpackages.Ufone;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.sandp.simpackages.R;
import com.sandp.simpackages.Telenor.TelenorCall;
import com.sandp.simpackages.Telenor.TelenorInternet;
import com.sandp.simpackages.Telenor.TelenorSms;

public class UfoneCategoryAdapter extends FragmentPagerAdapter {

    Context context;

    public UfoneCategoryAdapter (Context context,FragmentManager fm){
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0 ){
            return new UfoneCall();
        }
        else if(position == 1){
            return new UfoneSms();
        }
        else if(position == 2){
            return new UfoneInternet();
        }
        else {
            return new UfoneAIO();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0 ){
            return context.getString(R.string.ufone_call);
        }
        else if(position == 1){
            return context.getString(R.string.ufone_sms);
        }
        else if(position == 2) {
            return "Internet Packages";
        }
        else {
            return "Hybrid Packages";
        }
    }
}
