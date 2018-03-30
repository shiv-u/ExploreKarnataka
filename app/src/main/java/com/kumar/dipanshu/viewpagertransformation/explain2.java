package com.kumar.dipanshu.viewpagertransformation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;




import java.util.ArrayList;

/**
 * Created by shivu on 28-03-2018.
 */

public class explain2 extends AppCompatActivity {
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
                        R.drawable.dosa2,
                        "Mysuru Masala Dosa",
                        "Masala dosa or masale dose is a variation of the popular South Indian food dosa," +
                                "Mysore masala dosa has a red chutney made from red chillies, onion, and garlic applied to the inside of the dosa before placing the potato stuffing on top of it."

                ));


        heritageList.add(
                new heritagesites(
                        R.drawable.idli,
                        "Mallige Idli",
                        "Like the dosa, Mysore has to have its own version of idli as well. In much of South Karnataka, the idlis are soft and fluffy,served with a variety of chutneys and sambhar. In Mysore it is named after mallige (jasmine), the other thing that is popular here.ndia."
                ));

        heritageList.add(
                new heritagesites(
                        R.drawable.hollige,
                        "Holige",
                        "It's a special dish served in the state of Karnataka on all occasions, espectially during Yugadhi/Ugadhi. Different varieties of holige is served in various parts of Karnataka and the most common is the one prepared with yellow gram and sugar or jaggery."));
        heritageList.add(
                new heritagesites(
                        R.drawable.akkirotti,
                        "Akki Rotti",
                        "Akki Rotti is a rice-based breakfast item unique to the state of Karnataka, India. Akki rotti means rice bread  in the native language, Kannada. It is made of rice flour which is mixed with salt and water and kneaded well till the dough gets soft."
                )
        );


        adapter = new heritageadapter(this,heritageList);
        recyclerView.setAdapter(adapter);
        recyclerView.setNestedScrollingEnabled(false);


    }

}
