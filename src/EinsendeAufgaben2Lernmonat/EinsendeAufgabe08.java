import javax.swing.*;

/* ####################################################
Einsendeaufgabe 3.4
#################################################### */
public class EinsendeAufgabe08 {
    public static void main(String[] args) {
       rechner();
    }

    public static void rechner(){
        int eingabe1=Integer.parseInt(JOptionPane.showInputDialog("Geben Sie ein Zahl"));
        int eingabe2=Integer.parseInt(JOptionPane.showInputDialog("Geben Sie ein Zahl"));
        String eingabeOp=JOptionPane.showInputDialog("Geben Sie die gewünschte Rechenoperation ein:" +
                "\n / = Division \n - = Subtraktion \n + = Addition \n * = Multiplikation");
        double result;
         switch (eingabeOp) {
            case ("/"): result= eingabe1 / eingabe2;
                System.out.println(result);
                break;
            case ("+"): result = eingabe1 + eingabe2;
                System.out.println(result);
                break;
            case ("-"): result = eingabe1 - eingabe2;
                System.out.println(result);
                break;
            case ("*"): result = eingabe1 * eingabe2;
                System.out.println(result);
                break;
            };


        }


    }



