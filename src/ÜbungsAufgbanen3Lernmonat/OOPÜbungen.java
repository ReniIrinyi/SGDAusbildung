package ÜbungsAufgbanen3Lernmonat;

public class OOPÜbungen {

    public class AusgabeClass{

        //ausgabe() ist eine Klassenmethode für die Klasse
        static void ausgabe(Behaelter behaelter1, Behaelter behaelter2) {
            System.out.println("Behälter 1 -----------------  Behaelter 2");
            System.out.print(behaelter1.getFuellstand());
            System.out.print(" ----------------- ");
            System.out.println(behaelter2.getFuellstand());
        }
    }

}

/*##########################
 Behälter
 ###########################*/
//die Klasse für die Behälter
class Behaelter {
    //die Instanzvariablen
    int fuellstand;
    Behaelter andererBehaelter;

    //die Methoden
    void init(int menge) {
        fuellstand = menge;
    }

    void verbindenMit(Behaelter behaelter) {
        andererBehaelter = behaelter;
    }

    int getFuellstand() {
        return fuellstand;
    }

    int aufnehmen(int menge) {
        int rueckgabe;
        if (menge + fuellstand > 100) {
            rueckgabe = 100 - fuellstand;
            fuellstand = 100;
        } else {
            fuellstand = fuellstand + menge;
            rueckgabe = menge;
        }
        return rueckgabe;
    }

    void abgeben(int menge) {
        int gepumpt;
        if (menge > fuellstand)
            gepumpt = andererBehaelter.aufnehmen(fuellstand);
        else
            gepumpt = andererBehaelter.aufnehmen(menge);
        fuellstand = fuellstand - gepumpt;
    }

}




/*###############################
Eine Klasse mit Klassenmethode
################################*/
//die selbst erstellte Klasse
class Quadrat {
    //eine Klassenmethode
    static int berechnen(int wert) {
        return  wert * wert;
    }
}

/*############################### Kombination von Klassenvariablen und Instanzvariablen ################################*/
//die Vereinbarung der Klasse Autoklasse
//Sie erfolgt außerhalb der Klasse für das Programm
class Autoklasse {
    //die Klassenvariable
    static int autoZaehler;
    //die Instanzvariable
    int geschwindigkeit;

    //die Methoden
    //eine Klassenmethode, die die Anzahl der Instanzen liefert
    static int getAutoZaehler() {
     return autoZaehler;
    }
    //die "echten" Methoden
    //zum Initialisieren
    //hier wird jetzt auch die Klassenvariable autoZaehler um den Wert 1 erhöht
    void initialisiere(int standard) {
        geschwindigkeit = standard;
        autoZaehler++;
    }
 }

/*############################
Das Problem der Überdeckung 
Das Programm löst eine Ausnahme aus! #############################*/
class Ueberdeckt {
    //die Instanzvariable
    String zKette;
    //die Methode soll den Wert von zKette ändern => wird aber nur den parameter ändern(lokale Variable) => Instanzvariable ist immer noch auf 0 => wird abstürzen
    //Exception in thread "EinfacheVerkettung" java.lang.NullPointerException: Cannot invoke "String.isEmpty()" because the return value of "ÜbungsAufgbanen3Lernmonat.Ueberdeckt.getZKette()" is null
    //at ÜbungsAufgbanen3Lernmonat.OOPÜbungen.EinfacheVerkettung(OOPÜbungen.java:18)
    void zKetteAendern(String zKette) {
        //zKette = zKette + " geändert"; //=> stürtz ab!!
        this.zKette = zKette + " geändert"; //lösung! this. a zKette elött, igy egyertelmü hogy nem a lokal variablet akartuk változtatni
    }
    //die Zeichenkette liefern
    String getZKette() {
        return zKette;
    }
}







