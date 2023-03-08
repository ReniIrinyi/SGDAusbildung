package ÜbungsAufgbanen3Lernmonat;
/*###################################### Eine verkettete Liste Version 2 ######################################*/

public class EinfachVerketteteListe3 {

    public static void main(String[] args) {

        Listenelement3 listenAnfang = new Listenelement3();

        listenAnfang.setDaten("Element" );
        System.out.println("-".repeat(20));

        for (int element = 1; element <= 20; element++){
            listenAnfang.anhaengen("Element " + element);
            listenAnfang.ausgeben();
        }

    }

}


class Listenelement3 {
    String daten;
    Listenelement3 naechster;
    void setDaten(String datenNeu) {
        daten = datenNeu;
        naechster = null;
    }

    void anhaengen(String datenNeu) {
        if (naechster == null) {
            naechster = new Listenelement3();
            naechster.setDaten(datenNeu);
        } else
            naechster.anhaengen(datenNeu);
    }

    void ausgeben() {
        if (naechster != null) {
            naechster.ausgeben();
            System.out.print(daten + " =>");
        } else {
            System.out.println();
        }
    }

}
