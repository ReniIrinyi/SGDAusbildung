package ÜbungsAufgbanen3Lernmonat;

/*###################################### Eine verkettete Liste Version 2 ######################################*/
public class EinfachVerketteListe2 {
    public static void main(String[] args) {
        //ein neues Listenelement4 erzeugen
        Listenelement2 listenAnfang = new Listenelement2();
        //die Daten im ersten Listenelement4 setzen
        listenAnfang.setDaten("Element 1");
        //weitere Elemente in einer Schleife einfügen
        for (int element = 2; element < 4; element++)
            listenAnfang.anhaengen("Element " + element); //die Liste ausgeben
        listenAnfang.ausgeben();
    }
}

//die Klasse für die Listenelemente mit Methoden
class Listenelement2 {
    String daten;
    Listenelement2 naechster;

    //die Methode zum Setzen der Daten
    void setDaten(String datenNeu) {
        //die Zeichenkette setzen
        daten = datenNeu;
        //das Ende markieren
        naechster = null;
    }


    //die Methode zum Anhängen eines neuen Elements
    //sie ruft sich rekursiv auf, bis das Ende erreicht ist
    void anhaengen(String datenNeu) {
//wenn das Ende erreicht ist, ein neues Element erzeugen
        if (naechster == null) {
            naechster = new Listenelement2();
            naechster.setDaten(datenNeu);

            //sonst ruft sich die Methode selbst wieder auf
        } else
            naechster.anhaengen(datenNeu);
//nur zur Veranschaulichung
        System.out.println("Daten " + datenNeu + " wurden eingefügt.");
    }

    //die Methode zur Ausgabe der Liste
//sie ruft sich ebenfalls rekursiv auf, bis das  //Ende erreicht ist
    void ausgeben() {
        System.out.println(daten);
        if (naechster != null)
            naechster.ausgeben();
    }

}








