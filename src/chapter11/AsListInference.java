package chapter11;

import java.util.*;

import static chapter6.Print.print;

class Snow{ }
class Power extends Snow{ }
class Light extends Power{ }
class Heavy extends Power{ }
class Crusty extends Snow{ }
class Slush extends Snow{ }

public class AsListInference {
    public static void main(String[] args){
        List<Snow> list= Arrays.asList(new Crusty(),new Slush(),new Power());

        List<Snow> list1=new ArrayList<Snow>();
        Collections.addAll(list1,new Light(),new Heavy());

        List<Snow> list2=Arrays.<Snow>asList(new Light(),new Heavy());
        print(fill(new ArrayList<String>()));
        print(fill(new LinkedList<String>()));

        print(fill(new HashSet<String>()));
        print(fill(new TreeSet<String>()));
        print(fill(new LinkedHashSet<String>()));

        print(fill(new HashMap<String,String>()));
        print(fill(new TreeMap<String,String>()));
        print(fill(new LinkedHashMap<String,String>()));
    }
    static Collection fill(Collection<String> collection){
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }
    static Map fill(Map<String,String> map){
        map.put("rat","Fuzzy");
        map.put("cat","Rags");
        map.put("dog","Bosco");
        map.put("dog","Spot");
        return map;
    }

}
