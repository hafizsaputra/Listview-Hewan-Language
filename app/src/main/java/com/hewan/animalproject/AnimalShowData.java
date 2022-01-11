package com.pandjiaprillian.animalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimalShowData extends AppCompatActivity {
    public static final String animalName = "animalName";
    public static final String animalLatinName = "animalLatinName";
    public static final String animalDescription = "animalDescription";
    public static final String animalPhoto = "animalPhoto";

    ImageView imgAnimalShow;
    TextView tvAnimalNameShow, tvAnimalLatinNameShow, tvAnimalDescriptionShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_animal_show_data);

        tvAnimalNameShow = findViewById(R.id.tv_animals_name_received);
        tvAnimalLatinNameShow = findViewById(R.id.tv_animals_latin_name_received);
        tvAnimalDescriptionShow = findViewById(R.id.tv_animals_description_received);
        imgAnimalShow = findViewById(R.id.img_animal_photo_received);

        String name = getIntent().getStringExtra(animalName);
        String latinName = getIntent().getStringExtra(animalLatinName);
        String description = getIntent().getStringExtra(animalDescription);
        int photo = getIntent().getIntExtra(animalPhoto, 0);

        tvAnimalNameShow.setText(name);
        tvAnimalLatinNameShow.setText(latinName);
        tvAnimalDescriptionShow.setText(description);
        imgAnimalShow.setImageResource(photo);
    }
}
