package chapter7;

import static chapter6.Print.print;

class Art{
    /*Art(){
        print("Art Constructor");
    }*/
    Art(int i){
        print("Art Constructor");
    }
}
class Drawing extends Art{
   /* Drawing(){
        print("Drawing Constructor");
    }*/
    Drawing(int i){
        super(i);
        print("Drawing Constructor");
    }
}
public class Cartoon extends Drawing{
   Cartoon(){
       super(11);
        print("Cartoon Constructor");
    }
    public static void main(String[] args){
        Cartoon c=new Cartoon();
    }
}
