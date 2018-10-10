package chapter1;

public class StringDemo {
    public static void main(String[] args){
        char[] helloArray={'r','u','n','n','b'};
        String helloString=new String(helloArray);
        System.out.println(helloArray);

        String site="www.runoob.com";
        int len=site.length();
        System.out.println("网址长度为："+len);
    }
}
