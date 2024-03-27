package org.campus02.oop;

public class DemoApp {

    public static void main(String[] args) {

        Auto a = new Auto("Golf", 2, 85, 140);
        Auto b = new Auto("BMW 1er", 2, 110, 135);
        Lastkraftwagen lkw = new Lastkraftwagen("MAN", 6, 380, 25);
        ElektroAuto ea = new ElektroAuto("Tesla", 2, 450, 80);

        Flotte f = new Flotte();
        f.add(a);
        f.add(lkw);
        f.add(ea);
        f.add(b);

        f.printAll();

        System.out.println("f.getDurchschnittssteuer() = " + f.getDurchschnittssteuer());

        System.out.println("f.getMaximalSteuer() = " + f.getMaximalSteuer());
        System.out.println("f.getMaximalSteuer2() = " + f.getMaximalSteuer2());

        System.out.println("f.getAnzahlFahrzeugeJeAchse() = " + f.getAnzahlFahrzeugeJeAchse());

        System.out.println("f.getFahrzeugeJeAchse() = " + f.getFahrzeugeJeAchse());
        
    }
}
