package de.rub;

public class Waldlaeufer implements Charakter{
    private int GrundRuestungswert = 10;

    @Override
    public int getRuestungswert() {
        return GrundRuestungswert;
    }

    @Override
    public void zeigeRuestungswert() {
        System.out.println("Rüstungswert: " + this.getRuestungswert());
    }
}
