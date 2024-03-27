package org.campus02.oop;

import java.util.ArrayList;
import java.util.HashMap;

public class Flotte {
    private ArrayList<Fahrzeug> fahrzeuge;

    public Flotte() {
        this.fahrzeuge = new ArrayList<>();
    }

    public void add(Fahrzeug f) {
        fahrzeuge.add(f);
    }

    public void printAll() {
        for (Fahrzeug f : fahrzeuge) {
            System.out.println(f + " Steuer: " + f.steuer());
        }
    }

    public  double getDurchschnittssteuer() {
        double gesamtSteuer = 0;

        for(Fahrzeug f : fahrzeuge ){
            gesamtSteuer += f.steuer();
        }

        return gesamtSteuer / fahrzeuge.size();
    }

    public Fahrzeug getMaximalSteuer() {
        double maxSteuer = Double.MIN_VALUE;

        for (Fahrzeug f : fahrzeuge) {
            if (f.steuer() > maxSteuer) {
                maxSteuer = f.steuer();
            }
        }

        for (Fahrzeug f : fahrzeuge) {
            if (f.steuer() == maxSteuer) {
                return f;
            }
        }

        return null;
    }

    public Fahrzeug getMaximalSteuer2() {

        if (fahrzeuge.size() == 0)
            return null;

        Fahrzeug fahrzeugMitMaxSteuer = fahrzeuge.get(0);

        for (Fahrzeug f : fahrzeuge) {
            if (f.steuer() > fahrzeugMitMaxSteuer.steuer()) {
                fahrzeugMitMaxSteuer = f;
            }
        }

        return fahrzeugMitMaxSteuer;
    }

    public HashMap<Integer, Integer> getAnzahlFahrzeugeJeAchse(){
        // key = Anzahl Achsen
        // value = Anzahl der Fahrzeuge

        HashMap<Integer, Integer> result = new HashMap<>();

        for (Fahrzeug f : fahrzeuge) {

            if (result.containsKey(f.getAnzahlAchsen())) {
                // ja, es gibt schon Eintrag
                int value = result.get(f.getAnzahlAchsen());
                value++;
                result.put(f.getAnzahlAchsen(), value);
            }
            else {
                result.put(f.getAnzahlAchsen(), 1);
            }
        }

        return result;
    }

    public HashMap<Integer, ArrayList<Fahrzeug>> getFahrzeugeJeAchse() {
        HashMap<Integer, ArrayList<Fahrzeug>> result = new HashMap<>();

        for (Fahrzeug f : fahrzeuge ) {

            if (result.containsKey(f.getAnzahlAchsen())) {
                ArrayList<Fahrzeug> list = result.get(f.getAnzahlAchsen());
                list.add(f);

                //result.put(f.getAnzahlAchsen(), list);
            }
            else {
                ArrayList<Fahrzeug> list = new ArrayList<>();
                list.add(f);

                result.put(f.getAnzahlAchsen(), list);
            }
        }

        return result;
    }
}
