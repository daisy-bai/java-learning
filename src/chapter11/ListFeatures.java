package chapter11;

import java.util.*;

import static chapter6.Print.print;

class Pet{
    int id;
    String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet(int id,String name){
        this.id=id;
        this.name=name;
    }
    public Pet(int id){
        this.id=id;
    }
    public Pet(String name){
        this.name=name;
    }
}


public class ListFeatures {
    public static void display(Iterator<Pet> p){
        while(p.hasNext()){
            print(p.next().getName());
        }
    }
    public static void main(String[] args){
        Random random=new Random(47);

       /* ArrayList<Pet> pets=new ArrayList<Pet>();
        pets.add(new Pet("dave.wu"));
        pets.add(new Pet("daisy.bai"));
        pets.add(new Pet("daisy.wu"));
        pets.add(new Pet("dave.bai"));
        display(pets.iterator());*/

        LinkedList<Pet> petLinkedList=new LinkedList<Pet>();

        petLinkedList.add(new Pet("dfhk"));
        petLinkedList.add(new Pet("dksfh"));
        display(petLinkedList.iterator());

        /*HashSet<Pet> hashSet=new HashSet<Pet>();
        hashSet.add(new Pet("laks"));
        display(hashSet.iterator());

        TreeSet<Pet> treeSet=new TreeSet<Pet>();
        treeSet.add(new Pet("asdf"));
        display(treeSet.iterator());*/
    }
}
