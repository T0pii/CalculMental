 package com.example.calculmental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

 public class MainActivity extends AppCompatActivity {

    private Button play;
    private Button scores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.play = findViewById(R.id.btnjouer);
        this.scores = findViewById(R.id.btnscores);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent compute_activity = new Intent(getApplicationContext(), CalculActivity.class);
                startActivity(compute_activity);
                finish();
            }


        });
    }
}