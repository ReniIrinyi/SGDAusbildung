package EinsendeAufgaben3Lernmonat;

/* ######################################################

Einsendeaufgabe 5.3

###################################################### */

//die Klasse für die Listenelemente mit Methoden
class Listenelement {
    int daten;
    Listenelement head; //Listenanfang

    public void setDaten(int daten) {
        this.daten = daten;
    }
    //mit clear() "lösche" ich die daten aus der liste, zur Überprüfung/testzwecken um die zwei ausgabe-methoden
    //nacheinander testen zu können.
    void clear(){
        this.head=null;
    }
    // Methode zum Anhängen eines neuen Elements am ANFANG
    void addAnfang(int daten) {
        if(head==null){
            head = new Listenelement();
            head.setDaten(daten);
        } else {
            head.addAnfang(daten);
        }
    }
    //die Methode zur Ausgabe der Liste
    void ausgeben() {
        if(head!=null ) {
            //die elemente werden ein nach dem anderen über die konsol ausgegeben bis next=null
            //dann wird eine rekursice Aufruf erzeugt.
            System.out.print(head.daten + " => ");
            head.ausgeben();
        } else {
            System.out.println();
        }
    }
    //die Methode zur Ausgabe der Liste Rückwärts
    void ausgebenRückwärts() {
        if(head!=null ) {
            //Wenn head nicht leer ist, wird zuerst die rekursive Aufruf erfolgen. => die methode ruft sich selbts solange
            // bis elemente da sind => sie ruft jeden element, aber gibt nocht nichts über die konsole aus. letzte element erreicht (next=null) ist,
            //werden die vom LETZTEN bis zum ERSTEN element über die Konsole ausgegeben
            head.ausgebenRückwärts();
            System.out.print(head.daten + " => ");
        } else {
            System.out.println();
        }
    }
}


public class EinsendeAufgabe04 {
    public static void main(String[] args) {
        //ein neues Listenelement erzeugen
        Listenelement listenAnfang = new Listenelement();

        System.out.print("-".repeat(25));
        System.out.print(" AM ANFANG DER LISTE HINZUFÜGEN ");
        System.out.println("-".repeat(25));
        for (int element = 1; element <= 5; element++) {
            listenAnfang.addAnfang(element);
            listenAnfang.ausgeben();
        }
        System.out.println();
        listenAnfang.clear();

        System.out.print("-".repeat(25));
        System.out.print(" AM ANFANG DER LISTE HINZUFÜGEN + Rückwärts ausgeben ");
        System.out.println("-".repeat(25));
        for (int element = 1; element <= 5; element++) {
            listenAnfang.addAnfang(element);
            listenAnfang.ausgebenRückwärts();
        }
        System.out.println();
    }
}