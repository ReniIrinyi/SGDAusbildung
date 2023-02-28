package ÜbungsAufgbanen3Lernmonat;
/*###################################### Eine verkettete Liste Version 2 ######################################*/

public class EinfachVerketteteListe3 {

    public static void main(String[] args) {

        Listenelement3 listenAnfang = new Listenelement3();

        listenAnfang.setDaten("Element" );
        System.out.println(listenAnfang.toString());
        System.out.println("-".repeat(20));

        for (int element = 1; element <= 20; element++){

            listenAnfang.anhaengen("Element " + element);
        }
            System.out.println(listenAnfang.toString());
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

            /*Der rekursive Aufruf erfolgt also immer wieder für das nächste Element
             in der Liste und nicht für das Element, das ursprünglich angegeben wurde.  */

            naechster = new Listenelement3();
            naechster.setDaten(datenNeu);
        } else
            naechster.anhaengen(datenNeu);
        System.out.println("Daten " + datenNeu + " wurden am Anfang der Liste eingefügt.");
    }

    void ausgeben() {
        System.out.println(daten);
        if (naechster != null)
            naechster.ausgeben();
    }

}
