package chapter1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class DateDemo {
    public static void main(String[] args){
        Date date=new Date();
        System.out.println(date.toString());

        SimpleDateFormat ft=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        System.out.println("当前时间："+ft.format(date));

     /* try{
          System.out.println(new Date()+"\n");
          Thread.sleep(1000*3);//休眠3秒
          System.out.println(new Date()+"\n");
      }catch (Exception e){
          System.out.println("Got an exception!");
      }

         //测量时间
        try{
            long start=System.currentTimeMillis();
            System.out.println(new Date()+"\n");
            Thread.sleep(5*60*10);//
            System.out.println(new Date()+"\n");

            long end=System.currentTimeMillis();
            long diff=end-start;
            System.out.println("Difference is :"+diff);
        }catch (Exception e){
            System.out.println("Got an exception!");
        }*/

        Calendar c=Calendar.getInstance();
        c.set(2018,10,10);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));





    }
}
