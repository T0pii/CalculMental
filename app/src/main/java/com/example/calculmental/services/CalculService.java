package com.example.calculmental.services;

import com.example.calculmental.database.CalculDao;
import com.example.calculmental.entities.Calcul;

public class CalculService {
    private CalculDao calculDAO;

    public CalculService(CalculDao calculDAO) {
        this.calculDAO = calculDAO;
    }

    public Long getCalculCount() {
        return calculDAO.count();
    }

    public Integer getBest() { return calculDAO.leBest(); }

    public void storeInOb(Calcul calcul) {
        calculDAO.create(calcul);
    }
}

