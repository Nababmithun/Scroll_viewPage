package com.androidlime.scroll_app;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;

import static com.androidlime.scroll_app.R.id.viwepagerid;

public class MainActivity extends FragmentActivity {


    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=findViewById(viwepagerid);


        FragmentManager fragmentManager=getSupportFragmentManager();

       CustompAdapter adapter=new CustompAdapter(fragmentManager);
        viewPager.setAdapter(adapter);
    }


    class CustompAdapter extends FragmentStatePagerAdapter{

        public CustompAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            Fragment fragment=null;

            if (position==0){
                fragment=new FirstOne();
            }
            else if (position==1){
                fragment=new Two();
            }
           else if (position==2){
                fragment=new Three();
            }
            else if (position==3){
                fragment=new Four();
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return 4;
        }


        @Override
        public CharSequence getPageTitle(int position) {


            if (position==0)
            {
                return "Tab 1";
            }

           else if (position==1)
            {
                return "Tab 2";

            }

           else if (position==2)
            {
                return "Tab 3";
            }
            else if (position==3)
            {
                return "Tab 4";
            }
            return null;
        }
    }
}


