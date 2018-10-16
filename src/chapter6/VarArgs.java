package chapter6;

class A{}

public class VarArgs {
    static void printArray(Object... args){
        for(Object obj:args){
            System.out.print(obj+" ");
        }
        System.out.println();
    }
    static void f(int required,String... trailing){
        System.out.print("required:"+required+" ");
        for(String s:trailing){
            System.out.print(s+" ");
        }
        System.out.println();
    }
    static void g(Character... args){
        System.out.print(args.getClass());
        System.out.println(args.length);
    }
    static void h(int... args){
        System.out.print(args.getClass());
        System.out.println(args.length);
    }

    static void I(Integer... args){
        for(Integer i:args){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        /*printArray(new Object[]{new Integer(47),new Float(3.14),new Double(11.11)});
        printArray(new Object[]{"one","two","three"});
        printArray(new Object[]{new A(),new A(),new A()});*/

        printArray(new Integer(47),new Float(3.14),new Double(11.11));
        printArray(47,3.14F,11.11);
        printArray("one","two","three");
        printArray(new A(),new A(),new A());
        printArray((Object[])new Integer[]{1,2,3,4});
        printArray();

        f(1,"one");
        f(2,"two","three");
        f(0);

        g('a');
        g();

        h(1);
        h();
        System.out.println("int[]:"+new int[0].getClass());

        I(new Integer(1),new Integer(2));
        I(4,5,6,7,8,9);
        I(10,new Integer(11),12);

    }
}
