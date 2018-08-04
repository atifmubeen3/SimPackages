package com.sandp.simpackages.Zong;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sandp.simpackages.Mobilink.MobilinkCategoryAdapter;
import com.sandp.simpackages.R;

public class Zong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zong);


        ViewPager viewPager = (ViewPager) findViewById(R.id.zong_view_pager);

        ZongCategoryAdapter adapter = new ZongCategoryAdapter(this,getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.zong_tabs);

        tabLayout.setupWithViewPager(viewPager);
    }    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
