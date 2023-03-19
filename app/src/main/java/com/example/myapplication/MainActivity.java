package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.gridView = (GridView)findViewById(R.id.gridview);
        Pokemon chamelon = new Pokemon(1,"image1","50","Chamelon","pikatchu","masculin");
        Pokemon caterpie = new Pokemon(2,"image2","54","Caterpie","caty","feminin");
        Pokemon butterfree = new Pokemon(3,"image3","62","Butterfree","mouse","masculin");
        Pokemon[]pokemons=new Pokemon[]{chamelon,caterpie,butterfree};

        int[]images={R.drawable.baterfree,R.drawable.caterpie,R.drawable.chamelon};

        GridaAdapter gridaAdapter = new GridaAdapter(MainActivity.this,pokemons,images);
        gridView.setAdapter(gridaAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("Pokemonname",pokemons[position].getNom());
                intent.putExtra("pokemonimg",images[position]);
                startActivity(intent);
            }
        });

        }
}