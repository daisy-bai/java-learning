package chapter2;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * Properties 继承于 Hashtable.表示一个持久的属性集.
 * 属性列表中每个键及其对应值都是一个字符串。
 */
public class PropertiesDemo {
    public static void main(String[] args){
        Properties capitals=new Properties();
        Set states;
        String str;
        capitals.put("Illinois", "Springfield");
        capitals.put("Missouri", "Jefferson City");
        capitals.put("Washington", "Olympia");
        capitals.put("California", "Sacramento");
        capitals.put("Indiana", "Indianapolis");

        states=capitals.keySet();
        Iterator itr=states.iterator();
        while(itr.hasNext()){
            str=(String)itr.next();
            System.out.println("The capital of "+ str+" is "+capitals.getProperty(str)+".");
        }
        System.out.println();

        Enumeration num=capitals.propertyNames();
        String bal;
        while(num.hasMoreElements()){
            bal=(String)num.nextElement();
            System.out.println("The capital of "+ bal+" is "+capitals.getProperty(bal)+".");
        }

    }

}
