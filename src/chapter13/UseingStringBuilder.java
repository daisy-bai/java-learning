package chapter13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UseingStringBuilder {
    public static Random random=new Random(47);
    /*public String toString(){
        StringBuilder sb=new StringBuilder("[");
        for(int i=0;i<25;i++){
            sb.append(random.nextInt(100));
            sb.append(",");
        }
        sb.delete(sb.length()-1,sb.length());
        sb.append("]");
        return sb.toString();
    }*/
    public String toString(){
        //return "InfiniteRecursion"+this+"\n";
        return "InfiniteRecursion"+super.toString()+"\n";
    }
    public static void main(String[] args){
        /*UseingStringBuilder usb=new UseingStringBuilder();
        System.out.println(usb);

        ArrayList<Integer> list=new ArrayList<>();
        int[] a=new int[]{1,2,3,4,5,6,7,8,9,10};
        for(int i:a){
            list.add(i);
        }
        System.out.println(list);*/

        List<UseingStringBuilder> l=new ArrayList<UseingStringBuilder>();
        for(int i=0;i<10;i++){
            l.add(new UseingStringBuilder());
        }
        System.out.println(l);
    }
}
