package chapter11;

import javax.crypto.spec.DESKeySpec;

interface Destination{
    String readLabel();
}
interface Contents{
    int value();
}

class Wrapping{
    private int i;
    Wrapping(int x){
        i=x;
    }
    public int value(){
        return i;
    }
}
public class Parcel {

    //方法中的内部类
    public Destination destination(String s){
        class PDestination implements Destination{
            private String label;
            public PDestination(String s){
                label=s;
            }
            public String readLabel(){
                return label;
            }
        }
        return new PDestination(s);
    }

    //实现接口的内部类
    private class PContents implements Contents{
        private int i=11;
        public int value(){
            return i;
        }
    }
    public Contents contents(){
        return new PContents();
    }

    //作用域内的内部类
    public void internalTracking(boolean b){
        if(b){
            class TrackingSlip{
                private String id;
                TrackingSlip(String s){
                    id=s;
                }
                String getSlip(){
                    return id;
                }
            }
            TrackingSlip ts=new TrackingSlip("daisybai");
            String s=ts.getSlip();
            System.out.println(s);
        }
    }
    public void Track(){
        internalTracking(true);
    }

    //匿名内部类
    public Contents content1(){
        return new Contents() {
            private int i=12;
            @Override
            public int value() {
                return i;
            }
        };
    }
    //匿名内部类的等价形式
    class MyContents implements Contents{
        private int i=12;
        public int value(){
            return i;
        }
    }
    public Contents content2(){
        return new MyContents();
    }

    //基类需要一个有参数的构造函数
    public Wrapping wrapping(int x){
        return new Wrapping(x){
            public int value(){
                return super.value()*47;
            }
        };
    }


    public Destination destination1(final String dest){
        return new Destination(){
            private String label=dest;
            public String readLabel(){
                return label;
            }
        };
    }

    public static void main(String[] args){
        Parcel p=new Parcel();
        //方法中的内部类
        Destination d=p.destination("daisybai");
        //实现接口的内部类
        Parcel.PContents pc=p.new PContents();
        System.out.println(pc.value());
        //作用域内的内部类
        p.Track();
        //匿名内部类
        Contents c=p.content1();
        System.out.println(c.value());

        Wrapping w=p.wrapping(10);
        System.out.println(w.value());


    }
}
