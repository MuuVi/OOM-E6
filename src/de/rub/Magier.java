package de.rub;

public class Magier implements Charakter{
    private int GrundRuestungswert = 1;

    @Override
    public int getRuestungswert() {
        return GrundRuestungswert;
    }

    @Override
    public void zeigeRuestungswert() {
        System.out.println("Rüstungswert: " + this.getRuestungswert());
    }
}
