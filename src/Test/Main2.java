package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Section{
    int left;
    int right;
    public Section(int left,int right){
        this.left=left;
        this.right=right;
    }
}

public class Main2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        List<Section> sections=new ArrayList<>();
        for(int i=0;i<n;i++){
            int left=in.nextInt();
            int right=in.nextInt();
            Section s=new Section(left,right);
            sections.add(s);
        }
        int Lx,Rx,Ly,Ry;
        int k=0;
        for(int i=0;i<n;i++){
            Lx=sections.get(i).left;
            Rx=sections.get(i).right;
            for(int j=i+1;j<n;j++){
                Ly=sections.get(j).left;
                Ry=sections.get(j).right;
                if(Ly<=Lx&&Rx<=Ry){
                    //sections.remove(i);
                    //k=sections.size()-1;
                    k=k+1;
                    break;
                }
            }
        }
        System.out.println(k);
    }
}
