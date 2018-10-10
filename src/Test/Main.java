package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String[] arr = in.nextLine().split(" ");

        ArrayList<Num> list=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            String[] arr1 = in.nextLine().split(" ");
            Num num=new Num();
            num.people=arr1[0].charAt(0);
            num.moeny=Integer.parseInt(arr1[1]);
            list.add(num);
        }
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i).people+" "+list.get(i).moeny);

    }
}

class Num{
    char people;
    int moeny;

    public void setMoeny(int moeny) {
        this.moeny = moeny;
    }

    public int getMoeny() {
        return moeny;
    }

    public char getPeople() {
        return people;
    }

    public void setPeople(char people) {
        this.people = people;
    }
}
