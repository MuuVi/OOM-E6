package de.rub;

public abstract class RuestungsDecorator implements Charakter{
    protected Charakter c;

    public RuestungsDecorator(Charakter c) {
        this.c = c;
    }
}
