package ÜbungsAufgbanen3Lernmonat;

public class Clock {
    private Pointer hours;
    private Pointer minutes;
   private Pointer seconds;

    public Clock() {
        this.hours =new Pointer(24);
        this.minutes =new Pointer(60);
        this.seconds =new Pointer(60);
    }

    public void tack(){
        this.seconds.tick();
        if(this.seconds.getValue()==0){
            this.minutes.tick();
            if(this.minutes.getValue()==0){
                this.hours.tick();
            }
        }
    }

    @Override
    public String toString() {
        System.out.println(this.hours+":"+this.minutes+":"+this.seconds);
        return this.hours+":"+this.minutes+":"+this.seconds;
    }
}
