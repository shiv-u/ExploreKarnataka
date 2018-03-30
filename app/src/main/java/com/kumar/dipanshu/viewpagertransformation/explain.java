package com.kumar.dipanshu.viewpagertransformation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by shivu on 28-03-2018.
 */

public class explain extends AppCompatActivity {
    RecyclerView recyclerView;
    heritageadapter adapter;
    ArrayList<heritagesites> heritageList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explain);
        heritageList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        heritageList.add(
                new heritagesites(
                        R.drawable.mysuru,
                        "Mysuru Palace",
                        "Ambavilas Palace, otherwise known as the Mysore Palace, is a " +
                                "historical palace and a royal residence at Mysore in the southern" +
                                " Karnataka state of India."

                       ));


        heritageList.add(
                new heritagesites(
                        R.drawable.hampi,
                        "Hampi",
                        "Hampi, also referred to as the Group of Monuments at Hampi, " +
                                "is a UNESCO World Heritage Site located in east-central Karnataka, India."
                                ));

        heritageList.add(
                new heritagesites(
                        R.drawable.kallu,
                        "PatadKallu",
                        "Pattadakal, also called Paṭṭadakallu or Raktapura, is a complex of 7th and 8th century CE Hindu " +
                                "and Jain temples in northern " +
                                "Karnataka (India)."));
        heritageList.add(

                new heritagesites(
                        R.drawable.golgumbaz,
                        "GolGumbaz",
                        "Gol Gumbaz is the mausoleum of king Mohammed Adil Shah, Sultan of Bijapur. Construction of the tomb," +
                                " located in formerly Bijapur, Karnataka, India, was started in 1626 and completed in 1656."
                )
        );
        heritageList.add(
                new heritagesites(
                        R.drawable.hoy,
                        "Belur",
                        "The Chennakeshava Temple, also referred to as Keshava," +
                                " Kesava or Vijayanarayana Temple of Belur, is a 12th-century Hindu temple in the Hassan district of Karnataka state, India."
                )
        );
        heritageList.add(
                new heritagesites(
                        R.drawable.badami,
                        "Badami",
                        "Badami, formerly known as Vatapi, is a town and headquarters of a taluk by the same name, in the Bagalkot district of Karnataka, India." +
                                " It was the regal capital of the Badami Chalukyas from 540 to 757 AD. It is famous for its rock cut structural temples."

                )
        );

        adapter = new heritageadapter(this,heritageList);
        recyclerView.setAdapter(adapter);
        recyclerView.setNestedScrollingEnabled(false);


    }

}
