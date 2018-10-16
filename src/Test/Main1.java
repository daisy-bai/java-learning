package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        /*String s=in.nextLine();

        String[] str1 = s.split("+");
        String[] str2 = s.split("-");

        System.out.println(Arrays.toString(str1));
        System.out.println(Arrays.toString(str2));

        ArrayList<String> list=new ArrayList<>();*/


        String str = in.nextLine();
        int[] a = new int[600000+5];
        int num1 = str.charAt(0) - '0';
        int num2=str.charAt(1)-'0';
        int move = 0;

        if(num1==0){
            int i=1;
            while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                num1 = (num1*10 + (str.charAt(i) - '0'))%1000000;
                i++;
            }
            int b=num1%1000000;
            a[move++] = Integer.parseInt(Integer.valueOf(b,8).toString());
            System.out.println(a[0]);

        }

        System.out.println(num1);

        int i = 1;
        //int move = 0;
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            num1 = (num1*10 + (str.charAt(i) - '0'))%1000000;
            System.out.println(num1);
            i++;
        }

        a[move++] = num1%1000000;

        System.out.println(a[0]);

        //然后读取一个字符和一个数字
        while (i < str.length()) {
            if (str.charAt(i) == '+') {
                i++;
                continue;
            } else if (str.charAt(i) == '*') {
                i++;
                //*后面一定是数字
                int num = str.charAt(i) - '0';
                i++;
                while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    num = (num*10 + (str.charAt(i) - '0'))%1000000;
                    i++;
                }
                num = num%1000000*a[move-1]%1000000;
                a[move-1] = num%1000000;
            } else {//如果是数字
                int num = str.charAt(i) - '0';
                i++;
                while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    num = (num*10 + (str.charAt(i) - '0'))%1000000;
                    i++;
                }
                a[move++] = num%1000000;
            }
        }
        int sum = 0;
        for (int j = 0; j < move; j++) {
            sum += a[j];
        }
        System.out.println(sum%1000000);
    }
}



