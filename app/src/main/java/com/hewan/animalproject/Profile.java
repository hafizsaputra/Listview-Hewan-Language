package com.pandjiaprillian.animalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile extends AppCompatActivity {
    public static final String NAMA = "nama";
    public static final String EMAIL = "email";

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_animal:
                    Intent animalIntent = new Intent(Profile.this, MainActivity.class);
                    startActivity(animalIntent);
                    return true;
                case R.id.navigation_profile:
                    Intent profileIntent = new Intent(Profile.this, Profile.class);
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
        setContentView(R.layout.activity_profile);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        TextView tvName, tvEmail;

        tvName = findViewById(R.id.tv_profilename_received);
        tvEmail = findViewById(R.id.tv_profileemail_received);

        String nama = getIntent().getStringExtra(NAMA);
        String email = getIntent().getStringExtra(EMAIL);

        tvName.setText(nama);
        tvEmail.setText(email);
    }
}
