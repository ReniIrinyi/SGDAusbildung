package EinsendeAufgaben3Lernmonat;

public class Main {
    public static void main(String[] args) {

        Listenelement2 listenAnfang = new Listenelement2(0);

        System.out.print("-".repeat(25));
        System.out.print(" AM ENDE DER LISTE HINZUFÜGEN RECURSIVE METHODE ");
        System.out.println("-".repeat(25));
        for(int element=1; element<=5; element++){
            System.out.print("Nachdem wir "+element+" hinzugefügt haben dann wurde: ");
            listenAnfang.addEnde(element);
            listenAnfang.ausgeben();
        }
        System.out.println();


        Listenelement listenRückwärts = new Listenelement(0);

        System.out.print("-".repeat(25));
        System.out.print(" AM ANFANG DER LISTE HINZUFÜGEN + Rückwärts ausgeben RECURSIVE METHODE ");
        System.out.println("-".repeat(25));
        for(int element=1; element<=5; element++){
            listenRückwärts.addAnfang(element);
        }
        listenRückwärts.ausgebenRückwärts();
        System.out.println();

    }

}
