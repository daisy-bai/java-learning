package chapter1;


//继承的初始化顺序是先初始化父类再初始化子类。


/*final关键字可以修饰类、方法、属性和变量

final 修饰类，则该类不允许被继承，为最终类

final 修饰方法，则该方法不允许被覆盖（重写）

final 修饰属性：则该类的属性不会进行隐式的初始化（类的初始化属性必须有值）或在构造方法中赋值（但只能选其一）

final 修饰变量，则该变量的值只能赋一次值，即变为常量*/



/*
super关键字在子类内部使用，代表父类对象。

 访问父类的属性 super.属性名

 访问父类的方法 super.bark()

  子类构造方法需要调用父类的构造方法时，在子类的构造方法体里最前面的位置：super()
*/

//Java 实现多态有三个必要条件：继承、重写和向上转型（即父类引用指向子类对象）。
//Java中多态的实现方式：继承父类进行方法重写，抽象类和抽象方法，接口实现。

public class Test {
    public static void main(String[] args) {

        Animal animal=new Animal();//Annimal对象
        Dog dog = new Dog();//Dog对象

        //dog对象，向上转型为Animal类型，dog1是父类的引用指向的是子类的对象
        //不能使用一个子类的引用去指向父类的对象。
        //如果我们定义了一个指向子类对象的父类引用类型，那么它除了能够引用父类中定义的所有属性和方法外，还可以使用子类强大的功能。
        // 但是对于只存在于子类的方法和属性就不能获取。
        Animal dog1=new Dog();

        animal.bark();// 执行 Animal 类的方法
        dog.bark();//执行 Dog 类的方法

        //在这里，由于b是父类的引用，指向子类的对象，因此不能获取子类的方法（dogType()方法）,
        // 同时当调用bark()方法时，由于子类重写了父类的bark()方法,所以调用子类中的bark()方法。
        //因此，向上转型，在运行时，会遗忘子类对象中与父类对象中不同的方法，也会覆盖与父类中相同的方法——重写。（方法名，参数都相同）
        dog1.bark();//执行 Dog 类的方法
        dog.dogType();

        Integer x=5;//装箱，所以当内置数据类型被当作对象使用的时候，编译器会把内置类型装箱为包装类。
        x=x+10;
        System.out.println(x);

        System.out.println("90 度的正弦值：" + Math.sin(Math.PI/2));
        System.out.println("0度的余弦值：" + Math.cos(0));
        System.out.println("60度的正切值：" + Math.tan(Math.PI/3));
        System.out.println("1的反正切值： " + Math.atan(1));
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));
        System.out.println(Math.PI);


        double[] nums={1.4,1.5,1.6,-1.4,-1.5,-1.6};
        for(double num:nums){
            test(num);
        }

    }
    private static void test(double num){
        System.out.println("Math.floor(" + num + ")=" + Math.floor(num));
        System.out.println("Math.round(" + num + ")=" + Math.round(num));
        System.out.println("Math.ceil(" + num + ")=" + Math.ceil(num));
    }
}
