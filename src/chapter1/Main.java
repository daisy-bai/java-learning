package chapter1;

/**
 * daisy.bai 2018.10.08
 */
public class Main {
    //final static double PI=3.14;
    public static void main(String[] args) {
       /* final char MALE='M';
        final int UP;
        UP=1;
        double avg1=79.5;
        int rise=10;
        double avg2=avg1+rise;//自动类型转换
        System.out.println(avg1);
        System.out.println(avg2);*/

       /* int a = 5;
        int b = 3;
        int c = 3;
        int d = 3;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a++ = " + (a++));
        System.out.println("++a = " + (++a));
        System.out.println("b-- = " + (b--));
        System.out.println("--b = " + (--b));
        System.out.println("c++ = " + (c++));
        System.out.println("++d = " + (++d));
*/
       /* int a = 60;
        int b = 13;
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 2 = " + (a << 2));
        System.out.println("a >> 2 = " + (a >> 2));
        System.out.println("a >>> 2 = " + (a >>> 2));*/

       /* boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!a = " + (!a));
        System.out.println("a ^ b = " + (a ^ b));*/

        /*int a = 5;
        int b = 3;
        b += a;
        System.out.println("b += a  = " + b);
        b = 3;
        b -= a;
        System.out.println("b -= a = " + b);
        b = 3;
        b *= a;
        System.out.println("b *= a = " + b);
        b = 3;
        b /= a;
        System.out.println("b /= a = " + b);
        b = 3;
        b %= a;
        System.out.println("b %= a  = " + b);*/

        /*int a = 3;
        int b = 5;
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));

        double score = 68.9;
        String str = (score >= 60) ? "及格" : "不及格";
        System.out.println("考试成绩："+str);*/

        /*int days = 31;
        if (days > 30)
            System.out.println("本月是大月");
        else
            System.out.println("本月是小月");*/

        /*int score = 78;
        if (score >= 60) {
            if (score >= 80) {
                if (score >= 90) {
                    System.out.println("成绩优秀");
                } else {
                    System.out.println("成绩良好");
                }
            } else {
                System.out.println("成绩及格");
            }
        } else {
            System.out.println("需要补考");
        }*/

        /*int num = 2;
        switch (num) {
            case 1:
                System.out.println("恭喜你，获得了一等奖");
                break;
            case 2:
                System.out.println("恭喜你，获得了二等奖");
                break;
            case 3:
                System.out.println("恭喜你，获得了三等奖");
                break;
            default:
                System.out.println("很遗憾，下次再来");
        }
*/

        /*int i1 = 1, i2 = 1;
        int sum1 = 0, sum2 = 0;

        while (i1 <= 1000) {     //循环1000次
            if (0 == i1 % 2) {   //判断是否为偶数
                sum1 += i1;    //将偶数加入到总数里
            }
            i1++;              //i自增1
        }
        System.out.println("用while，1到1000中，所有偶数的和为：" + sum1);*/

        /*do {
            if (0 == i2 % 2) {   //在条件语句中，将数值写在前面是为了防止将==写成了=
                sum2 += i2;
            }
            i2++;
        } while (i2 <= 1000);
        System.out.println("用do-while，1到1000中，所有偶数的和为：" + sum2);


        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (0 == i % 2) {
                sum += i;
            }
        }
        System.out.println("用for，1到1000中，所有偶数和为：" + sum);*/

        /*// 外层循环控制行数
        for (int i = 1; i <= 5; i++) {

            // 内层循环控制每行的数
            // 内层循环变量的最大值和外层循环变量的值相等
            for (int j = 1; j <= i; j++) {

                System.out.print(j);
            }

            // 每打印完一行后进行换行
            System.out.println();
        }*/

        /*for(int i = 1; i <= 10; i++){
            System.out.println("循环第"+i+"次");
            if(0 == i % 3){
                break;
            }
            if(0 == i % 5){
                System.out.println("我进来了！");
            }
        }
*/
       /* for(int i = 1; i <= 10; i++){
            if(0 == i % 2) //判断i是否为偶数
                continue;  //通过continue结束本次循环
            System.out.println(i);
        }*/

        /*int [] ages = {12,18,9,33,45,60}; //声明并初始化了一个整型数组，它有6个元素
        char [] symbol = new char[10]; //声明并分配了一个长度为10的char型数组

        int [] a1 = {1,2,3};
        int [] a2;
        a2 = a1;

        for(int i = 0; i < a2.length; i++){
            a2[i]++;
        }
        for(int i = 0; i < a1.length; i++){
            System.out.println(a1[i]);
        }*/

        /*int [] ages = {12, 18, 9, 33, 45, 60};
        for(int i = 0; i < ages.length; i++){ //ages.length是获取数组的长度
            System.out.println("数组中第"+(i+1)+"个元素是 "+ages[i]); //数组下标是从零开始，一定要注意
        }
*/

        /*int [] ages = {12, 18, 9, 33, 45, 60};
        int i = 1;
        for(int age:ages){
            System.out.println("数组中第"+i+"个元素是"+age);
            i++;
        }*/

       /* String [][] name = {{"ZhaoYi", "QianEr", "SunSan"},
                {"LiSi", "ZhouWu", "WuLiu"}};
        for(int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.println(name[i][j] );
            }
        }
*/

        // 创建对象，对象名为a
        Main a = new Main();

        int rSum;  //设置一个int型变量，用来接收方法的返回值

        // 调用方法，传入两门课程的成绩
        rSum = a.calcSum(78,99);
        System.out.println("总分："+ rSum);

        double rAve;   //用来存放返回的平均成绩

        //两课的成绩，是我们实际的参数
        int sub1 = 78;
        int sub2 = 99;

        // 调用方法，传入两门课程的成绩
        rAve = a.calcAve(sub1,sub2);
        System.out.println("平均分："+rAve);

        a.f(3456);
        a.f(34.56f);
        a.f("abc");
        a.f("abc","def");
        a.f("abc",3456);

        //创建对象，调用我们自己定义的有参构造方法
       // People XiaoMing = new People(168, 21, 1);

        People LiLei = new People();    //创建了一个People对象LiLei
        //利用setter方法为属性赋值
        LiLei.setHeight(170.0);

        //利用getter方法取属性值
        System.out.println("LiLei的身高是"+LiLei.getHeight());

        //测试成员内部类
        People b = new People();     //创建外部类对象，对象名为a
        People.Student c = b.new Student(); //使用外部类对象创建内部类对象，对象名为b
        // 或者为 People.Student b = a.new Student();
        c.stuInfo();   //调用内部对象的suInfo方法

    }
    /*
     * 功能：计算两门课程考试成绩的总分并输出总分
     * 定义一个包含两个参数的方法，用来传入两门课程的成绩
     */
    public int calcSum(int a, int b){
        int sum= a + b;
        return sum;
    }

