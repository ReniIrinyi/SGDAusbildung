package LagerVerwaltungOOP;

import javax.swing.*;
import java.util.ArrayList;

public class Verwaltung {
    private Lager lager;
    private ArrayList<Kiste> kisten;


    public Verwaltung(Lager lager) {
        this.lager = lager;
        kisten = new ArrayList<>();
    }
    public void hauptmenu() {
        while (true) {
        String command = JOptionPane.showInputDialog
                ("Bitte geben Sie die gewünschte Aufrag ein!\n" +
                        "Sie können zwischen den Folgenden Optionen wählen:\n" +
                        "Bitte tippen Sie die entsprechende Befehl über Ihre Tastatur ein.\n" +
                        "neu => Neue Kistenbestand anlegen\n" +
                        "ändern => Bestehende Kisten ändern\n" +
                        "auslisten => Auslisten alle vorhandenen Kiste\n" +
                        "beenden => Beenden der Programm");

            if (command.contains("neu")) {
                neueBestandsAufnahme();
            }
            if (command.contains("ändern")) {
                ändernBestand();
            }
            if (command.contains("auslisten")) {
                System.out.println("-".repeat(15));
                lager.listAllItems();
                hauptmenu();
            }
            if (command.contains("beenden")) {
                break;
            }
        }
    }
    public void neueBestandsAufnahme() {
            int anzahl = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie an, wie viele Kiste Sie aufnehmen möchten!"));
            int width = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie die Breite der Kiste an!"));
            int length = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie die Länge der Kiste an!"));
            int height = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie die Höhe der Kiste an!"));
            lager.addneueKisten(width, height, length, anzahl);
            hauptmenu();

    }

    public void ändernBestand() {

        String command = JOptionPane.showInputDialog
                    ("Bitte geben Sie die gewünschte Aufrag ein!\n" +
                            "Sie können zwischen den Folgenden Optionen wählen:\n" +
                            "Bitte tippen Sie die entsprechende Befehl über Ihre Tastatur ein.\n" +
                            "löschen =>Löschen der Kiste\n" +
                            "ändern => Ändern der Kiste\n" +
                            "anzeigen => Anzeigen der Daten\n" +
                            "hauptmenu => Zurück zur Hauptmenu\n");


        if (command.contains("hauptmenu")){
            if (command.contains("hauptmenu")) {
                hauptmenu();}

        } else {

            if (command.contains("anzeigen")) {
                int ID = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie an, welche Kiste Sie ausgeben möchten!"));
                if (lager.sucheID(ID)) {
                    System.out.println("-".repeat(15));
                    lager.listItems(ID);

                }
                hauptmenu();
            }
                int ID = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie an, welche Kiste Sie ändern möchten!"));
                if (lager.sucheID(ID)) {
                        if (command.contains("löschen")) {
                            System.out.println("-".repeat(15));
                            lager.deleteKiste(ID);

                        }
                        if (command.contains("ändern")) {
                            System.out.println("-".repeat(15));
                            lager.setKisteDaten(ID);

                        }
                    hauptmenu();
            }

        }
        System.out.println("-".repeat(15));
        System.out.println("Die gesuchte Kiste ist leider nicht in unserem Datenbank!");
        System.out.println("-".repeat(15));
    }
}
