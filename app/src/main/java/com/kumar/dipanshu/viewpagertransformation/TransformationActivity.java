package com.kumar.dipanshu.viewpagertransformation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.kumar.dipanshu.viewpagertransformation.Fragments.EighthFragment;
import com.kumar.dipanshu.viewpagertransformation.Fragments.FifthFragment;
import com.kumar.dipanshu.viewpagertransformation.Fragments.FirstFragment;
import com.kumar.dipanshu.viewpagertransformation.Fragments.FourthFragment;
import com.kumar.dipanshu.viewpagertransformation.Fragments.NinthFragment;
import com.kumar.dipanshu.viewpagertransformation.Fragments.SecondFragment;
import com.kumar.dipanshu.viewpagertransformation.Fragments.SeventhFragment;
import com.kumar.dipanshu.viewpagertransformation.Fragments.SixthFragment;
import com.kumar.dipanshu.viewpagertransformation.Fragments.TenthFragment;
import com.kumar.dipanshu.viewpagertransformation.Fragments.ThirdFragment;
import com.kumar.dipanshu.viewpagertransformation.Transformations.ZoomOutTransformation;

public class TransformationActivity extends AppCompatActivity {

    ViewPager viewPager;
    MyPagerAdapter pagerAdapter;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transformation);

        viewPager = (ViewPager) findViewById(R.id.viewPager);

        pagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        addingFragmentsTOpagerAdapter();
        viewPager.setAdapter(pagerAdapter);

        ZoomOutTransformation zoomOutTransformation = new ZoomOutTransformation();



        intent = getIntent();
        String transformation = intent.getStringExtra(Constant.TRANSFORMATION);


        switch (transformation) {

            case Constant.ZOOM_OUT_TRANSFORMATION:
                viewPager.setPageTransformer(true, zoomOutTransformation);
                break;
        }
    }


    private void addingFragmentsTOpagerAdapter() {
        pagerAdapter.addFragments(new FirstFragment());
        pagerAdapter.addFragments(new SecondFragment());
        pagerAdapter.addFragments(new ThirdFragment());
        pagerAdapter.addFragments(new FourthFragment());
        pagerAdapter.addFragments(new FifthFragment());
        pagerAdapter.addFragments(new SixthFragment());
        pagerAdapter.addFragments(new SeventhFragment());
        pagerAdapter.addFragments(new EighthFragment());
        pagerAdapter.addFragments(new NinthFragment());
        pagerAdapter.addFragments(new TenthFragment());
    }

}