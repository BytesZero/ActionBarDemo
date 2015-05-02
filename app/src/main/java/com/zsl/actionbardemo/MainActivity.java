package com.zsl.actionbardemo;

import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //  获得ActionBar
        ActionBar actionBar = getSupportActionBar();
        //隐藏ActionBar
        actionBar.show();

        Drawable drawable=getResources().getDrawable(R.drawable.actionbar_bg);
        //设置ActionBar的背景
        actionBar.setBackgroundDrawable(drawable);

    }

}
