package chapter1;

//匿名内部类，顾名思义，就是没有名字的内部类。
// 正因为没有名字，所以匿名内部类只能使用一次，它通常用来简化代码编写。
// 但使用匿名内部类还有个前提条件：必须继承一个父类或实现一个接口。
public class Outer {

    //匿名内部类是不能加访问修饰符的。要注意的是，new 匿名类，这个类是要先定义的,如果不先定义，编译时会报错该类找不到。

    //同时，在上面的例子中，当所在的方法的形参需要在内部类里面使用时，该形参必须为final。
    // 这里可以看到形参 name 已经定义为final了，而形参city 没有被使用则不用定义为final。
    public Inner getInner(final String name,String city){

        return new Inner() {
            private String nameStr=name;
            @Override
            public String getName() {
                return nameStr;
            }
        };

       /* return new Inner(name, city) {
            private String nameStr = name;

            public String getName() {
                return nameStr;
            }
        };*/
    }

    public static void main(String[] args) {
        //测试匿名内部类
        Outer outer = new Outer();
        Inner inner = outer.getInner("Inner", "NewYork");
        System.out.println(inner.getName());
    }
}

interface Inner{
    String getName();
}

