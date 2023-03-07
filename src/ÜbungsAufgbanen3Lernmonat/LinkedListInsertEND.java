package ÜbungsAufgbanen3Lernmonat;



public class LinkedListInsertEND {

       public static void main(String[] args) {
        //ein neues Listenelement4 erzeugen
        VerketteListeIterativ listenAnfang = new VerketteListeIterativ(0);

        System.out.print("-".repeat(25));
        System.out.print(" AM ANFANG DER LISTE HINZUFÜGEN ");
        System.out.println("-".repeat(25));
        for(int element=1; element<=5; element++){
            listenAnfang.addAnfang(element);
            System.out.println("Nachdem wir "+element+" hinzugefügt haben dann wurde: ");
            listenAnfang.ausgeben();
        }
listenAnfang.clearListe();
        System.out.print("-".repeat(25));
        System.out.print(" AM ENDE DER LISTE HINZUFÜGEN ");
        System.out.println("-".repeat(25));
        for(int element=2; element<=5; element++){
            listenAnfang.addEnde(element);
            System.out.println("Nachdem wir "+element+" hinzugefügt haben dann wurde: ");
            listenAnfang.ausgeben();
        }
           listenAnfang.clearListe();
        System.out.print("-".repeat(25));
        System.out.print(" Rückwärts ausgeben AM ANFANG hinzugefügte Liste");
        System.out.println("-".repeat(25));
        for(int element=5; element>=0; element--){
            listenAnfang.addAnfang(element);
            System.out.println("Nachdem wir "+element+" hinzugefügt haben dann wurde: ");
            listenAnfang.ausgeben();
        }
           listenAnfang.clearListe();
        System.out.print("-".repeat(25));
        System.out.print(" Rückwärts ausgeben AM ENDE hinzugefügte Liste");
        System.out.println("-".repeat(25));
        for(int element=5; element>=0; element--){
            listenAnfang.addEnde(element);
            System.out.println("Nachdem wir "+element+" hinzugefügt haben dann wurde: ");
            listenAnfang.ausgeben();
        }
           listenAnfang.clearListe();

        }
    }


//die Klasse für die Listenelemente mit Methoden
class VerketteListeIterativ {
    int daten;
    VerketteListeIterativ next;

    //constructor
     VerketteListeIterativ(int daten) {
        this.daten = daten;
        this.next = null;
    }

    //ich werde jeweils das startpunkt(head) und auch das endpunkt(tail) initalizieren.
    private VerketteListeIterativ head; //Listenanfang
    private VerketteListeIterativ tail; //Listenende

    // Methode zum Anhängen eines neuen Elements am ANFANG
    void addAnfang(int daten) {
        //checken ob element leer ist => wenn leer,
        // es ist der erste und der letzte element
        if(head==null){
            head=new VerketteListeIterativ(daten);
            tail= head;
            return;
        }
        //wenn emelente da sind, wir insert ein neue element am ANFANG der list.
        //wir müssen also eine neue Listenelement machen und von diesem neue ELement
        //neue Anfang festelegen.
        VerketteListeIterativ neueElementAnfang=new VerketteListeIterativ(daten);
        neueElementAnfang.next=head;
        head=neueElementAnfang;
    }

    void clearListe(){
        this.head=null;
    }

    //Methode zum Anhängen ein neue Element am ENDE
    void addEnde(int daten){
        //checken ob element leer ist => wenn leer,
        // es ist der erste und der letzte element
        if(head==null){
            head=new VerketteListeIterativ(daten);
            tail= head;
            return;
        }
        //Wenn elemente da sind, wir insert ein neue element am ENDE der Liste.
        //wir müssen also eine neue Listenelement machen und von diesem neue ELement
        //als Ende festelegen.
        VerketteListeIterativ neueElementEnde=new VerketteListeIterativ(daten);
        tail.next=neueElementEnde;
        tail=neueElementEnde;
    }

    //die Methode zur Ausgabe der Liste
    void ausgeben() {
        //zuerst lege ich eine current Element fest (Listenanfang=>head)
        VerketteListeIterativ current=head;
        while (current != null){
            System.out.print(current.daten+" => ");
            //das nächste Element ausgeben
            current=current.next;
        }

        System.out.println();
    }

    public void setDaten(int daten) {
    }
}

