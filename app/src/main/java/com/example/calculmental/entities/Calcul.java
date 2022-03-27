package com.example.calculmental.entities;

import com.example.calculmental.services.CalculService;

public class Calcul extends BaseEntity{

    public Integer getBest() {
        return best;
    }

    public void setBest(Integer best) {
        this.best = best;
    }

    Integer best;
}