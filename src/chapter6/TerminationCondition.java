package chapter6;


import java.util.Arrays;
import java.util.Random;

class Window{
    Window(int marker){
        System.out.println("Window("+marker+")");
    }
}

class House{
    Window w1=new Window(1);
    House(){
        System.out.println("House()");
        Window w3=new Window(33);
    }
    Window w2=new Window(2);
    void f(){
        System.out.println("f()");
    }
    Window w3=new Window(3);
}

class Bowl{
    Bowl(int marker){
        System.out.println("Bowl("+marker+")");
    }
    void f1(int marker){
        System.out.println("f1("+marker+")");
    }
}
class Table{
    static Bowl bowl1=new Bowl(1);
    Table(){
        System.out.println("Table()");
        bowl2.f1(1);
    }
    void f2(int marker){
        System.out.println("f2("+marker+")");
    }
    static Bowl bowl2=new Bowl(2);
}

class Cupbord{
    Bowl bowl3=new Bowl(3);
    static Bowl bowl4=new Bowl(4);
    Cupbord(){
        System.out.println("Cupbord()");
        bowl4.f1(2);
    }
    void f3(int marker){
        System.out.println("f3("+marker+")");
    }
    static Bowl bowl5=new Bowl(5);
}

public class TerminationCondition {
    public static void main(String[] args){
        /*Book novel=new Book(true);
        novel.checkIn();;
        new Book(true);
        System.gc();

        boolean bool=false;
        char ch='x';
        byte b=47;
        short s=0xff;
        int i=999;
        long lng=1;
        float f=3.14f;
        double d=3.14159;
        Depth depth=new Depth();
       // System.out.println(depth);

        int j=f();
        int m=g(j);

        System.out.println(j);
        System.out.println(m);

        House h=new House();
        h.f();*/

        System.out.println();
        System.out.println("Creating new Cupbord() in mian");
        new Cupbord();
        System.out.println("Creating new Cupbord() in mian");
        new Cupbord();
        table.f2(1);
        cupbord.f3(1);

        System.out.println();

        Random random=new Random(47);
        int[] a=new int[random.nextInt(20)];
        System.out.println("length of a is "+a.length);
        System.out.println(Arrays.toString(a));

        Integer[] b=new Integer[random.nextInt(20)];
        System.out.println("length of a is "+b.length);
        for(int i=0;i<b.length;i++){
            b[i]=random.nextInt(500);
        }
        System.out.println(Arrays.toString(b));

        Integer[] c={new Integer(1),new Integer(2),3};
        System.out.println(Arrays.toString(c));
        Integer[] d=new Integer[]{new Integer(4),new Integer(5),6};
        System.out.println(Arrays.toString(d));

        Other.main(new String[]{"fiddle","de","dum"});

    }

    static Table table=new Table();
    static Cupbord cupbord=new Cupbord();

    public static int f(){
        return 11;
    }
    public static int g(int i){
        return i*11;
    }
}

class Other{
    public static void main(String[] args){
        for(String s:args)
            System.out.print(s+" ");
    }
}

class Depth{}

class Book{
    boolean checkedOut=false;
    Book(boolean checkOut){
        checkedOut=checkOut;
    }
    void checkIn(){
    checkedOut=false;
}

    protected void finalize(){
        if(checkedOut)
            System.out.println("Error: checked out");
    }

}