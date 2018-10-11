package chapter4;

import java.io.IOException;
import java.util.*;

public class CollectionsPractice {
    public static void main(String[] args) throws IOException{
        int n=5;
        String[] str=new String[n];
        for(int i=0;i<n;i++)
            str[i]=String.valueOf(i);
        //数组转集合
        List<String> list=Arrays.asList(str);
        for(String li:list)
            System.out.println(li);

        String[] coins = { "Penny", "nickel", "dime", "Quarter", "dollar" };
        Set<String> set=new TreeSet<String>();
        for(int i=0;i<coins.length;i++){
            set.add(coins[i]);
        }
        System.out.println(Collections.min(set));
        System.out.println(Collections.min(set,String.CASE_INSENSITIVE_ORDER));
        for (int i = 0; i <= 10; i++) {
            System.out.print("-");
        }
        System.out.println("");
        System.out.println(Collections.max(set));
        System.out.println(Collections.max(set, String.CASE_INSENSITIVE_ORDER));

        HashMap<String,String> map=new HashMap<String,String>();
        map.put("1","1st");
        map.put("2","2nd");
        map.put("3","3rd");
        Collection cl=map.values();
        Iterator it=cl.iterator();
        while (it.hasNext())
            System.out.println(it.next());


        List<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            list1.add(new Integer(i));
        System.out.println("打乱前:");
        System.out.println(list1);

        for (int i = 1; i < 6; i++) {
            System.out.println("第" + i + "次打乱：");
            Collections.shuffle(list1);
            System.out.println(list1);
        }

        // List集合的遍历
        listTest();
        // Set集合的遍历
        setTest();

    }
    private static void setTest() {
        Set<String> set = new HashSet<String>();
        set.add("JAVA");
        set.add("C");
        set.add("C++");
        // 重复数据添加失败
        set.add("JAVA");
        set.add("JAVASCRIPT");

        // 使用iterator遍历set集合
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }

        // 使用增强for循环遍历set集合
        for(String s: set){
            System.out.println(s);
        }
    }
    // 遍历list集合
    private static void listTest() {
        List<String> list = new ArrayList<String>();
        list.add("菜");
        list.add("鸟");
        list.add("教");
        list.add("程");
        list.add("www.runoob.com");

        // 使用iterator遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }

        // 使用传统for循环进行遍历
        for (int i = 0, size = list.size(); i < size; i++) {
            String value = list.get(i);
            System.out.println(value);
        }

        // 使用增强for循环进行遍历
        for (String value : list) {
            System.out.println(value);
        }
    }
}
