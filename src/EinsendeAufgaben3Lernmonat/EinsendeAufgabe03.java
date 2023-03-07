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
        for(int element=1; element<=5; element++){
            System.out.print("Nachdem wir "+element+" hinzugefügt haben dann wurde: ");
            listenAnfang.addEnde(element);
            listenAnfang.ausgeben();
        }

        }
    }


//die Klasse für die Listenelemente mit Methoden
class Listenelement2 {
    int daten;
    //ich werde jeweils das startpunkt(head) und auch das endpunkt(tail) initalizieren.
     Listenelement2 next;
     Listenelement2 head; //Listenanfang
     Listenelement2 tail; //Listenende
    Listenelement2 current; //Listenende
    //constructor
     Listenelement2(int daten) {
        this.daten = daten;
    }

    public void setDaten(int daten) {
        this.daten = daten;
    }

    //Methode zum Anhängen ein neue Element am ENDE
    void addEnde(int daten){
        //checken ob element leer ist => wenn leer,
        // es ist der erste und der letzte element
        if(head==null){
            head=new Listenelement2(daten);
            head.setDaten(daten);
            tail= head;
            return;
        }
        //Wenn elemente da sind, wir fügen ein neues element am ENDE der Liste ein.
        //wir müssen also eine neue Listenelement machen und von diesem neue ELement
        //als Ende festelegen => mit addEnde -method
        //Listenelement2 neueElementEnde=new Listenelement2(daten);
        tail.addEnde(daten);
        //tail.next=neueElementEnde;
       // tail=neueElementEnde;
    }

    //die Methode zur Ausgabe der Liste
    void ausgeben() {
        //zuerst lege ich eine current Element fest (Listenanfang=>head)
        //Listenelement2 current=head;
        current=head;
        //while (current != null){
        if(current!=null) {
            System.out.print(current.daten+" => ");
            current.ausgeben();

        }else {
          head=current;
            System.out.println(" ENDE ");
        }

          //  System.out.print(current.daten+" => ");
            //das nächste Element ausgeben
           // current=current.next;

        }


}
