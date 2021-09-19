package de.rub;

public class TestKlasse {

    public static void main(String[] args) {
        Charakter mag = new MetallArmschoner(new Magier());
        mag.zeigeRuestungswert();
        Charakter mag2 = new Magier();
        mag2.zeigeRuestungswert();
        Charakter mag3 = new MetallArmschoner(new LederHut(new StoffBeine(new Waldlaeufer())));
        mag3.zeigeRuestungswert();
    }
}
