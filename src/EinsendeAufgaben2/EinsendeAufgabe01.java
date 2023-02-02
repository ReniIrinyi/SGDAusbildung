
/* ####################################################
Einsendeaufgabe 2.1
#################################################### */

public class EinsendeAufgabe01 {
    public static void main(String[] args) {
        int counter=0;
      while(true){
        if(counter<2){
            stringer2();
            stringer5();
            counter++;
          } else {
            stringer2();
            break;
        }
      }
    }

    public static void stringer2(){
        for (int i = 0; i < 2; i++) {
            System.out.println("\t" + '"' + "\t");
        }
    }
    public static void stringer5(){
        for (int j = 0; j < 5; j++) {
            System.out.println("\b#\t\t#");
        }
    }
}
