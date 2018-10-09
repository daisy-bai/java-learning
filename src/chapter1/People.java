package chapter1;

public class People {
    //属性（成员变量） 有什么
    // double height;  //身高
    //属性（成员变量）有什么，前面添加了访问修饰符private
//变成了私有属性，必须通过方法调用
    private double height;     //身高
    int age;     //年龄
    int sex;    //性别，0为男性，非0为女性

    //方法 干什么
    void cry() {
        System.out.println("我在哭！");
    }

    void laugh() {
        System.out.println("我在笑！");
    }

    void printBaseMes() {
        System.out.println("我的身高是" + height + "cm");
        System.out.println("我的年龄是" + age + "岁");
        if (this.sex == 0)
            System.out.println("我是男性！");
        else
            System.out.println("我是女性！");

    }

    //无参构造方法
    public People() {

    }

    //有一个参数的构造方法
    public People(int age) {

    }

    //构造函数，初始化了所有属性
    public People(double h, int a, int s) {
        height = h;
        age = a;
        sex = s;
    }

    //属性已经封装好了，如果用户需要调用属性
//必须用getter和setter方法进行调用
//getter和setter方法需要程序员自己定义
    public double getHeight() {
        //getter 方法命名是get关键字加属性名（属性名首字母大写）
        //getter 方法一般是为了得到属性值
        return height;
    }

    //同理设置我们的setter方法
//setter 方法命名是set关键字加属性名（首字母大写）
//setter 方法一般是给属性值赋值，所以有一个参数
    public void setHeight(double newHeight) {
        height = newHeight;
    }


    private String name = "LiLei";         //外部类的私有属性

    //内部类Student
    public class Student {
        String ID = "20151234";               //内部类的成员属性

        //内部类的方法
        public void stuInfo() {
            System.out.println("访问外部类中的name：" + name);
            System.out.println("访问内部类中的ID：" + ID);
        }
    }

    static String ID = "510xxx199X0724XXXX";//静态变量

    //静态内部类Student
    public static class Student1 {
        String ID = "20151234";               //内部类的成员属性

        //内部类的方法
        public void stuInfo() {
            System.out.println("访问外部类中的name：" + (new People().name));//静态内部类不能直接访问外部类的非静态成员，但可以通过 new 外部类().成员 的方式访问
            System.out.println("访问外部类中的ID：" + People.ID);//如果外部类的静态成员与内部类的成员名称相同，可通过类名.静态成员访问外部类的静态成员；如果外部类的静态成员与内部类的成员名称不相同，则可通过成员名直接调用外部类的静态成员
            System.out.println("访问内部类中的ID：" + ID);
        }
    }


    //定义在外部类中的方法内：
    public void peopleInfo() {

        final String sex = "man";  //外部类方法中的常量

        class Student {
            String ID = "20151234"; //内部类中的常量

            public void print() {
                System.out.println("访问外部类的方法中的常量sex：" + sex);
                System.out.println("访问内部类中的变量ID:" + ID);
            }
        }

        Student a = new Student();  //创建方法内部类的对象
        a.print();//调用内部类的方法
    }

    //定义在外部类中的作用域内
    public void peopleInfo2(boolean b) {

        if (b) {

            final String sex = "man";  //外部类方法中的常量
            class Student {
                String ID = "20151234"; //内部类中的常量

                public void print() {
                    System.out.println("访问外部类的方法中的常量sex：" + sex);
                    System.out.println("访问内部类中的变量ID:" + ID);
                }
            }
            Student a = new Student();  //创建方法内部类的对象
            a.print();//调用内部类的方法
        }
    }

    public static void main(String[] args) {
        //创建对象，调用我们自己定义的有参构造方法
        // People XiaoMing = new People(168, 21, 1);

        People LiLei = new People();    //创建了一个People对象LiLei
        //利用setter方法为属性赋值
        LiLei.setHeight(170.0);

        //利用getter方法取属性值
        System.out.println("LiLei的身高是"+LiLei.getHeight());

        //测试成员内部类
        People people = new People();     //创建外部类对象，对象名为a
        People.Student student = people.new Student(); //使用外部类对象创建内部类对象，对象名为b
        // 或者为 People.Student b = a.new Student();
        student.stuInfo();   //调用内部对象的suInfo方法


        //测试静态成员内部类
        People.Student1 b = new People.Student1();   //直接创建内部类对象，对象名为b
        b.stuInfo();                 //调用内部对象的suInfo方法

        //测试方法内部类
        People people1 = new People(); //创建外部类的对象
        System.out.println("定义在方法内：===========");
        people1.peopleInfo();  //调用外部类的方法
        System.out.println("定义在作用域内：===========");
        people1.peopleInfo2(true);

    }
}