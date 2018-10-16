package chapter6;

class Rock{
    String str="abc";
    String s;
    Rock(String s){
        //System.out.print("Rock");
        this.s=s;
    }
    Rock(){
        //System.out.print("Rock");
    }
}

class Tree{
    int height;
    Tree(){
        System.out.println("Planting a seeding");
        height=0;
    }
    Tree(int initialHeight){
        height=initialHeight;
        System.out.println("Creating new Tree that is "+height+" feet tall");
    }
    void info(){
        System.out.println("Tree is "+height+" feet tall");
    }

    void info(String s){
        System.out.println(s+": Tree is "+height+" feet tall");
    }
}

class Banana{
    void peel(int i){
        System.out.println(i);
    }
}

class Leaf{
    int i=0;
    Leaf increment(){
        i++;
        return this;
    }
}
public class SimpleConstructor {
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            Tree t=new Tree(i);
            t.info();
            t.info("overload method");
        }
        //System.out.println(new Rock().str);
        //System.out.println(new Rock("123").s);
        f("String first",11);
        f(11,"Int first");

        Banana a=new Banana();
        Banana b=new Banana();
        a.peel(1);
        b.peel(2);

        Leaf x=new Leaf();
        System.out.println(x.increment().increment().increment().i);
    }
    static void f(String s,int i){
        System.out.println("String: "+s+",int:"+i);
    }
    static void f(int i,String s){
        System.out.println("int: "+i+",String i:"+s);
    }
}
