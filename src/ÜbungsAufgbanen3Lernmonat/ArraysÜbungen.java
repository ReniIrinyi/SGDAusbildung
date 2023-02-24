package ÜbungsAufgbanen3Lernmonat;

import javax.swing.*;

public class ArraysÜbungen {
    public static void main(String[] args) {

        int[] zahlenArray = new int[5];
        eingabe(zahlenArray);
        System.out.println(java.util.Arrays.toString(zahlenArray));
        System.exit(0);

        /*######################################################### Sonderfunktionen für ArraysÜbungen ##########################################################*/
        //ein Array für int mit 5 Elementen
        int[] zahlen = new int[5];
        //ein Array für int mit nur einem Element
        int[] zahlen2 = new int[1];
        //zwei int-Variablen für die Suche
        int suche, treffer;
//die Werte einlesen
        for (int element = 0; element < zahlen.length; element++)
//bitte in einer Zeile eingeben zahlen[element]=Integer.parseInt (JOptionPane.showInputDialog("Bitte geben Sie die " + (element + 1) + ". Zahl ein"));
//die eingelesenen Werte in das zweite kleinere //Array kopieren
//die Größe des Ziels wird automatisch angepasst zahlen2 = ArraysÜbungen.copyOf(zahlen, zahlen.length);
            //die Werte sortieren und ausgeben
            java.util.Arrays.sort(zahlen2);
        for (int element : zahlen2)
            System.out.println(element);
//den Wert für die Suche einlesen
//bitte in einer Zeile eingeben
        suche = Integer.parseInt(JOptionPane.showInputDialog ("Nach welcher Zahl möchten Sie suchen?"));
//und suchen
        treffer = java.util.Arrays.binarySearch(zahlen2, suche);
        if (treffer < 0)
//bitte in einer Zeile eingeben
            System.out.println("Das gesuchte Element wurde nicht gefunden");
else
//bitte in einer Zeile eingeben
System.out.println("Das gesuchte Element befindet sich an der Position " + (treffer + 1));
        System.exit(0);
    }
    /*######################################################### Ein Array als Argument für eine Methode ##########################################################*/

        static void eingabe(int[] argArray) {
            //das Einlesen in das Array
            for(int index = 0; index < argArray.length; index++)

                argArray[index] = Integer.parseInt( JOptionPane.showInputDialog("Bitte die " + (index + 1) + ". Zahl eingeben"));
        }
        static void quadrat(int[] argArray) {
            for (int element: argArray)
                //bitte in einer Zeile eingeben
                System.out.println("Das Quadrat von " + element +
                        " ist " + (element * element));
        }






}