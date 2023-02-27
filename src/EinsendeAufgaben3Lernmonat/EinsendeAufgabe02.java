package EinsendeAufgaben3Lernmonat;
/* ######################################################
Einsendeaufgabe 5.1
###################################################### */

public class EinsendeAufgabe02 {
    public static void main(String[] args) {
        //neue fernseher-instanz erstellen mit default parameters => siehe constructor, line 52
        Fernseher fernseher=new Fernseher();

        fernseher.setAn(true); //einschalten
        fernseher.setSound(5); //lautstärke auf 5
        fernseher.setAn(false); //ausschalten

        fernseher.setSound(5); //=> funktioniert nicht,da nicht eingeschaltet
        fernseher.setProgramm(4); //=> funktioniert nicht,da nicht eingeschaltet

        fernseher.setAn(true); //wieder einschalten
        fernseher.setProgramm(4);
        fernseher.setProgramm(1);
        fernseher.setProgramm(3);
        fernseher.setAn(false); //ausschalten
    }
}

//Vereinbarung der Fernseher klasse mit drei private variablen: int sound=> Lautstärke; int programm=> Program; boolean an => an/ausschalten
    class Fernseher{
        private int sound;
        private int programm;

        //Für ein/ausschalten habe ich ein boolean variable erstellt. Wenn es auf true ist, der Fernseher ist eingeschaltet.
        private boolean an;

        // default ist der Fernseher ausgeschaltet, und ist auf 3. Programm und auf 5.Lautstärke eingestellt.
        public Fernseher() {
            this.sound = 5;
            this.programm = 3;
            this.an = false;
        }

        public void setSound(int sound) {
            // Lautstärke nur änderbar, wenn der Fernseher eingeschaltet ist => an!=false
            if(this.an){
                System.out.println("Lautstärke ändern zu= "+sound);
                this.sound = sound;
                toString();
                //wenn an!=true, wird ein String über auf der Konsole ausgegeben.
            } else {
                System.out.println("Fernseher ist nicht eingeschaltet");
                return;
            }
        }
        public void setProgramm(int programm) {
            // Programm nur änderbar, wenn der Fernseher eingeschaltet ist => an!=false
            if(this.an){
                System.out.println("Program wechseln zu="+programm);
                this.programm = programm;
                toString();
                //wenn an!=true, wird ein String über auf der Konsole ausgegeben.
            } else {
                System.out.println("Fernseher ist nicht eingeschaltet");
                return;
            }
        }
        //über diesen Setter "setAn" können wir der Fernseher ein/ausschalten, mit hilfe einer boolean=> true: eingeschaltet; false:ausgeschaltet
        public void setAn(boolean an) {

            System.out.println(an==true ? "Fernseher einschalten" : "Fernseher ausschalten");
            this.an = an;
        }

        //mit ein toString methode werde ich die aktuellen Zustand der Fernseher über den Konsole ausgeben.
        @Override
        public String toString() {
            String string= "Aktuelle Infos zu Fernseher: \n Lautstärke ist= " + sound +
                    ",und es läuft das programm= " + programm +
                    ",Fernseher ist gerade= "+ (an==true ? "angeschaltet" : "ausgeschaltet");
            System.out.println(string);
            return string;
        }
    }



