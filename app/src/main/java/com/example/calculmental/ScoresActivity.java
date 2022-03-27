package com.example.calculmental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.calculmental.database.CalculDAO;
import com.example.calculmental.database.ComputeBaseHelper;
import com.example.calculmental.entities.Calcul;
import com.example.calculmental.services.CalculService;

public class ScoresActivity extends AppCompatActivity {

    private CalculService calculService;
    private Integer savedBest;
    private Integer best;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);
        calculService = new CalculService(new CalculDAO(new ComputeBaseHelper(this)));
        TextView numberBestScore = findViewById(R.id.numberBestScore);

        Intent intent = getIntent();
        best = intent.getIntExtra("bestScore",0);

        savedBest = calculService.getBest();



        if (best>savedBest){
            numberBestScore.setText(Integer.toString(best));
        } else {
            numberBestScore.setText(Integer.toString(savedBest));
        }

    }
}