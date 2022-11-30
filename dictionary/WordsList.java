package com.kenanh.dictionary;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class WordsList extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DictionaryAdapter dictionaryAdapter;
    private ArrayList<String> kelime, kelimeAnlami, kategori;
    Database database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words_list);
        Intent intent = getIntent();
        recyclerView = findViewById(R.id.recyclerView2);
        database = new Database(this);
        kelime = new ArrayList<>();
        kelimeAnlami = new ArrayList<>();
        kategori = new ArrayList<>();

        dictionaryAdapter = new DictionaryAdapter(this,this, kelime, kelimeAnlami,kategori);
        recyclerView.setAdapter(dictionaryAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
kelimeListe();
    }

        public void kelimeListe()
        {
            Cursor cursor = database.veriListe();
            if (cursor.getCount()==0)
                Toast.makeText(this, "Kelime Eklenemedi", Toast.LENGTH_SHORT).show();
            else
            {
                while (cursor.moveToNext())
                {
                  kelime.add(cursor.getString(1));
                  kelimeAnlami.add(cursor.getString(2));
                  kategori.add(cursor.getString(3));
                }
            }
        }
}