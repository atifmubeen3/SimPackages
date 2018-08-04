package com.sandp.simpackages.Ufone;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sandp.simpackages.Mobilink.MobilinkCategoryAdapter;
import com.sandp.simpackages.R;

public class Ufone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ufone);


        ViewPager viewPager = (ViewPager) findViewById(R.id.ufone_view_pager);

        UfoneCategoryAdapter adapter = new UfoneCategoryAdapter(this,getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.ufone_tabs);

        tabLayout.setupWithViewPager(viewPager);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
