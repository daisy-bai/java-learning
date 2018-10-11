package chapter4;

/**
 * 查找字符串最后一次出现的位置
 */
public class SearchlastString {
    public static void main(String[] args){
        String strOrig="Hello world,Hello daisy.bai";
        int lastIndex=strOrig.lastIndexOf("daisy.bai");
        if(lastIndex==-1)
            System.out.println("没有找到字符串 daisy.bai");
        else
            System.out.println("daisy.bai 字符串最后出现的位置： "+ lastIndex);

    }
}
