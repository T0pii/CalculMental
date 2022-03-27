package com.example.calculmental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.calculmental.database.CalculDao;
import com.example.calculmental.database.ComputeBaseHelper;
import com.example.calculmental.services.CalculService;

public class ScoresActivity extends AppCompatActivity {

    private CalculService calculService;
    private Integer savedBest;
    private Integer best;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);
        calculService = new CalculService(new CalculDao(new ComputeBaseHelper(this)));
        TextView numberBestScore = findViewById(R.id.numberBestScore);
        Intent intent = getIntent();
        best = intent.getIntExtra("best",-69);

        savedBest = calculService.getBest();

        if (best>savedBest){
            numberBestScore.setText("Best: " + best);
        } else {
            numberBestScore.setText("Best: " + savedBest);
        }
    }
}