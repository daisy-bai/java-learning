package chapter1;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        /*if (scan.hasNext()){
            String str=scan.next();
            System.out.println(str);
        }*/

       /* if(scan.hasNextLine()){
            String str=scan.nextLine();
            System.out.println(str);
        }*/

        double sum = 0;
        int m = 0;

        //输入非数字才能结束
        while (scan.hasNextDouble()) {
            double x = scan.nextDouble();
            m = m + 1;
            sum = sum + x;
        }

        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均值是" + (sum / m));
        scan.close();
    }

}

