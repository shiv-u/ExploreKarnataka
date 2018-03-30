package com.kumar.dipanshu.viewpagertransformation.Fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.kumar.dipanshu.viewpagertransformation.R;
import com.kumar.dipanshu.viewpagertransformation.explain;
import com.squareup.picasso.Picasso;

public class ThirdFragment extends Fragment {


    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final ImageView three = (ImageView) view.findViewById(R.id.fragmentThreeBackground);

        Picasso.get().load(R.drawable.rakshasa).fit().centerCrop().into(three);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

//                Intent intent = new Intent(three.getContext(),explain.class);
//                three.getContext().startActivity(intent);
                Intent intent =new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://google.com/search?q=yakshagana"));
                startActivity(intent);

            }


        });
    }
}