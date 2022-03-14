package com.example.calculmental;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculActivity extends AppCompatActivity {

    private TextView str_compute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(view -> ecrireunChiffre(1));
        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(view -> ecrireunChiffre(2));
        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(view -> ecrireunChiffre(3));
        Button btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(view -> ecrireunChiffre(4));
        Button btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(view -> ecrireunChiffre(5));
        Button btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(view -> ecrireunChiffre(6));
        Button btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(view -> ecrireunChiffre(7));
        Button btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(view -> ecrireunChiffre(8));
        Button btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(view -> ecrireunChiffre(9));
        Button btn0 = findViewById(R.id.btn0);
        btn0.setOnClickListener(view -> ecrireunChiffre(0));
        TextView str_compute = findViewById(R.id.str_compute);

        private void ecrireunChiffre(Integer valeur) {

        }



    }
}
