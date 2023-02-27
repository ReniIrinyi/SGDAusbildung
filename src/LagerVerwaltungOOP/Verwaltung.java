package LagerVerwaltungOOP;


import javax.swing.*;

class Kiste {
     String name;
     int ID, width, height, length;
    Kiste neu;

    @Override
    public String toString() {
        return "Kiste{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", neueKiste=" + neu +
                '}';
    }

    public void neueKistenBestand(Kiste neueBestand){

        JOptionPane.showConfirmDialog(null, "Nun können Sie neue Kiste in Ihre Lagerverwaltungsprogramm aufnehmen. \n "+
                "Wenn sie alle Daten erfasst haben, können Sie 00 über Ihr Tastatur eingeben um den Programm zu verlassen.\n"+
                "Möchten sie fortfahren?");
        while(true){
            int anzahl=Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie an, wie viele Kisten Sie aufnehmen möchten!"));
            if(anzahl==00){
                break;
            }
            int width=Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie die Breite der Kiste an!"));
            int length=Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie die Länge der Kiste an!"));
            int height=Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie die Höhe der Kiste an!"));
            for(int i=1; i<=anzahl; i++) {
                KisteAnhängen(width, height,length, neueBestand);

            }
        }
    }

    public void clearStorageBox(Kiste box, int ID ){
        if(box.ID==ID){
            //TO FIX?? HOW can i get access to the box with the ID? => the set THAT value to 0 / clear
        }

    }

    public void modifyStorageBox(Kiste box, int ID ){
        int width=Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie die Breite der Kiste an!"));
        int length=Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie die Länge der Kiste an!"));
        int height=Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie die Höhe der Kiste an!"));
        //TO FIX?? HOW can i get access to the box with the ID? => the set THAT value to 0 / clear
    }

    public void showStorageBox(Kiste box, int ID){
        //TO FIX?? HOW can i get access to the box with the ID? => the set THAT value to 0 / clear
        box.toString();
    }
    public void showALLStorageBox(Kiste box){
        Kiste helferKiste;
        helferKiste=box;
        while(helferKiste.neu!=null)
            helferKiste=helferKiste.neu;
        System.out.println(helferKiste);
    }

    public void setDaten(int width, int height, int length, Kiste neueKiste){
        System.out.println("Kiste hinzugefügt \n"+ neueKiste);
        neueKiste.width=width;
        neueKiste.height=height;
        neueKiste.length= length;
        neueKiste.neu =null;
        neueKiste.ID=neueKiste.ID+1;

    }

    public void executeStorageBoxCommand(Kiste box) {
        while (true) {
            int ID = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie an, welche Kiste Sie ändern möchten!"));
            String command = JOptionPane.showInputDialog
                    ("Bitte geben Sie die gewünschte Aufrag ein!\n" +
                            "Sie können zwischen den Folgenden Optionen wählen:\n" +
                            "Bitte tippen Sie die entsprechende Befehl über Ihre Tastatur ein.\n" +
                            "löschen =>Löschen der Kiste\n" +
                            "ändern => Ändern der Kiste\n" +
                            "anzeigen => Anzeigen der Daten\n" +
                            "auslisten => Auslisten alle vorhandenen Kiste\n" +

                            "beenden => Beenden der Programm");
            if (box.ID == ID) // TO FIX => SUCHEN anhand id in box-class?
            {
                if (command.contains("löschen")) {
                    System.out.println("-".repeat(15));
                    clearStorageBox(box, ID);

                }
                if (command.contains("ändern")) {
                    System.out.println("-".repeat(15));
                    modifyStorageBox(box, ID);

                }
                if (command.contains("anzeigen")) {
                    System.out.println("-".repeat(15));
                    showStorageBox(box, ID);
                }
                if (command.contains("auslisten")) {
                    System.out.println("-".repeat(15));
                    showALLStorageBox(box);
                }
                if (command.contains("beenden")) {
                    break;
                }
            } else {
                //falls eine Kiste nicht existiert (id==0)
                System.out.println("-".repeat(15));
                System.out.println("Die gesuchte Kiste ist leider nicht in unserem Datenbank!");
                System.out.println("-".repeat(15));
            }
        }
    }



    public void KisteAnhängen( int width, int height, int lenght, Kiste anfang){

        Kiste helferKiste;
        helferKiste=anfang;
        System.out.println("liste Anhängen: "+helferKiste);
        while(helferKiste.neu !=null)
            helferKiste=anfang.neu;
        setDaten( width, height, lenght, helferKiste);
    }





}
public class Verwaltung {
    public static void main(String[] args) {
        Kiste neueBestand = new Kiste();
        neueBestand.neueKistenBestand(neueBestand);
        neueBestand.executeStorageBoxCommand(neueBestand);
    }



}

