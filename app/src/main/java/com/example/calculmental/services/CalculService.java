package com.example.calculmental.services;

import com.example.calculmental.database.CalculDAO;
import com.example.calculmental.entities.Calcul;

public class CalculService {
    private CalculDAO calculDAO;

    public CalculService(CalculDAO calculDAO) {
        this.calculDAO = calculDAO;
    }

    public Integer getBest() { return calculDAO.leBest(); }

    public void storeInOb(Calcul calcul) {
        calculDAO.create(calcul);
    }
}

