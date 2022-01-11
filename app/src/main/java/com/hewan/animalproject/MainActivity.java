package com.pandjiaprillian.animalproject;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;
    private RecyclerView rvAnimals;
    private ArrayList<Animal> list = new ArrayList<>();

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_animal:
                    Intent animalIntent = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(animalIntent);
                    return true;
                case R.id.navigation_profile:
                    Intent profileIntent = new Intent(MainActivity.this, Profile.class);
                    profileIntent.putExtra(Profile.NAMA, "Pandji Aprillian Pamungkas");
                    profileIntent.putExtra(Profile.EMAIL, "pandjiaprilian@outlook.com");
                    startActivity(profileIntent);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        rvAnimals = findViewById(R.id.rv_animal);
        rvAnimals.setHasFixedSize(true);

        list.addAll(AnimalsData.getListData());
        showAnimalList();
    }

    private void showAnimalList(){
        rvAnimals.setLayoutManager(new LinearLayoutManager(this));
        AnimalsAdapter animalsAdapter = new AnimalsAdapter(list);
        rvAnimals.setAdapter(animalsAdapter);

        animalsAdapter.setOnItemClickCallback(new AnimalsAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Animal data) {
                showSelectedAnimal(data);
            }
        });

    }

    private void showSelectedAnimal(Animal animal){
        Intent animalIntent = new Intent(this, AnimalShowData.class);
        animalIntent.putExtra(AnimalShowData.animalName, animal.getAnimalName());
        animalIntent.putExtra(AnimalShowData.animalLatinName, animal.getAnimalLatinName());
        animalIntent.putExtra(AnimalShowData.animalDescription, animal.getAnimalDescription());
        animalIntent.putExtra(AnimalShowData.animalPhoto, animal.getAnimalPhoto());
        startActivity(animalIntent);
    }

}
