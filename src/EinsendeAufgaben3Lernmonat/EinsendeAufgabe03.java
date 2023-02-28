package EinsendeAufgaben3Lernmonat;

/* ######################################################
Einsendeaufgabe 5.2
###################################################### */
public class EinsendeAufgabe03 {
    public static void main(String[] args) {
        //ein neues Listenelement erzeugen
        Listenelement2 listenAnfang = new Listenelement2(0);

        System.out.print("-".repeat(25));
        System.out.print(" AM ENDE DER LISTE HINZUFÜGEN ");
        System.out.println("-".repeat(25));
        for(int element=1; element<=20; element++){
            listenAnfang.addEnde(element);
            System.out.println("Nachdem wir "+element+" hinzugefügt haben dann wurde: ");
            listenAnfang.ausgeben();
        }

        }
    }


//die Klasse für die Listenelemente mit Methoden
class Listenelement2 {
    int daten;
    Listenelement2 next;

    //constructor
     Listenelement2(int daten) {
        this.daten = daten;
        this.next = null;
    }

    //ich werde jeweils das startpunkt(head) und auch das endpunkt(tail) initalizieren.
    private Listenelement2 head; //Listenanfang
    private Listenelement2 tail; //Listenende

    //Methode zum Anhängen ein neue Element am ENDE
    void addEnde(int daten){
        //checken ob element leer ist => wenn leer,
        // es ist der erste und der letzte element
        if(head==null){
            head=new Listenelement2(daten);
            tail= head;
            return;
        }
        //Wenn elemente da sind, wir insert ein neue element am ENDE der Liste.
        //wir müssen also eine neue Listenelement machen und von diesem neue ELement
        //als Ende festelegen.
        Listenelement2 neueElementEnde=new Listenelement2(daten);
        tail.next=neueElementEnde;
        tail=neueElementEnde;
    }

    //die Methode zur Ausgabe der Liste
    void ausgeben() {
        //zuerst lege ich eine current Element fest (Listenanfang=>head)
        Listenelement2 current=head;
        while (current != null){
            System.out.print(current.daten+" => ");
            //das nächste Element ausgeben
            current=current.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

}
