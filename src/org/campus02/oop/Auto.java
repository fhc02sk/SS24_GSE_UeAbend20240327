package org.campus02.oop;

public class Auto extends Fahrzeug{

    private int co2;
    public Auto(String name, int anzahlAchsen, int pS, int co2) {
        super(name, anzahlAchsen, pS);
        this.co2 = co2;
    }

    @Override
    public double steuer() {
        double steuer = (getpS() * 15) + (co2 * 5);
        if (steuer < 100)
            steuer = steuer / 2.0;

        return steuer;
    }


    @Override
    public String toString() {
        return super.toString() +
                "Auto{" +
                "co2=" + co2 +
                '}'

                ;
    }
}
