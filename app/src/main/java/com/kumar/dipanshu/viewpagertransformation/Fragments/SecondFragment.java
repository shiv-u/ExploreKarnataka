package com.kumar.dipanshu.viewpagertransformation.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.kumar.dipanshu.viewpagertransformation.R;
import com.kumar.dipanshu.viewpagertransformation.explain;
import com.kumar.dipanshu.viewpagertransformation.explain2;
import com.squareup.picasso.Picasso;

public class SecondFragment extends Fragment {


    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final ImageView two = (ImageView) view.findViewById(R.id.fragmentTwoBackground);

        Picasso.get().load(R.drawable.mysurudosa).fit().centerCrop().into(two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Intent intent = new Intent(two.getContext(),explain2.class);
                two.getContext().startActivity(intent);

            }


        });
    }
}