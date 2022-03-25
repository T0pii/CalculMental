package com.example.calculmental.entities;

public class Calcul extends BaseEntity{

    public Integer getBestEasy() {
        return bestEasy;
    }

    public void setBestEasy(Integer bestEasy) {
        this.bestEasy = bestEasy;
    }

    public Integer getBestMedium() {
        return bestMedium;
    }

    public void setBestMedium(Integer bestMedium) {
        this.bestMedium = bestMedium;
    }

    public Integer getBestHard() {
        return bestHard;
    }

    public void setBestHard(Integer bestHard) {
        this.bestHard = bestHard;
    }

    Integer bestEasy;
    Integer bestMedium;
    Integer bestHard;
}
