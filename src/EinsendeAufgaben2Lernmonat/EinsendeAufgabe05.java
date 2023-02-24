import javax.swing.*;

/* ####################################################
Einsendeaufgabe 3.1
#################################################### */
public class EinsendeAufgabe05 {
    public static void main(String[] args) {
        int jahresZahl=Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Jahreszahl an!"));
        if (schaltJahr(jahresZahl)){
            System.out.println("Schaltjahr");
        } else System.out.println("Es ist kein Schaltjahr");
    }

    public static boolean schaltJahr(int eingabe){
        return eingabe % 4 ==0 && eingabe % 100 !=0 ||
                eingabe%4==0 && eingabe%100==0 && eingabe%400==0 ? true : false;
    }
}
