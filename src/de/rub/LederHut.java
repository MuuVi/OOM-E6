package de.rub;

public class LederHut extends RuestungsDecorator{
    private int Ruestungswert = 5;

    public LederHut(Charakter c) {
        super(c);
    }

    @Override
    public int getRuestungswert() {
        return Ruestungswert + c.getRuestungswert();
    }

    @Override
    public void zeigeRuestungswert() {
        System.out.println("Rüstungswert: " + this.getRuestungswert());
    }
}
