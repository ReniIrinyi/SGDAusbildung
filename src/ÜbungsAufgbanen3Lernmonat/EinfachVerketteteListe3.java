package ÜbungsAufgbanen3Lernmonat;
/*###################################### Eine verkettete Liste Version 2 ######################################*/

public class EinfachVerketteteListe3 {

    public static void main(String[] args) {

        Listenelement3 listenAnfang = new Listenelement3();
        listenAnfang.setDaten("Element 1");
        for (int element = 2; element < 4; element++)
            listenAnfang.anhaengen("Element " + element);
        listenAnfang.ausgeben();
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
        System.out.println("Daten " + datenNeu + " wurden eingefügt.");
    }

    void ausgeben() {
        System.out.println(daten);
        if (naechster != null)
            naechster.ausgeben();
    }

}
