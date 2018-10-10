package chapter1;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

    public static void main(String[] args){
        //多维数组
        String str[][]=new String[2][];
        str[0]=new String[2];
        str[1]=new String[3];

        str[0][0]=new String("Good");
        str[0][1]=new String("luck");

        str[1][0]=new String("to");
        str[1][1]=new String("you");
        str[1][2]=new String("!");

        System.out.println(Arrays.toString(str[0]));

        int ar[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};

        //Arrays类型
        System.out.println(Arrays.toString(ar));
        Arrays.sort(ar,0,4);
        System.out.println(Arrays.toString(ar));

        //升序排序
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));

        //Arrays的二分查找算法,必须先排序好
        int index = Arrays.binarySearch(ar,9);
        System.out.println(index);

        Arrays.fill(ar, 0, 3, 0);
        System.out.println(Arrays.toString(ar));

        Arrays.fill(ar, 10);
        System.out.println(Arrays.toString(ar));

        Integer at[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};
        List<Integer> l1 = Arrays.asList(at);
        System.out.println(l1);
    }
}
