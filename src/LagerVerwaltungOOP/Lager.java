package LagerVerwaltungOOP;

import javax.swing.*;
import java.util.ArrayList;

public class Lager {
    private ArrayList<Kiste> kisten;
    public Lager() {
        kisten = new ArrayList<>();
    }
    public void addKisten(int Anzahl) {
        for (int i = 1; i <= Anzahl; i++) {
            kisten.add(new Kiste(i));
        }
    }
    public void setDaten(int width, int height, int length) {
        for (Kiste kiste : kisten) {
            kiste.setWidth(width);
            kiste.setLength(length);
            kiste.setHeight(height);
        }
    }
    public void addneueKisten(int width, int height, int lenght, int Anzahl) {
        addKisten(Anzahl);
        setDaten(width, height, lenght);
        listAllItems();
    }

    public boolean sucheID(int ID){
        boolean flag=false;
        for(Kiste kiste:kisten){
            if(kiste.getID()==ID){
               flag=true;
            }
        }
        return flag;

    }
    // TO FIX!!
    public void deleteKiste(int ID) {
      for(Kiste kiste:kisten){
         if(kiste.getID()==ID){
             kisten.remove(kiste);
             System.out.println("kiste" +kiste.toString() + " gelöscht");
        }
      }
    }
    public void setKisteDaten(int ID) {
        int width = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie die Breite der Kiste an!"));
        int length = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie die Länge der Kiste an!"));
        int height = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie die Höhe der Kiste an!"));

        for (Kiste kiste : kisten) {
            if (kiste.getID() == ID) {
                kiste.setHeight(height);
                kiste.setLength(length);
                kiste.setWidth(width);
                System.out.println("kiste" + kiste.toString() + "geändert");
            }

        }
    }
    public void listItems(int ID) {
        for(Kiste kiste:kisten){
            if(kiste.getID()==ID){
                 kiste.toString();
                     }
        }
    }

    public void listAllItems() {
        for(Kiste kiste:kisten){
            kiste.toString();
        }
    }




}
