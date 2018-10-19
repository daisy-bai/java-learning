package chapter11;

import java.util.*;

import static chapter6.Print.print;
import static chapter6.Print.printnb;

class Apple{
    private static long counter;
    private final long id=counter++;
    public long id(){
        return id;
    }
}

class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class Braeburn extends Apple{}

class Orange{ }

public class ApplesAndOrangesWithoutGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new Apple());
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        for(Apple c:apples)
            print(c.id());

        Collection<Integer> c=new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            c.add(i);
        }
        for(Integer i:c)
            printnb(i+" ");

        print();

        Collection<Integer> collection=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        Integer[] moreInt={6,7,8,9,10};
        collection.addAll(Arrays.asList(moreInt));


        Collections.addAll(collection,11,12,13,14,15);
        Collections.addAll(collection,moreInt);

        List<Integer> list=Arrays.asList(16,17,18,19,20);
        list.set(1,99);

        for(Integer i:collection)
            printnb(i+" ");

        print();
        for(Integer i:list)
            printnb(i+" ");
    }
}
