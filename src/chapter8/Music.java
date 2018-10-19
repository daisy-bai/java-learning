package chapter8;

//抽象方法与抽象类
import static chapter6.Print.print;

abstract class Instrument1{
    private int i;
    public abstract void play(Note n);
    public String what(){return "Instrument";}
    public abstract void adjust();

}
class Wind1 extends Instrument1{
    public void play(Note n){
        print("Wind1.play()"+n);
    }
    public void adjust(){ }
    public String what(){return "Wind1";}
}

class Percuss extends Instrument1{
    public void play(Note n){
        print("Percuss.play()"+n);
    }
    public void adjust(){ }
    public String what(){return "Percuss";}
}

class Brass1 extends Instrument1{
    public void play(Note n){
        print("Brass1.play()"+n);
    }
    public void adjust(){ print("Brass1.adjust");}
    public String what(){return "Brass1";}
}

public class Music {
    static void tune(Instrument1 i){
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument1[] e){
        for (Instrument1 o :e) {
            tune(o);
        }
    }
    public static void main(String[] args){
        Instrument1[] t={new Wind1(),new Percuss(),new Brass1()};
        tuneAll(t);
    }
}
