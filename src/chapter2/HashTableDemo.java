package chapter2;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Hashtable是原始的java.util的一部分， 是一个Dictionary具体的实现
 像HashMap一样，Hashtable在哈希表中存储键/值对。当使用一个哈希表，
 要指定用作键的对象，以及要链接到该键的值。
 然后，该键经过哈希处理，所得到的散列码被用作存储在该表中值的索引。
 */
public class HashTableDemo {
    public static void main(String[] args){

        Hashtable balance =new Hashtable();
        Enumeration names;
        String str;
        double bal;

        balance.put("Zara",new Double(3434.34));
        balance.put("Mahnaz", new Double(123.22));
        balance.put("Ayan", new Double(1378.00));
        balance.put("Daisy", new Double(99.22));
        balance.put("Qadir", new Double(-19.08));

        names=balance.keys();
        while(names.hasMoreElements()){
            str=(String)names.nextElement();
            System.out.println(str+": "+balance.get(str));
        }

        System.out.println();
        bal=((Double)balance.get("Zara")).doubleValue();
        balance.put("Zara",new Double(bal+1000));

        System.out.println("Zara's new balance: " + balance.get("Zara"));
    }
}
