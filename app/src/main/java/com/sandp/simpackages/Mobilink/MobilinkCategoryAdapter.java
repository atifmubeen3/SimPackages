package com.sandp.simpackages.Mobilink;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.sandp.simpackages.Mobilink.MobilinkCall;
import com.sandp.simpackages.Mobilink.MobilinkInternet;
import com.sandp.simpackages.Mobilink.MobilinkSms;
import com.sandp.simpackages.R;

public class MobilinkCategoryAdapter extends FragmentPagerAdapter {

    Context context;

    public MobilinkCategoryAdapter(Context context,FragmentManager fm){
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0 ){
            return new MobilinkCall();
        }
        else if(position == 1){
            return new MobilinkSms();
        }
        else if (position == 2) {
            return new MobilinkInternet();
        }
        else{
            return new MobilinkAIO();
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
            return context.getString(R.string.mobilink_call);
        }
        else if(position == 1){
            return context.getString(R.string.mobilink_sms);
        }
        else if (position == 2){
            return context.getString(R.string.mobilink_internet);
        }
        else {
            return "HYBRID PACKAGES";
        }
    }
}
