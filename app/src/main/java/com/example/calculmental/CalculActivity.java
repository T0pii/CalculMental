package com.example.calculmental;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CalculActivity extends AppCompatActivity {
    private TextView resultat;
    private TextView randomcalcul;
    private int premierElement;
    private int deuxiemeElement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calcul_activity);
        Button bouton1 = findViewById(R.id.button_1);
        bouton1.setOnClickListener(view -> ecrireChiffre(1));
        Button bouton2 = findViewById(R.id.button_2);
        bouton2.setOnClickListener(view -> ecrireChiffre(2));
        Button bouton3 = findViewById(R.id.button_3);
        bouton3.setOnClickListener(view -> ecrireChiffre(3));
        Button bouton4 = findViewById(R.id.button_4);
        bouton4.setOnClickListener(view -> ecrireChiffre(4));
        Button bouton5 = findViewById(R.id.button_5);
        bouton5.setOnClickListener(view -> ecrireChiffre(5));
        Button bouton6 = findViewById(R.id.button_6);
        bouton6.setOnClickListener(view -> ecrireChiffre(6));
        Button bouton7 = findViewById(R.id.button_7);
        bouton7.setOnClickListener(view -> ecrireChiffre(7));
        Button bouton8 = findViewById(R.id.button_8);
        bouton8.setOnClickListener(view -> ecrireChiffre(8));
        Button bouton9 = findViewById(R.id.button_9);
        bouton9.setOnClickListener(view -> ecrireChiffre(9));
        Button bouton0 = findViewById(R.id.button_0);
        bouton0.setOnClickListener(view -> ecrireChiffre(0));
        Button boutonclear = findViewById(R.id.buttonclear);
        //boutonclear.setOnClickListener(view -> effacerChiffre);
        Button boutoncalculer = findViewById(R.id.buttoncompute);
        boutoncalculer.setOnClickListener(view -> checkAnswer());

        resultat = findViewById(R.id.resultat);
        randomcalcul = findViewById(R.id.rdmcalc);
        creercalculRandom();
    }

    public void ecrireChiffre(Integer valeur) {
        resultat.setText(resultat.getText()+valeur.toString());
    }

    public String creercalculRandom() {

        premierElement = genererNombre();
        deuxiemeElement = genererNombre();
        String resultat;

        resultat = Integer.toString(premierElement) + " " + listeRandom() + " " + Integer.toString(deuxiemeElement);

        randomcalcul.setText(resultat);
        return resultat;
    }

    public String listeRandom() {
        List<String> operator = new ArrayList<String>();
        operator.add("*");
        operator.add("+");
        operator.add("-");

        Random random = new Random();
        int oprdm;
        oprdm = random.nextInt(3);
        return operator.get(oprdm);
    }

    public int genererNombre() {
        Random random = new Random();
        int nb;
        nb = random.nextInt(10);
        return nb;
    }

    public void checkAnswer() {

    }

}
