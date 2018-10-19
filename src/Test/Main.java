package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       /* Scanner in=new Scanner(System.in);
        String[] arr = in.nextLine().split(" ");

        ArrayList<Num> list=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            String[] arr1 = in.nextLine().split(" ");
            Num num=new Num();
            num.people=arr1[0].charAt(0);
            num.moeny=Integer.parseInt(arr1[1]);
            list.add(num);
        }
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i).people+" "+list.get(i).moeny);*/

        String st1="hello";
        String st11=new String("hello");

        //1、用操作符连接起来的，编译的时候会执行这个"+"操作，将"he"+"llo"连接成"hello";
        String st2="he"+"llo";

        //3、st3是用一个引用来拼接成的，编译的时候会先找st1指向的字符串，取得字符串值来跟"_world"进行连接，生成了一个新的字符，因此存的是一个新的地址；
        String st3=st1+"_world";

        String st4="hello_world";

        System.out.println(st1==st2);//2、因此在用"=="比较的是这个两个引用指向的对象的的地址，st1与st2指向的都是"hello"的地址，所以是true；
        System.out.println(st3==st4);//4、st4是"hello_world"的引用，st3是st1+"_world"生成的字符串的引用，两个地址是不一样的,
        System.out.println(st3.equals(st4));//5、equals比较的是两个引用指向的对象的内容，都是"hello_world"。

        System.out.println(st1==st11);
    }
}

class Num{
    char people;
    int moeny;

    public void setMoeny(int moeny) {
        this.moeny = moeny;
    }

    public int getMoeny() {
        return moeny;
    }

    public char getPeople() {
        return people;
    }

    public void setPeople(char people) {
        this.people = people;
    }
}
