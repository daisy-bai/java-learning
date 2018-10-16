package chapter7;

import static chapter6.Print.print;

class WaterSource{
    private String s;
    WaterSource(){
        print("WaterSource()");
        s="Constructed";
    }
    public String toString(){
        return s;
    }
}
//组合形式
public class SprinklerSystem {
    //1、定义的地方初始化
    private String valve1="Happy",valve2="happy",valve3,valve4;
    private WaterSource source;
    private int i;
    private float f;

    //2、类的构造器中初始化
    public SprinklerSystem(){
        print("Inside SprinkSystem()");
        valve3="Joy";
        f=3.14f;
        source=new WaterSource();
    }
    //3、使用实例初始化
    {
        i=47;
    }
    public String tostring(){
        //4、使用之前初始化，惰性初始化
        if(valve4==null)
            valve4="joy";
        return "valve1="+valve1+"\n"+
                "valve2="+valve2+"\n"+
                "valve3="+valve3+"\n"+
                "valve4="+valve4+"\n"+
                "i="+i+"\n"+"f="+f+"\n"+"source="+source;
    }

    public static void main(String[] args){
        SprinklerSystem sprinkler=new SprinklerSystem();
        print(sprinkler.tostring());
    }

}
