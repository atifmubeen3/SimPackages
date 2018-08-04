package com.sandp.simpackages.Zong;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.sandp.simpackages.R;
import com.sandp.simpackages.Telenor.TelenorCall;
import com.sandp.simpackages.Telenor.TelenorInternet;
import com.sandp.simpackages.Telenor.TelenorSms;

public class ZongCategoryAdapter extends FragmentPagerAdapter {

    Context context;

    public ZongCategoryAdapter(Context context,FragmentManager fm){
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0 ){
            return new ZongCall();
        }
        else if(position == 1){
            return new ZongSms();
        }

        else if(position == 2){
            return new ZongInternet();
        }
        else {
            return new ZongAIO();
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
            return context.getString(R.string.zong_call);
        }
        else if(position == 1){
            return context.getString(R.string.zong_sms);
        }

        else if(position == 2){
            return context.getString(R.string.zong_internet);
        }
        else {
            return "Hybrid Packages";
        }
    }
}
