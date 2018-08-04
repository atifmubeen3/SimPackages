package com.sandp.simpackages.Warid;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sandp.simpackages.Mobilink.MobilinkCategoryAdapter;
import com.sandp.simpackages.R;

public class Warid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warid);


        ViewPager viewPager = (ViewPager) findViewById(R.id.warid_view_pager);

        MobilinkCategoryAdapter adapter = new MobilinkCategoryAdapter(this,getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.warid_tabs);

        tabLayout.setupWithViewPager(viewPager);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
