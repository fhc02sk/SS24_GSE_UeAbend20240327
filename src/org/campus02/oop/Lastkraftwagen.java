package org.campus02.oop;

public class Lastkraftwagen extends  Fahrzeug{

    private int maxTonnage;
    public Lastkraftwagen(String name, int anzahlAchsen, int pS, int maxTonnage) {
        super(name, anzahlAchsen, pS);

        if (maxTonnage < 1 || maxTonnage > 40) {
            System.out.println(maxTonnage + " : nicht erlaubter Wert");
            maxTonnage = -1;
        }
        else {
            this.maxTonnage = maxTonnage;
        }
    }

    @Override
    public double steuer(){

        switch (getAnzahlAchsen()) {
            case 2:
                return getpS() * maxTonnage / 3.0;
            case 3:
                return getpS() * maxTonnage / 2.0;
            case 4:
                return getpS() * maxTonnage;
            default:
                return getpS() * maxTonnage + 1000;
        }
    }

    public double steuer2() {
        double steuer = 0;

        switch (getAnzahlAchsen()) {
            case 2:
                steuer = getpS() * maxTonnage / 3.0;
                break;
            case 3:
                steuer = getpS() * maxTonnage / 2.0;
                break;
            case 4:
                steuer = getpS() * maxTonnage;
                break;
            default:
                steuer = getpS() * maxTonnage + 1000;
                break;
        }

        return steuer;
    }

    @Override
    public String toString() {
        return super.toString() +"Lastkraftwagen{" +
                "maxTonnage=" + maxTonnage +
                '}';
    }
}
