package de.rub;

public class StoffBeine extends RuestungsDecorator{
    private int Ruestungswert = 3;

    public StoffBeine(Charakter c) {
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
