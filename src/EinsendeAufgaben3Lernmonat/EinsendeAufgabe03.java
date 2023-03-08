package EinsendeAufgaben3Lernmonat;

/* ######################################################
Einsendeaufgabe 5.2
###################################################### */

/*
[]=>[]=>[]=>null

insert neu am ENDE :1. neues Element muss auf null zeigen [new last]=>null
                    2. vorherige(current) element muss auf letzte zeigen [old last (current)]=>[new last]=>null
                    3. wie erreiche ich last? => current muss anhalten vor last (current!=null)
 */


public class EinsendeAufgabe03 {
    public static void main(String[] args) {
        //ein neues Listenelement erzeugen
        Listenelement2 listenAnfang = new Listenelement2();
        System.out.print("-".repeat(25));
        System.out.print(" AM ENDE DER LISTE HINZUFÜGEN ");
        System.out.println("-".repeat(25));
        for(int element=1; element<=20; element++){
            System.out.print("Nachdem wir "+element+" hinzugefügt haben dann wurde: ");
            listenAnfang.addEnde(element);
            listenAnfang.ausgeben();
        }

        }
    }


//die Klasse für die Listenelemente mit Methoden
class Listenelement2 {
    int daten;
    //ich werde jeweils das startpunkt(head) und auch das endpunkt(tail), und ein aktuelles element(current) initalizieren.
     Listenelement2 head; //Listenanfang
     Listenelement2 last; //Listenende
    Listenelement2 current; //aktuelle element
//ein setter methode um die daten der elemente zu ändern
    public void setDaten(int daten) {
        this.daten = daten;
    }
    //Methode zum Anhängen ein neue Element am ENDE der Liste
    void addEnde(int daten){
        //checken ob element leer ist =>
        if(head==null){
            head=new Listenelement2();
            head.setDaten(daten);
            last = head;
            //wenn leer, aktuelles element ist die listenanfang
            current=head;
            return;
        }
        //Wenn elemente da sind, wir fügen ein neues element am ENDE der Liste ein.
        //wir müssen also eine neue Listenelement machen und von diesem neue ELement
        //als Ende festelegen => mit addEnde -method

        //letzte element ist nun die aktuelle element
        last=current;
        //un nun können wir eine neue element einfügen mit dem rekursiven Aufruf der addEnde methode
        last.addEnde(daten);
    }
    //die Methode zur Ausgabe der Liste
    void ausgeben() {
        if(current!=null) {
            System.out.print(current.daten+" => ");
            current.ausgeben();
        }else {
            System.out.println(" ENDE ");
        }
    }


}
