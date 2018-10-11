package chapter4;

import java.util.StringTokenizer;

/**
 * 字符串分割
 */
public class StringSplitDemo {
    public static void main(String[] args){
        String str="www-runoob-com";
        String[] temp;
        String delimeter="-";// 指定分割字符
        temp=str.split(delimeter);// 分割字符串

        System.out.println(temp.length);

        for(String s:temp){
            System.out.println(s);
            System.out.println(" ");

        }

        // 实例化对象，并指向以 . 对 str 进行分割
        StringTokenizer str2=new StringTokenizer(str,"-");
        while(str2.hasMoreTokens())
            System.out.println(str2.nextToken());

        System.out.println(str.toUpperCase());

        String first_str = "Welcome to Microsoft";
        String second_str = "I work with microsoft";

        boolean match1 = first_str.regionMatches(11, second_str, 12, 9);
        boolean match2 = first_str.regionMatches(true, 11, second_str, 12, 9); //第一个参数 true 表示忽略大小写区别
        System.out.println("区分大小写返回值：" + match1);
        System.out.println("不区分大小写返回值：" + match2);
    }
}
