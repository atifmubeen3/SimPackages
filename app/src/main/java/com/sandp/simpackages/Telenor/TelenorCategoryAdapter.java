package com.sandp.simpackages.Telenor;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.sandp.simpackages.Mobilink.MobilinkCall;
import com.sandp.simpackages.Mobilink.MobilinkInternet;
import com.sandp.simpackages.Mobilink.MobilinkSms;
import com.sandp.simpackages.R;

public class TelenorCategoryAdapter extends FragmentPagerAdapter {

    Context context;

    public TelenorCategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new TelenorCall();
        } else if (position == 1) {
            return new TelenorSms();
        } else if (position == 2) {
            return new TelenorInternet();
        } else {
            return new TelenorAIO();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.telenor_call);
        } else if (position == 1) {
            return context.getString(R.string.telenor_sms);
        } else if (position == 2) {
            return "Internet Packages";}
        else{
                return "Hybrid Packages";
            }
        }
    }
