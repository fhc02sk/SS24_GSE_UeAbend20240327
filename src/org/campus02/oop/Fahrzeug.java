package org.campus02.oop;

public abstract class Fahrzeug {
    private int anzahlAchsen;
    private String name;
    private int pS;

    public Fahrzeug(String name, int anzahlAchsen, int pS) {
        this.anzahlAchsen = anzahlAchsen;
        this.name = name;
        this.pS = pS;
    }

    public abstract double steuer();

    @Override
    public String toString() {
        return "Fahrzeug{" +
                "anzahlAchsen=" + anzahlAchsen +
                ", name='" + name + '\'' +
                ", pS=" + pS +
                '}';
    }

    public int getAnzahlAchsen() {
        return anzahlAchsen;
    }

    public void setAnzahlAchsen(int anzahlAchsen) {
        this.anzahlAchsen = anzahlAchsen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getpS() {
        return pS;
    }

    public void setpS(int pS) {
        this.pS = pS;
    }
}
