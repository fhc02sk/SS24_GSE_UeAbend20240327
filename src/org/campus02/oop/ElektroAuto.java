package org.campus02.oop;

public class ElektroAuto extends Fahrzeug {

    private int kapazitaet;

    public ElektroAuto(String name, int anzahlAchsen, int pS, int kapazitaet) {
        super(name, anzahlAchsen, pS);
        this.kapazitaet = kapazitaet;
    }

    @Override
    public double steuer() {

        if (kapazitaet < 50)
            return 100;
        if (kapazitaet >= 50 && kapazitaet < 100) {
            double steuer = getpS() * 10;
            if (steuer > 1000)
                return 1000;
            else
                return steuer;
        }
        else if (kapazitaet >= 100) {
            double steuer = this.getpS() * 8.5;
            if (steuer < 1000)
                return 1000;
            else
                return steuer;
        }

        return 0;
    }

    public double steuer2() {

        if (kapazitaet < 50)
            return 100;

        double multiplikator = 10;
        if (kapazitaet >= 100)
            multiplikator = 8.5;

        double steuer = getpS() * multiplikator;
        if ((kapazitaet >= 100 && steuer < 1000)
            || (kapazitaet < 100 && steuer > 1000)) {
            steuer = 1000;
        }

        return steuer;
    }


    @Override
    public String toString() {
        return super.toString() +"ElektroAuto{" +
                "kapazitaet=" + kapazitaet +
                '}';
    }
}
