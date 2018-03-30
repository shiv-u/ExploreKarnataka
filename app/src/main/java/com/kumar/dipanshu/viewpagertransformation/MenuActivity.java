package com.kumar.dipanshu.viewpagertransformation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    private static int SPLASH_TIME_OUT = 4000;


    View zoomOut;

    Intent intent;
    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        new Handler().postDelayed(new Runnable (){

            @Override
            public void run() {
                intent = new Intent(MenuActivity.this, TransformationActivity.class);
                intent.putExtra(Constant.TRANSFORMATION, Constant.ZOOM_OUT_TRANSFORMATION);
                startActivity(intent);

                finish();

            }
        },SPLASH_TIME_OUT);




        //method where we initialise buttons
        intialiseButtons();

        //method where listner is attached to ezch buttons
        attachListner();

    }

    private void intialiseButtons() {

        zoomOut =  findViewById(R.id.zoomOutTransformation);

    }

    private void attachListner() {
        zoomOut.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.zoomOutTransformation:
                intent = new Intent(MenuActivity.this, TransformationActivity.class);
                intent.putExtra(Constant.TRANSFORMATION, Constant.ZOOM_OUT_TRANSFORMATION);
                startActivity(intent);
                break;
        }
    }

}
