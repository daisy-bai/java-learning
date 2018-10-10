package chapter1;

/**
 * @author Daisy.bai
 * java的自动装箱与拆箱
 * 装箱就是自动将基本数据类型转换为包装器类型；拆箱就是自动将包装器类型转换为基本数据类型
 */
public class Number {
    public static void main(String[] args) {

        /*Integer i1 = 128; //装箱，相当于Integer.valueOf(128);
        int t = i1; //相当于i1.intValue()拆箱
        System.out.println(t);*/

        /**
         对于–128到127（默认是127）之间的值,被装箱后，会被放在内存里进行重用
         但是如果超出了这个值,系统会重新new 一个对象
         */
        Integer i1 = 200;
        Integer i2 = 200;

        /**
         注意 == 与 equals的区别
         == 它比较的是对象的地址
         equals 比较的是对象的内容
         */
        if (i1 == i2) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        /**
         * Java 会对 -128 ~ 127 的整数进行缓存，
         * 所以当定义两个变量初始化值位于 -128 ~ 127 之间时，
         * 两个变量使用了同一地址
         */
        Integer a=123;
        Integer b=123;
        System.out.println(a==b);
        System.out.println(a.equals(b));

        a=1230;
        b=1230;
        System.out.println(a==b);        // 输出 false
        System.out.println(a.equals(b));  // 输出 true

        //Character 类在对象中包装一个基本类型 char 的值
        char ch='a';
        char uniChar='\u039A';
        char[] charArray={'a','b','c','d','e'};

        Character cha=new Character('a');

    }

}
