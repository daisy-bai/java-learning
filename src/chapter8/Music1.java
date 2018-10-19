package chapter8;

import static chapter6.Print.print;

interface Instrument2{
    int VALUE=5;
    void play(Note n);
    void adjust();

}
class Wind2 implements Instrument2{
    public void play(Note n){
        print("Wind2.play()"+n);
    }
    public void adjust(){ }
    public String what(){return "Wind2";}
}

class Percuss1 implements Instrument2{
    public void play(Note n){
        print("Percuss1.play()"+n);
    }
    public void adjust(){ }
    public String what(){return "Percuss";}
}

class Brass2 implements Instrument2{
    public void play(Note n){
        print("Brass2.play()"+n);
    }
    public void adjust(){ print("Brass2.adjust");}
    public String what(){return "Brass2";}
}
public class Music1 {
    static void tune(Instrument2 i){
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument2[] e){
        for (Instrument2 o :e) {
            tune(o);
        }
    }
    public static void main(String[] args){
        Instrument2[] t1={new Wind2(),new Percuss1(),new Brass2()};
        tuneAll(t1);

    }
}
