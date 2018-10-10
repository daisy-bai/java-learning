package chapter2;

import java.util.HashMap;
import java.util.Map;

/**
 * Dictionary 类是一个抽象类，用来存储键/值对，作用和Map类相似。
 * 给出键和值，你就可以将值存储在Dictionary对象中。一旦该值被存储，
 * 就可以通过它的键来获取它。所以和Map一样，
 * Dictionary 也可以作为一个键/值对列表。
 */
public class DictionaryDemo {
    public static void main(String[] args){
        Map m1=new HashMap();
        m1.put("Zara","8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");

        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + m1);
    }
}
