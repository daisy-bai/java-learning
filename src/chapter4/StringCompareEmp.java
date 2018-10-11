package chapter4;

/**
 * 字符串比较
 */
public class StringCompareEmp {
    public static void main(String[] args){
        String str="hello world";
        String anotherString ="Hello World";

        Object objStr=str;

        System.out.println(str.compareTo(anotherString));
        System.out.println(str.compareToIgnoreCase(anotherString));
        System.out.println(str.compareTo(objStr.toString()));
    }
}
