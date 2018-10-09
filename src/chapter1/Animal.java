package chapter1;


public class Animal {

    public int legNum=4;//动物四肢数量
    //类方法
    public void bark(){
        System.out.println("动物叫！");
    }

    //Animal的构造方法
    public Animal(){
        System.out.println("动物有" + legNum + "腿");
        System.out.println("父类的构造方法被调用！");
    }

}
