package chapter2;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 枚举（The Enumeration）接口定义了一种从数据结构中取回连续元素的方式。
 */
public class EnumerationTester {
    public static void main(String[] args){
        Enumeration<String> days;
        Vector<String> dayNames=new Vector<String>();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");

        days=dayNames.elements();
        while(days.hasMoreElements()){
            System.out.println(days.nextElement());
        }
    }
}
