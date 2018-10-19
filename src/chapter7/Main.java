package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] str=in.nextLine().split(" ");
        int[] num =new int[str.length];
        for(int i=0;i<str.length-1;i++){
            num[i]=Integer.parseInt(str[i]);
        }
        String[] split = str[str.length - 1].split(",");
        num[str.length-1]=Integer.parseInt(split[0]);
        int n=Integer.parseInt(split[1]);
        int count=0;
        int sum=0;
        boolean b=false;
        for(int j=0;j<num.length;j++){
            sum+=num[j];
            count++;
            if(sum==n&&count==3)
                b=true;
        }
        System.out.println(b);
    }
}
