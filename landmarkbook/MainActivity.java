package com.kenanh.landmarkbook;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.kenanh.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;
public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    ArrayList<Landmark> landmarkArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkArrayList = new ArrayList<>();
        Landmark topkapi = new Landmark("Topkapı Sarayı","Türkiye",R.drawable.topkapi);
        Landmark ayasofya = new Landmark("Ayasofya","Türkiye",R.drawable.ayasofya);
        Landmark yerebatan = new Landmark("Yerebatan Sarnıcı","Türkiye",R.drawable.yerebatan);
        Landmark sultanahmet = new Landmark("Sultanahmet Camii","Türkiye",R.drawable.sultanahmet);

        landmarkArrayList.add(topkapi);
        landmarkArrayList.add(ayasofya);
        landmarkArrayList.add(yerebatan);
        landmarkArrayList.add(sultanahmet);

        binding.recyclerView.setLayoutManager((new LinearLayoutManager(this)));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);
/*        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                landmarkArrayList.stream().map(landmark -> landmark.name).collect(Collectors.toList())
        );
        binding.listView.setAdapter(arrayAdapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("key",landmarkArrayList.get(i));
                startActivity(intent);
            }
     });
      */

    }
}