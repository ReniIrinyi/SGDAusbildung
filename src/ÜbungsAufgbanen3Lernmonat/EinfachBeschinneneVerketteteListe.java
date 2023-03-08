package ÜbungsAufgbanen3Lernmonat;

public class EinfachBeschinneneVerketteteListe {
        public static void main(String[] args) {
            VerketteteListeRecursive listenAnfang = new VerketteteListeRecursive();
            System.out.print("-".repeat(25));
           System.out.print(" AM ENDE DER LISTE HINZUFÜGEN ");
            System.out.println("-".repeat(25));
            for(int element=1; element<=20; element++){
              System.out.print("Nachdem wir "+element+" hinzugefügt haben dann wurde: ");
                listenAnfang.addEnde(element);
                listenAnfang.ausgeben();
            }
            listenAnfang.addEnde(999);
            listenAnfang.ausgeben();
        }
    }
    class VerketteteListeRecursive {
        int daten;
        VerketteteListeRecursive head; //Listenanfang
        VerketteteListeRecursive last; //Listenende
        VerketteteListeRecursive current; //Listenende

        public void setDaten(int daten) {
            this.daten = daten;
        }
        void addEnde(int daten){
            if(head==null){
                head=new VerketteteListeRecursive();
                head.setDaten(daten);
                current=head;
                return;
            }
            last = head;
            last.addEnde(daten);
            last=current;
        }
        void ausgeben() {
            if(current!=null) {
                System.out.print(current.daten+" => ");
                current.ausgeben();
            }else {
                System.out.println(" ENDE ");
            }
        }
    }


