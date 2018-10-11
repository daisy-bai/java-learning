package chapter4;

public class StringReplaceDemo {
    public static void main(String[] args){
        String str="my name is daisy bai 123";
        System.out.println(str.replace("m","M"));
        System.out.println(str.replaceFirst("my","your"));
        System.out.println(str.replaceAll("my","wa"));
    }
}
