import javax.swing.*;

/* ####################################################
Einsendeaufgabe 3.5
#################################################### */
public class EinsendeAufgabe09 {
    public static void main(String[] args) {
        rechner();
    }
    public static void rechner(){
        int eingabe1=Integer.parseInt(JOptionPane.showInputDialog("Geben Sie ein Zahl"));
        int eingabe2=Integer.parseInt(JOptionPane.showInputDialog("Geben Sie ein Zahl"));
        String eingabeOp=JOptionPane.showInputDialog("Geben Sie die gewünschte Rechenoperation ein:" +
                "\n / = Division \n - = Subtraktion \n + = Addition \n * = Multiplikation \n ** = Potenz");
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
            case ("**"): result = potenz(eingabe1,eingabe2);
                System.out.println(result);
                break;
        };


    }

    public static int potenz(int eingabe1, int eingabe2){
        int result=eingabe1;
        for(int i=1; i<
                eingabe2; i++){
            result*= eingabe1;
        }
        return result;
    }

}
