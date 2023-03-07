package ÜbungsAufgbanen3Lernmonat;
public class Pointer {
    private int value;
    private int upperbound;

    public Pointer(int upperbound) {
        this.value =0;
        this.upperbound = upperbound;
    }

    public void tick(){
        this.value=this.value+1;
        if(this.value>=this.upperbound){
            this.value=0;
        }
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        if(this.value<10){
            System.out.print("0"+this.value);
            return "0"+this.value;
        }
        System.out.print("this.value");
        return ""+this.value;
    }
}

