package com.kenanh.dictionary;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DictionaryAdapter extends RecyclerView.Adapter<DictionaryAdapter.MyViewHolder> {
    private ArrayList kelime, kelimeAnlami, kategori;
    private Context context;
    Activity activity;
    public DictionaryAdapter(Activity activity,Context context,ArrayList kelime, ArrayList kelimeAnlami, ArrayList kategori) {
        this.kelime = kelime;
        this.kelimeAnlami = kelimeAnlami;
        this.kategori = kategori;
        this.context = context;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.words_item,parent,false);
        return new MyViewHolder(view);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            holder.kelimeRcyclerView.setText(String.valueOf(kelime.get(position)));
            holder.kelimeAnlamiRcyclerView.setText(String.valueOf(kelimeAnlami.get(position)));
            holder.kategoriRcyclerView.setText(String.valueOf(kategori.get(position)));

    }

    @Override
    public int getItemCount() {

        return kelime.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView kelimeRcyclerView, kelimeAnlamiRcyclerView, kategoriRcyclerView;
        LinearLayout linearLayout2;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            kelimeRcyclerView = itemView.findViewById(R.id.kelimeRcyclerView);
            kelimeAnlamiRcyclerView = itemView.findViewById(R.id.kelimeAnlamiRcyclerView);
            kategoriRcyclerView = itemView.findViewById(R.id.kategoriRcyclerView);
            linearLayout2 = itemView.findViewById(R.id.linearLayout2);

        }
    }

}
