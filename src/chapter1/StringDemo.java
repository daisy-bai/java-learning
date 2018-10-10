package chapter1;

import java.util.Arrays;
import java.util.List;

public class StringDemo {
    public static void main(String[] args) {

        char[] helloArray = {'r', 'u', 'n', 'n', 'b'};
        String helloString = new String(helloArray);
        System.out.println(helloArray);

        String site = "www.runoob.com";
        int len = site.length();
        System.out.println("网址长度为：" + len);
        System.out.println(site.charAt(8));

        //连接字符串
        String s1 = "my name is ";
        String s2 = "daisy bai";
        System.out.println(s1.concat(s2));

        /**
         * 不同的字符在较短字符串长度之内时，
         * 返回值=原字符串与参数字符串中第一个不同字符相差的ASCII码值，为原减参。
         *
         * 不同的字符在较短字符串长度之外时
         * 返回值=原字符串与参数字符串相差的字符个数，原字符串长度大时为正，反之为负。
         */

        System.out.println(s1.compareTo(s2));

        System.out.println(s1.toCharArray());

        System.out.println("my address is "+site+"and length is "+site.length());

        //创建格式化字符串
        float floatVar=1;
        int intVar=3;
        String stringVar="daisy.bai";

        System.out.printf("浮点变量的值为："+"%f,整型变量的值为："+" %d,字符串变量的值为："+" is %s",floatVar,intVar,stringVar);

        System.out.println(String.format("浮点变量的值为："+"%f,整型变量的值为："+" %d,字符串变量的值为："+" is %s",floatVar,intVar,stringVar));


        //StringBuffer的使用
        StringBuffer stringBuffer=new StringBuffer("My name ");
        stringBuffer.append("is");
        stringBuffer.append(" daisy.bai");

        System.out.println(stringBuffer);
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer.toString());

        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuffer.reverse());

        System.out.println(stringBuffer.replace(0,2,"My new"));
        System.out.println(stringBuffer.delete(3,6));
        System.out.println(stringBuffer.insert(3,6));

    }
}
