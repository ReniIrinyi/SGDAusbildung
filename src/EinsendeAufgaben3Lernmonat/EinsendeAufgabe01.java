package EinsendeAufgaben3Lernmonat;

import javax.swing.*;
import java.util.Arrays;

public class EinsendeAufgabe01 {
    /* ######################################################
    Einsendeaufgabe 4
    ###################################################### */

    public static void main(String[] args) {

        int [][] WarehouseStoreBoxes=new int [75][4];
        initalizeStorageBox(WarehouseStoreBoxes);
        executeStorageBoxCommand(WarehouseStoreBoxes);

    }

    //Die Methode "initalizeStorageBox" speichert die Daten der einzelnen Boxen in einem mehrdimensionalen Array.
    private static void initalizeStorageBox(int [][] array){
        //Laut Aufgabe war wichtig, dass jede Kiste eine eigene ID hat, wofür ich einfach ein int variable erstellt habe.
        int id=0;

        JOptionPane.showConfirmDialog(null, "Nun können Sie neue Kisten in Ihre Lagerverwaltungsprogramm aufnehmen. \n "+
                "Wenn sie alle Daten erfasst haben, können Sie 99 über Ihr Tastatur eingeben um den Programm zu verlassen.\n"+
                "Möchten sie fortfahren?");
        while(true){
            int i=  Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie die gewünschte Nr der Kiste an!\n"+
                    "Sie können eine Kiste von 1-75 auswählen. \n"+
                    "Um den Programm zu verlassen geben Sie bitte 99 über Ihr Tastatur ein.")) ;
            if(i==99){
                break;
            }
            int width=Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie die Breite der Kiste an!"));
            int length=Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie die Länge der Kiste an!"));
            int height=Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie die Höhe der Kiste an!"));

            //bei jeder Iteration +1 zur id-Variablen addieren, so dass ID-nr kontinuierlich und unique
            id++;

            //Als Benutzer kann es schwierig sein, zu verstehen, warum indexnnr bei der Suche abgerufen werden sollen,
            //so fand ich es einfacher, die Eingabe mit einer Bedingung zu steuern, so dass der Benutzer sich nicht
            //um indexnr kümmern muss, sondern den tatsächlichen physischen Wert eines Boxes (1,2,3) anstatt [0,1,2] angeben kann.
            array[i-1<=0  ? 0 :i-1][0]=id;
            array[i-1<=0  ? 0 :i-1][1]=width;
            array[i-1<=0  ? 0 :i-1][2]=length;
            array[i-1<=0  ? 0 :i-1][3]=height;
            System.out.println("-".repeat(15));
            System.out.println(Arrays.deepToString(array));
            System.out.println("-".repeat(15));

        }


    }
    private static void executeStorageBoxCommand(int [][] array){
        while(true){

            //es wird ein indexnr abgefragt => damit ich auf "aussere" Array zugreifen kann
            int i=Integer.parseInt(JOptionPane.showInputDialog(
                    "Bitte geben sie an, welche Kiste Sie ändern möchten!\n" +
                    "Die Kisten sind von 1-75 nummeriert."))-1;

            //Das Programm soll nur weiterlaufen, falls ein gesuchte Kiste vorhanden ist (id!=0).
            if(array[i][0]>0){
            String command=JOptionPane.showInputDialog
                    ("Bitte geben Sie die gewünschte Aufrag ein!\n" +
                    "Sie können zwischen den Folgenden Optionen wählen:\n"+
                    "Bitte tippen Sie die entsprechende Befehl über Ihre Tastatur ein.\n"+
                    "löschen =>Löschen der Kiste\n" +
                    "ändern => Ändern der Kiste\n"+
                    "anzeigen => Anzeigen der Daten\n"+
                    "auslisten => Auslisten alle vorhandenen Kisten\n"+
                    "beenden => Beenden der Programm");

            if(command.contains("löschen")){
                System.out.println("-".repeat(15));

                clearStorageBox(i, array);
                System.out.println(Arrays.deepToString(array));
            }
            if(command.contains("ändern")){
                System.out.println("-".repeat(15));

                modifyStorageBox(i, array);
                System.out.println(Arrays.deepToString(array));
            }
            if(command.contains("anzeigen")){
                System.out.println("-".repeat(15));

                showStorageBox(i, array);
            }
            if(command.contains("auslisten")){
                System.out.println("-".repeat(15));

                listAllStorageBoxes(array);
            }
            if(command.contains("beenden")){
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
    // in den methoden "clearStorageBox, modifyStorageBox, showStorageBox habe ich
    // als argument zzgl die indexnr, damit möchte ich auf das "aussere" Array zugreifen
    private static void clearStorageBox(int i, int[][] array){
        //löschvorgang => habe wie im Aufgabe vorgeschlagen die Werte auf 0 gestellt
        array[i][0]=0; //id
        array[i][1]=0; //breite
        array[i][2]=0; //länge
        array[i][3]=0; //höhe
    }
    private static void modifyStorageBox(int i, int[][] array){
        //änderung einzelne Boxen => zuerst werden die daten in einzelnen int variablen gespeichert, dann
        //die entsprechende Änderungen an Array vorgenommen.
        int width=Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie die Breite der Kiste an!"));
        int length=Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie die Länge der Kiste an!"));
        int height=Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie die Höhe der Kiste an!"));

        array[i][1]=width;
        array[i][2]=length;
        array[i][3]=height;
    }
    private static void showStorageBox(int i, int[][] array){
            System.out.printf("Breite der Kiste ist= %20s%n" +
                    "Länge der Kiste ist= %20s%n" +
                    "Höhe der Kiste ist= %20s%n",
                    array[i][1],array[i][2],array[i][3]);

    }

    //hier habe ich ein for loop erstellt damit all die Daten von den besetzten Kisten
    //ausgelistet werden können.
    private static void listAllStorageBoxes( int[][] array){

          for(int i=0; i<array.length; i++){
              //es war noch wichtig dass nur die Kisten ausgelistet werden, die wirklich besetzt sind
              // (haben ein ID nr)
              if(array[i][0]!=0){
                  System.out.printf("Daten der %s. Kiste: \n"
                          ,array[i][0]);
                  System.out.println("-".repeat(15));
                  System.out.printf(
                          "Breite der Kiste ist=%20s%n"+
                                  "Länge der Kiste ist=%20s%n"+
                                  "Höhe der Kiste ist=%20s%n",
                          array[i][1],array[i][2],array[i][3]);
                  System.out.println("-".repeat(15));
              }

          }

}


}









