package chapter6;

import java.util.Arrays;

import static chapter6.Print.*;
import static chapter6.Range.*;

enum Spiciness{
    NOT,MILD,MEDIUM,HOT,FLAMING
}
class Burrito{
    Spiciness degree;
    Burrito(Spiciness degree){this.degree=degree;}
    void describe(){
        System.out.print("this burrito is ");
        switch (degree){
            case NOT:System.out.println("not spicy at all");
            break;
            case MILD:
            case MEDIUM:System.out.println("a little hot");
                break;
            case HOT:
            case FLAMING:
                default:System.out.println("maybe too hot");
        }
    }
}
public class EnumOrder {
    public static void main(String[] args){
        Spiciness howhot=Spiciness.HOT;
        System.out.println(howhot);

        for(Spiciness s:Spiciness.values())
            System.out.println(s+",ordinal "+s.ordinal());

        Burrito plain=new Burrito(Spiciness.NOT);
        Burrito greenChile=new Burrito(Spiciness.MEDIUM);
        Burrito jalapeno=new Burrito(Spiciness.HOT);
        plain.describe();
        greenChile.describe();
        jalapeno.describe();

        print(100);
        int[] a=range(10);
        print(Arrays.toString(a));
    }
}
