package chapter4;

/**
 * 字符串反转
 */
public class StringReverseDemo {
    public static void main(String[] args){
        String str="my name is daisy bai";
        String reverse=new StringBuffer(str).reverse().toString();
        System.out.println("字符串反转前:"+str);
        System.out.println("字符串反转后:"+reverse);

        int intIndex=str.indexOf("daisy");
        if(intIndex == - 1){
            System.out.println("没有找到字符串 daisy");
        }else{
            System.out.println("daisy 字符串位置 " + intIndex);
        }
    }

}
