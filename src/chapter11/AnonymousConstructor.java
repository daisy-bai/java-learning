package chapter11;


import java.security.PublicKey;

interface SubDestination{
    String readLabel();
}
abstract class Base{
    public Base(int i){
        System.out.println("Base Constructor:i= "+i);
    }
    public abstract void f();
}

public class AnonymousConstructor {
    public static Base getBase(int i){
        return new Base(i){
            {
                System.out.println("Inside instance initializer");
            }
            public void f(){
                System.out.println("In anonymous f()");
            }
        };
    }

    public SubDestination subDestination(final String dest,final float price){
        return new SubDestination() {
            private int cost;
            //实例初始化
            {
                cost=Math.round(price);
                if(cost>100)
                    System.out.println("Over budget");
            }
            private String label=dest;
            @Override
            public String readLabel() {
                return label;
            }
        };

    }
    public static void main(String[] args){
        Base b=getBase(10);
        b.f();

        AnonymousConstructor ac=new AnonymousConstructor();
        SubDestination sd=ac.subDestination("daisybai",101.395f);
    }

}
