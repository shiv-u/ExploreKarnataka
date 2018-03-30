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
import com.squareup.picasso.Picasso;

public class FirstFragment extends Fragment {


    public FirstFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);


    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final ImageView one = (ImageView) view.findViewById(R.id.fragmentOneBackground);

        Picasso.get().load(R.drawable.mysuru).fit().centerCrop().into(one);
        one.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v){

                                Intent intent = new Intent(one.getContext(),explain.class);
                                one.getContext().startActivity(intent);

                            }


        });
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.v("Order", arg);
//                Intent intent = new Intent(itemView.getContext(), topping.class);
//                intent.putExtra("arg", arg);
//                itemView.getContext().startActivity(intent);
//
//            }
//        });

    }


}