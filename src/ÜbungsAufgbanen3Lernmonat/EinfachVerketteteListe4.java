package ÜbungsAufgbanen3Lernmonat;
/*########################################## Eine verkettete Liste Version 1 (mit klassenmethoden)############################################ */

//klasse für Listenelemente OHNE methoden
class Listenelement4 {
    String name;
    int daten;
    Listenelement4 naechster;

    @Override
    public String toString() {
        return "Listenelement {" +

                "Element='" + daten + '\'' +
                ", naechster=" + naechster +
                '}';
    }
}

public class EinfachVerketteteListe4 {
    //Klassenmethoden
    static void setDaten(String name, int datenNeu, Listenelement4 element) {
        System.out.println("element hinzugefügt: \n"+ element);
        element.name=name;
        element.daten = datenNeu;
        element.naechster = null;

    }

    static void listeAnhaengen(String name, int datenNeu, Listenelement4 listenAnfang) {
        Listenelement4 hilfsKonstruktion;
        hilfsKonstruktion = listenAnfang;
        System.out.println("listen Anhängen, Hilfskonstruktion: " +hilfsKonstruktion);
        while (hilfsKonstruktion.naechster != null)
            hilfsKonstruktion = hilfsKonstruktion.naechster;
        setDaten(name, datenNeu, hilfsKonstruktion);
    }

    static void listeAusgeben(Listenelement4 listenAnfang) {
        Listenelement4 hilfsKonstruktion;
        hilfsKonstruktion = listenAnfang;
        System.out.println("listen Ausgeben, Hilfskonstruktion: "+hilfsKonstruktion);
        while (hilfsKonstruktion.naechster != null) {
            hilfsKonstruktion = hilfsKonstruktion.naechster;
            System.out.println("Wenn naechster ist null= "+hilfsKonstruktion.daten);
        }
    }
}




