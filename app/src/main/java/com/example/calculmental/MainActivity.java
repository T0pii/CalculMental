 package com.example.calculmental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

 public class MainActivity extends AppCompatActivity {

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         Button btnjouer = findViewById(R.id.btnjouer);
         btnjouer.setOnClickListener(view -> ouvreActiviteCalculer());
         Button btnscores = findViewById(R.id.btnscores);
         btnscores.setOnClickListener(view -> ouvreActiviteScores());

     }

     private void ouvreActiviteScores() {
         Intent intent = new Intent(this,ScoreActivity.class);
         startActivity(intent);
     }

     private void ouvreActiviteCalculer() {
         Intent intent = new Intent(this, CalculActivity.class);
         startActivity(intent);
     }
}