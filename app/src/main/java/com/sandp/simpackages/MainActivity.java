package com.sandp.simpackages;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.sandp.simpackages.Mobilink.Mobilink;
import com.sandp.simpackages.Telenor.Telenor;
import com.sandp.simpackages.Ufone.Ufone;
import com.sandp.simpackages.Warid.Warid;
import com.sandp.simpackages.Zong.Zong;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the view that shows the Telenor Activity
        ImageView telenor = (ImageView) findViewById(R.id.telenor);
        telenor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telenorIntent = new Intent(MainActivity.this, Telenor.class);
                startActivity(telenorIntent);
            }
        });

        //Find the view that shows the Mobilink Activity
        ImageView mobilink = (ImageView) findViewById(R.id.mobilink);
        mobilink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mobilinkIntent = new Intent(MainActivity.this, Mobilink.class);
                startActivity(mobilinkIntent);
            }
        });


        //Find the view that shows the Waridd Activity
        ImageView warid = (ImageView) findViewById(R.id.warid);
        warid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent waridIntent = new Intent(MainActivity.this, Warid.class);
                startActivity(waridIntent);
            }
        });

        //Find the view that shows the zong Activity
        ImageView zong = (ImageView) findViewById(R.id.zong);
        zong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent zongIntent = new Intent(MainActivity.this, Zong.class);
                startActivity(zongIntent);
            }
        });


        //Find the view that shows the Ufone Activity
        ImageView ufone = (ImageView) findViewById(R.id.ufone);
        ufone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ufoneIntent = new Intent(MainActivity.this, Ufone.class);
                startActivity(ufoneIntent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
