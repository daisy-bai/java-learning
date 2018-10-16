package chapter6;


class Sundae{
    private Sundae(){ }
    static Sundae makeASundae(){
        return new Sundae();
    }
}

class Soup1{
    private Soup1(){};
    public static Soup1 makeSoup(){
        return new Soup1();
    }
}
//单例模式,始终只能创建一个对象
class Soup2{
    private Soup2(){}
    private static Soup2 soup2=new Soup2();
    public static Soup2 access(){
        return soup2;
    }
    public void f(){}
}

public class Main {
    Sundae s=Sundae.makeASundae();
    Soup1 soup1=Soup1.makeSoup();
    Soup2 soup2=Soup2.access();
}
