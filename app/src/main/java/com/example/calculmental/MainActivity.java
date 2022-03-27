 package com.example.calculmental;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.calculmental.entities.AboutUsActivity;

 public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnjouer = findViewById(R.id.btnjouer);
        btnjouer.setOnClickListener(view -> ouvreActiviteCalculer());
        Button btnscores = findViewById(R.id.btnscores);
        btnscores.setOnClickListener(view -> ouvreActiviteScores());
        Button btnAbout=findViewById(R.id.btnaboutus);
        btnAbout.setOnClickListener(view -> ouvreActiviteAboutUs());

        ImageButton btnswitchtheme = findViewById(R.id.btnswitchtheme);
        setDarkModeIcon(btnswitchtheme);
        btnswitchtheme.setOnClickListener(view -> switchTheme(btnswitchtheme));
    }

    private void setDarkModeIcon(View v) {
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            v.setBackgroundResource(R.drawable.dark_mode_moon);
        } else {
            v.setBackgroundResource(R.drawable.light_mode_sun);
        }
    }

    private void switchTheme(View btnswitchtheme) {
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }
        finish();
        startActivity(new Intent(MainActivity.this, MainActivity.this.getClass()));
    }

    private void ouvreActiviteAboutUs() {
        Intent intent = new Intent(this, AboutUsActivity.class);
        startActivity(intent);
    }

    private void ouvreActiviteScores() {
        Intent intent = new Intent(this,ScoresActivity.class);
        startActivity(intent);
    }

    private void ouvreActiviteCalculer() {
        Intent intent = new Intent(this, CalculActivity.class);
        startActivity(intent);
    }
}