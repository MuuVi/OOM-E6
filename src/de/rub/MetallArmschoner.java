package de.rub;

public class MetallArmschoner extends RuestungsDecorator{
    private int Ruestungswert = 20;

    public MetallArmschoner(Charakter c) {
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
