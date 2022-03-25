package com.example.calculmental;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CalculActivity extends AppCompatActivity {
    private TextView txtViewNombreEntre;
    private TextView txtViewOperation;
    private TextView txtViewScore;
    private TextView txtViewBest;
    private int premierElement;
    private int deuxiemeElement;
    private int nbChiffre=0;

    private long resultatAttendu;
    private long nombreEntre;
    private int score = 0;
    private int best;

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
        boutonclear.setOnClickListener(view -> effacerChiffre());
        boutonclear.setOnLongClickListener(view -> effacerTout());
        Button boutoncalculer = findViewById(R.id.buttoncompute);
        boutoncalculer.setOnClickListener(view -> checkAnswer());

        txtViewNombreEntre = findViewById(R.id.txtViewNombreEntre);
        txtViewOperation = findViewById(R.id.txtViewOperation);
        txtViewScore = findViewById(R.id.txtViewScore);
        txtViewBest = findViewById(R.id.txtViewBest);
        genererCalculRandom();
    }

    public void ecrireChiffre(Integer valeur) {
        nbChiffre++;
        if (nbChiffre<=5) {
            nombreEntre = nombreEntre * 10 + valeur;
            txtViewNombreEntre.setText(Long.toString(nombreEntre));
        }
        else {
            Toast.makeText(this, getString(R.string.valeurTropGrande), Toast.LENGTH_SHORT).show();
        }
    }

    public void effacerChiffre() {
        if (nbChiffre!=0) {
            nbChiffre--;
            txtViewNombreEntre.setText(txtViewNombreEntre.getText().subSequence(0, txtViewNombreEntre.length() - 1));
            nombreEntre=nombreEntre / 10;
        }
    }

    public boolean effacerTout() {
        txtViewNombreEntre.setText("");
        nombreEntre=0;
        nbChiffre=0;
        return true;
    }

    public void genererCalculRandom() {
        String operateurAleatoire=listeRandom();

        do {
            premierElement = genererNombre();
            deuxiemeElement = genererNombre();
        } while (premierElement - deuxiemeElement < 0);

        switch(operateurAleatoire) {
            case "+":
                resultatAttendu=premierElement+deuxiemeElement;
                break;
            case "-":
                resultatAttendu=premierElement-deuxiemeElement;
                break;
            case "*":
                resultatAttendu=premierElement*deuxiemeElement;
                break;
        }
        txtViewOperation.setText(Long.toString(premierElement) + operateurAleatoire + Long.toString(deuxiemeElement));
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

    public void calculCorrect() {
        genererCalculRandom();
        nombreEntre=0;
        nbChiffre=0;
        txtViewNombreEntre.setText("");
        score+=1;
        txtViewScore.setText(Integer.toString(score));
    }

    public void checkAnswer() {
        if(resultatAttendu==nombreEntre) {
            Toast.makeText(this, getString(R.string.valeurCorrecte), Toast.LENGTH_SHORT).show();
            calculCorrect();
        } else {
            Toast.makeText(this, getString(R.string.valeurIncorrecte), Toast.LENGTH_SHORT).show();
        }
    }

}
