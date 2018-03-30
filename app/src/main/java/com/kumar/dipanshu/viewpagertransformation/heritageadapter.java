package com.kumar.dipanshu.viewpagertransformation;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by shivu on 29-03-2018.
 */

public class heritageadapter extends RecyclerView.Adapter<heritageadapter.heritageViewHolder>{

    private Context mContx;
    private ArrayList<heritagesites> heritagelist;

    public heritageadapter(Context mContx, ArrayList<heritagesites> heritagelist) {
        this.mContx = mContx;
        this.heritagelist = heritagelist;

    }

    @Override
    public heritageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContx);
        View view = inflater.inflate(R.layout.list_layout, null );

        heritageViewHolder holder = new heritageViewHolder(view,mContx,heritagelist);
        return holder;
    }
//    public static class ViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener{
//
//        public View view;
//        public ClipData.Item currentItem;
//        public ViewHolder(View itemView) {
//            super(itemView);
//            view = itemView;
//            view.setOnClickListener(new View.OnClickListener(){
//                @Override
//                public void onClick(View v){
//
//                }
//            });
//
//        }
//
//        @Override
//        public void onClick(View view) {
//
//        }
//    }

    @Override
    public void onBindViewHolder(heritageViewHolder holder, int position) {
            heritagesites heritage = heritagelist.get(position);

            holder.title.setText(heritage.getTitle());
            holder.description.setText(heritage.getDescription());
            holder.image.setImageDrawable(mContx.getResources().getDrawable(heritage.getImage()));


    }

    @Override
    public int getItemCount() {
        return heritagelist.size();
    }

   public static class heritageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView image;
        TextView title,description;
        ArrayList<heritagesites> heris=new ArrayList<>();
        Context mContx;
        private heritageViewHolder(View itemView, Context mContx, ArrayList<heritagesites> heris) {

            super(itemView);
            this.heris=heris;
            this.mContx=mContx;
            itemView.setOnClickListener(this);
            image = itemView.findViewById(R.id.imageView);
            title = itemView.findViewById(R.id.textViewTitle);
            description=itemView.findViewById(R.id.textViewShortDesc);


        }

       @Override
       public void onClick(View view) {
            int position=getAdapterPosition();
            heritagesites heri=this.heris.get(position);
            Log.i("heritageadapter","Position"+position);
           Intent intent = new Intent(Intent.ACTION_VIEW);
           intent.setData(Uri.parse("https://google.com/search?q="+heri.getTitle()));
           this.mContx.startActivity(intent);




       }

   }


}
