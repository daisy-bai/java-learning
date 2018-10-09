package chapter1;



/*那抽象类如何用代码实现呢，它的规则如下：

        用 abstract 修饰符定义抽象类

        用 abstract 修饰符定义抽象方法，只用声明，不需要实现

        包含抽象方法的类就是抽象类

        抽象类中可以包含普通的方法，也可以没有抽象方法

        抽象类的对象不能直接创建，我们通常是定义引用变量指向子类对象。*/

public abstract class TelPhone {
    public abstract void call();  //抽象方法,打电话
    public abstract void message(); //抽象方法，发短信
}
