package EinsendeAufgaben3Lernmonat;

/* ######################################################

Einsendeaufgabe 5.3

###################################################### */
public class EinsendeAufgabe04 {
    public static void main(String[] args) {
        //ein neues Listenelement erzeugen
        Listenelement listenAnfang = new Listenelement(0);

        System.out.print("-".repeat(25));
        System.out.print(" AM ANFANG DER LISTE HINZUFÜGEN + Rückwärts ausgeben ");
        System.out.println("-".repeat(25));
        for(int element=1; element<=5; element++){
            listenAnfang.addAnfang(element);
        }
        listenAnfang.ausgebenRückwärts();
    }
}
//die Klasse für die Listenelemente mit Methoden
class Listenelement {
    int daten;
    //ich werde jeweils das startpunkt(head) und auch das endpunkt(tail) initalizieren.
    Listenelement next;
    Listenelement head; //Listenanfang
    Listenelement tail; //Listenende
    Listenelement current; //Listenende
    Listenelement prev; //vorherige

    //constructor
    Listenelement(int daten) {
        this.daten = daten;
    }

    public void setDaten(int daten) {
        this.daten = daten;
    }

    // Methode zum Anhängen eines neuen Elements am ANFANG
    void addAnfang(int daten) {
        //checken ob element leer ist => wenn leer,
        // es ist der erste und der letzte element
        if(head==null) {
            head = new Listenelement(daten);
            head.setDaten(daten);
            return;
        }

        //wenn emelente da sind, wir insert ein neue element am ANFANG der list.
        //wir müssen also eine neue Listenelement machen und von diesem neue ELement
        //neue Anfang festelegen.

        head.addAnfang(daten);
       // Listenelement neueElementAnfang=new Listenelement(daten);
        //neueElementAnfang.next=head;
        //head=neueElementAnfang;
    }

    //die Methode zur Ausgabe der Liste
    void ausgebenRückwärts() {
        //zuerst lege ich eine current Element fest (Listenanfang=>head)
        //ich brauche eine temporäre Variable als "prev", und "nächste" das ist
        //die "vorherige" und der "nächste" element. Es ist auf null gesetzt, weil am Anfang tatsächlich der Wert null hat
        //Listenelement prev=null;
        //Listenelement nächste=null;
        current=head;
        //prev=null;
        //next=null;
        //while (current != null){
        if(current!=null){
            next=current;
            next.ausgebenRückwärts();
            System.out.print(next.daten+" => ");

        } else {
            current=next;
            System.out.print("NULL => ");
        }

            //referenz der erste element muss auf den nächsten referenz umgeändert werden
            //nächste=current.next;
             //nächste element in der liste muss auf prev(vorherigen element) zeigen
            //current.next=prev;
            //so jetzt müssen wir nur noch den "prev" als current einstellen
            //prev=current;
            //und den current als der nächste element
            //current=nächste;

        }



}


