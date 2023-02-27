package ÜbungsAufgbanen3Lernmonat;

public class Main {
    public static void main(String[] args) {
       /* System.out.println("Das Quadrat von 4 ist " + Quadrat.berechnen(4));
        System.out.println("-".repeat(25));
        Autoklasse auto1 = new Autoklasse();
        Autoklasse auto2 = new Autoklasse();
        auto1.initialisiere(0);
        auto2.initialisiere(10);
        System.out.println("Es gibt " + Autoklasse.getAutoZaehler() + " Autos.");
        System.out.println("-".repeat(25));

        Ueberdeckt test = new Ueberdeckt(); test.zKetteAendern("Test");
        //das führt zu seltsamen Ausgaben
        System.out.println("Der geänderte Wert ist " + test.getZKette());
        //und das sogar zum Absturz
        if (test.getZKette().isEmpty())
            System.out.println("Die Zeichenkette ist leer");
        else
            System.out.println("Die Zeichenkette ist nicht leer");
        System.out.println("-".repeat(25));

        System.out.print("-".repeat(25));
        System.out.print("Behälter");
        System.out.println("-".repeat(25));

        //die Instanzen erzeugen und intialisieren
        Behaelter behaelter1 = new Behaelter();
        Behaelter behaelter2 = new Behaelter();
        behaelter1.init(60);
        behaelter2.init(60);
        //die "Leitungen" zwischen den Behältern legen
        behaelter1.verbindenMit(behaelter2);
        behaelter2.verbindenMit(behaelter1);
        //Ausgabe der Füllstände über die Klassenmethode
        ausgabe(behaelter1, behaelter2);
        //10 Liter aus Behälter 1 umpumpen
        behaelter1.abgeben(10);
        ausgabe(behaelter1, behaelter2);
        //mehr umpumpen als passt
        behaelter1.abgeben(40);
        ausgabe(behaelter1, behaelter2);
        //60 Liter aus Behälter 2 umpumpen
        behaelter2.abgeben(60);
        ausgabe(behaelter1, behaelter2);
        System.out.println("-".repeat(25));
*/

        //Einfache Verkettung
        Listenelement4 listenAnfang = new Listenelement4();
        System.out.println("Das ist der listenanfang");
        System.out.println(listenAnfang.toString());
        System.out.println("-".repeat(20));
        for (int element = 1; element <= 5; element++){
            if(element==1){
                System.out.println("Das ist der erste Element");
            }
            EinfachVerketteteListe4.listeAnhaengen("Element ",element, listenAnfang);
            System.out.println("*".repeat(10));
        }

        EinfachVerketteteListe4.listeAusgeben(listenAnfang);

    }
}
