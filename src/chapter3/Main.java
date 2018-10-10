package chapter3;

import java.util.*;

public class Main {
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("HAHAHAHA");

        //第一种遍历方法使用foreach遍历List
        for(String str:list){
            System.out.println(str);
        }

        System.out.println();
        //第二种遍历，把链表变为数组相关的内容进行遍历
        String[] strArray=new String[list.size()];
        list.toArray(strArray);
        for(int i=0;i<strArray.length;i++)
        {
            System.out.println(strArray[i]);
        }

        System.out.println();
        //第三种遍历 使用迭代器进行相关遍历
        Iterator<String> ite=list.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }
        System.out.println();
        Map<String,String> map=new HashMap<String,String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");
        //第一种：普遍使用，二次取值
        System.out.println("通过Map.keySet遍历key和value：");
        for(String key:map.keySet()){
            System.out.println("key= "+key+" and value= "+map.get(key));
        }

        System.out.println();
        //第二种
        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<String,String>> it=map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,String> entry=it.next();
            System.out.println("key= " + entry.getKey()+" and value= " +entry.getValue());
        }

        System.out.println();
        //第三种：推荐，尤其是容量大时
        System.out.println("通过Map.entrySet遍历key和value");
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        System.out.println();
        //第四种
        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
        for(String v:map.values()){
            System.out.println("value= "+v);
        }




    }
}
