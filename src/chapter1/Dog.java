package chapter1;


//子类拥有父类除private以外的所有属性和方法
//子类可以拥有自己的属性和方法
//子类可以重写实现父类的方法
//Java 中的继承是单继承，一个类只有一个父类
//Java 实现多继承的一个办法是 implements（实现）接口

public class Dog extends Animal{

    //重写父类方法,实现多态的方法之一
    public void bark(){
        super.bark();//调用父类的方法
        System.out.println("汪！汪！汪！");
    }

    //Dog类的构造方法
    public Dog(){

        System.out.println("子类的构造方法被调用！");
    }

    //子类自己的方法
    public void dogType() {
        System.out.println("这是什么品种的狗？");
    }
}
