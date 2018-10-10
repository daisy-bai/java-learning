package chapter1;

import java.util.regex.Pattern;
import java.util.regex.*;

public class RegexDemo {
    public static void main(String[] args){
        String content="my name is daisy.bai";

        String pattern=".*daisy.*";

        boolean isMatch= Pattern.matches(pattern,content);
        System.out.println("字符串中是否包含了 'daisy' 子字符串? " + isMatch);


        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        String pattern1 = "(\\D*)(\\d+)(.*)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern1);
        // 现在创建 matcher 对象
        Matcher m=r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) );
        } else {
            System.out.println("NO MATCH");
        }

    }
}
