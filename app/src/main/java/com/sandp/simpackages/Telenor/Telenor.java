package com.sandp.simpackages.Telenor;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sandp.simpackages.Mobilink.MobilinkCategoryAdapter;
import com.sandp.simpackages.R;

public class Telenor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telnor);

        ViewPager viewPager = (ViewPager) findViewById(R.id.telenor_view_pager);

        TelenorCategoryAdapter adapter = new TelenorCategoryAdapter (this,getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.telenor_tabs);

        tabLayout.setupWithViewPager(viewPager);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
