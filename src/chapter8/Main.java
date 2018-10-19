package chapter8;

import static chapter6.Print.print;

//多态,向上转型
enum Note{
    MIDDLE_C,C_SHARP,B_FLAT;
}
class Instrument{
    public void play(Note e){
        print("Instrument.paly()"+e);
    }
}
class Wind extends Instrument{
    public void play(Note e){
        print("Wind.play()"+e);
    }
}

class Stringed extends Instrument{
    public void play(Note e){
        print("Stringed.play()"+e);
    }
}

class Brass extends Instrument{
    public void play(Note e){
        print("Brass.play()"+e);
    }
}

public class Main {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }
    public static void main(String[] args){
        Wind flute=new Wind();
        Stringed violin=new Stringed();
        Brass french=new Brass();
        tune(flute);
        tune(violin);
        tune(french);
    }
}