    public void printName(String name){
        System.out.println(name);
    }

    /*
     * 功能：计算两门课程考试成绩的平均分并输出平均分
     * 定义一个包含两个参数的方法，用来传入两门课程的成绩
     * 两个参数 a 和 b 为我们的形参，只在方法内有效
     */
    public double calcAve(int a, int b){
        double ave = (a + b) / 2;
        return ave;
    }


    void f(int i) {
        System.out.println("i=" + i);
    }

    void f(float f) {
        System.out.println("f=" + f);
    }

    void f(String s) {
        System.out.println("s=" + s);
    }

    void f(String s1, String s2){
        System.out.println("s1+s2="+(s1+s2));
    }

    void f(String s, int i){
        System.out.println("s="+s+",i="+i);
    }
}


class People {
    //属性（成员变量） 有什么
   // double height;  //身高
    //属性（成员变量）有什么，前面添加了访问修饰符private
//变成了私有属性，必须通过方法调用
    private double height;     //身高
    int age;     //年龄
    int sex;    //性别，0为男性，非0为女性

    //方法 干什么
    void cry(){
        System.out.println("我在哭！");
    }
    void laugh(){
        System.out.println("我在笑！");
    }
    void printBaseMes(){
        System.out.println("我的身高是"+height+"cm");
        System.out.println("我的年龄是"+age+"岁");
        if(this.sex==0)
            System.out.println("我是男性！");
        else
            System.out.println("我是女性！");

    }
    //无参构造方法
    public People(){

    }
    //有一个参数的构造方法
    public People(int age){

    }

    //构造函数，初始化了所有属性
    public People(double h, int a, int s){
        height = h;
        age = a;
        sex = s;
    }

    //属性已经封装好了，如果用户需要调用属性
//必须用getter和setter方法进行调用
//getter和setter方法需要程序员自己定义
    public double getHeight(){
        //getter 方法命名是get关键字加属性名（属性名首字母大写）
        //getter 方法一般是为了得到属性值
        return height;
    }

    //同理设置我们的setter方法
//setter 方法命名是set关键字加属性名（首字母大写）
//setter 方法一般是给属性值赋值，所以有一个参数
    public void setHeight(double newHeight){
        height = newHeight;
    }


    private String name = "LiLei";         //外部类的私有属性
    //内部类Student
    public class Student {
        String ID = "20151234";               //内部类的成员属性
        //内部类的方法
        public void stuInfo(){
            System.out.println("访问外部类中的name：" + name);
            System.out.println("访问内部类中的ID：" + ID);
        }
    }

}
