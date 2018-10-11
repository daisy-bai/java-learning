package chapter4;

/**
 * 删除字符串中的一个字符,使用子串拼接的方式
 */
public class DeleteChar {
    public static void main(String[] args){
        String str="my name is daisy bai";
        System.out.println(removeCharAt(str,2));
    }
    public static String removeCharAt(String s,int pos){
        return s.substring(0,pos)+s.substring(pos+1);
    }
}
