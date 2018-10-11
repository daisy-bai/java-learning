package chapter4;

import java.util.Locale;
import java.util.*;

public class StringOptimization {
    public static void main(String[] args){

        String variables[] = new String[50000];
        for( int i=0;i <50000;i++){
            variables[i] = "s"+i;
        }

        long startTime0 = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            variables[i] = "hello";
        }
        long endTime0 = System.currentTimeMillis();
        System.out.println("直接使用字符串： "+ (endTime0 - startTime0)  + " ms" );
        System.out.println();

        long startTime1 = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            variables[i] = new String("hello");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("使用 new 关键字：" + (endTime1 - startTime1) + " ms");
        System.out.println();

        long startTime2 = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            variables[i] = new String("hello");
            variables[i] = variables[i].intern();
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("使用字符串对象的 intern() 方法: " + (endTime2 - startTime2) + " ms");
        System.out.println();

        //字符串格式化
        double e = Math.E;
        System.out.format("%f%n", e);
        System.out.format(Locale.CHINA  , "%-10.4f%n%n", e);  //指定本地为中国（CHINA）

        //连接字符串
        long startTime = System.currentTimeMillis();
        for(int i=0;i<5000;i++){
            String result = "This is" + "testing the" + "difference"+ "between" + "String"+ "and"+ "StringBuffer";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("字符串连接" + " - 使用 + 操作符 : " + (endTime - startTime)+ " ms");
        System.out.println();

        long startTime11 = System.currentTimeMillis();
        for(int i=0;i<5000;i++){
            StringBuffer result = new StringBuffer();
            result.append("This is");
            result.append("testing the");
            result.append("difference");
            result.append("between");
            result.append("String");
            result.append("and");
            result.append("StringBuffer");
        }
        long endTime11 = System.currentTimeMillis();
        System.out.println("字符串连接" + " - 使用 StringBuffer : " + (endTime11 - startTime11)+ " ms");
    }
}
