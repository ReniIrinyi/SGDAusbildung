package ÜbungsAufgbanen3Lernmonat;

public class EinfachBeschinneneVerketteteListe {
        public static void main(String[] args) {
            VerketteListeIterativ listenAnfang = new VerketteListeIterativ(0);
            System.out.print("-".repeat(25));
            System.out.print(" AM ENDE DER LISTE HINZUFÜGEN ");
            System.out.println("-".repeat(25));
            for(int element=1; element<=10; element++){
                System.out.print("Nachdem wir "+element+" hinzugefügt haben dann wurde: ");
                listenAnfang.addEnde(element);
                listenAnfang.ausgeben();
            }

        }
    }
    class VerketteteListeIterativ {
        int daten;
        VerketteListeIterativ next;
        VerketteListeIterativ head; //Listenanfang
        VerketteListeIterativ tail; //Listenende
        VerketteListeIterativ current; //Listenende
        public void VerketteListeIterativ(int daten) {
            this.daten = daten;
            this.next = null;
        }
        public void setDaten(int daten) {
            this.daten = daten;
        }
        void addEnde(int daten){
            if(head==null){
                head=new VerketteListeIterativ( daten);
                head.setDaten(daten);
                tail= head;
                return;
            }
            tail.addEnde(daten);
        }
        void ausgeben() {
            current=head;
            if(current!=null) {
                System.out.print(current.daten+" => ");
                current.ausgeben();
            }else {
                head=current;
                System.out.println(" ENDE ");
            }
        }
    }


