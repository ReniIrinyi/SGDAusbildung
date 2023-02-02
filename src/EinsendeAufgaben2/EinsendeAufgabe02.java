
/* ####################################################
Einsendeaufgabe 2.2
#################################################### */

import javax.swing.*;

public class EinsendeAufgabe02 {

    public static void main(String[] args) {
        dividor();

    }
    public static double dividor(){
        int eingabe1= Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie eine Zahl an"));
        int eingabe2= Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie eine Zahl an"));
        double result= eingabe1/eingabe2;
        System.out.println("das Ergebnis ist: "+result);
        return result;
    }
}
