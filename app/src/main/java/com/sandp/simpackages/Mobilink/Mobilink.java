package com.sandp.simpackages.Mobilink;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sandp.simpackages.R;

public class Mobilink extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobilink);

        ViewPager viewPager = (ViewPager) findViewById(R.id.mobilink_view_pager);

        MobilinkCategoryAdapter adapter = new MobilinkCategoryAdapter(this,getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.mobilink_tabs);

        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
