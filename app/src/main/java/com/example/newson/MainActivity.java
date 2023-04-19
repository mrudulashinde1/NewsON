package com.example.newson;

import android.annotation.SuppressLint;


import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;



import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    TabItem mhome,mscience,mtechnology,mhealth,mentertainment,msports;
    PagerAdapter pagerAdapter;
    Toolbar mtoolbar;

    String api="0f352ccd14054013a180f123cbfdba5a";
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);




       // mtoolbar=findViewById(R.id.toolbar);
       //setSupportActionBar(mtoolbar);

     mhome=findViewById(R.id.home);
        mscience=findViewById(R.id.science);
        mtechnology=findViewById(R.id.technology);
        mhealth=findViewById(R.id.health);
        mentertainment=findViewById(R.id.entertainment);
        msports=findViewById(R.id.sports);
        ViewPager viewPager;
       viewPager = findViewById(R.id.fragmentContainer);
        tabLayout=findViewById(R.id.include);
        pagerAdapter=new PagerAdapter(getSupportFragmentManager(),6);
        viewPager.setAdapter(pagerAdapter);

       tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2||tab.getPosition()==3||tab.getPosition()==4||tab.getPosition()==5)
                {
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


    }
}



