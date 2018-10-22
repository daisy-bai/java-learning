package Test;

import java.util.*;

public class sunStringTest {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        //System.out.println(lengthOfLongestSubstring2(in.nextLine()));
        System.out.println(findMedianSortedArrays(new int[]{1,3},new int[]{2}));
    }

    public static int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int leg=0;
        //暴力法
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                if(allUnique(s,i,j)){
                    leg=Math.max(leg,j-i);
                }
            }
        }
        return leg;
    }
    public static boolean allUnique(String s,int start,int end) {
        Set<Character> set=new HashSet<>();
        for(int i=start;i<end;i++){
            Character ch=s.charAt(i);
            if(set.contains(ch))
                return false;
            set.add(ch);
        }
        return true;
    }

    public static int lengthOfLongestSubstring1(String s) {
        int n=s.length();
        int leg=0,i=0,j=0;
        Set<Character> set=new HashSet<>();
        //滑动窗口
        while(i<n&&j<n){
           if(!set.contains(s.charAt(j))){
               set.add(s.charAt(j++));
               leg=Math.max(leg,j-i);
           }
           else{
               set.remove(s.charAt(i++));
           }
        }
        return leg;
    }

    public static int lengthOfLongestSubstring2(String s) {
        int n=s.length();
        int leg=0;
        Map<Character,Integer> map=new HashMap<>();
        //优化的滑动窗口
        for(int j=0,i=0;j<n;j++){
            if(map.containsKey(s.charAt(j))){
                i=Math.max(map.get(s.charAt(j)),i);
            }
            leg=Math.max(leg,j-i+1);
            map.put(s.charAt(j),j+1);
        }
        return leg;
    }

    public static int lengthOfLongestSubstring3(String s) {
        int n=s.length();
        int leg=0;
        //假设字符集为 ASCII 128
        int[] index=new int[128];
        for(int j=0,i=0;j<n;j++){

                i=Math.max(index[s.charAt(j)],i);
            leg=Math.max(leg,j-i+1);
            index[s.charAt(j)]=j+1;
        }
        return leg;
    }

    //计算中位数
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        if(m>n){
            int[] temp=nums1;nums1=nums2;nums2=temp;
            int tmp=m;m=n;n=tmp;
        }
        int iMin=0,iMax=m,halfLen=(m+n+1)/2;
        while(iMin<iMax){
            int i=(iMin+iMax)/2;
            int j=halfLen-i;
            if(i<iMax&&nums2[j-1]>nums1[i]){
                iMin=i+1;
            }
            else if(i>iMin&&nums1[i-1]>nums2[j]){
                iMax=i-1;
            }
            else{
                int maxLeft=0;
                if(i==0) {maxLeft=nums2[j-1];}
                else if(j==0) {maxLeft=nums1[i-1];}
                else {maxLeft=Math.max(nums1[i-1],nums2[j-1]);}
                if((m+n)%2==1){return maxLeft;}
                int minRight=0;
                if (i == m) { minRight = nums2[j]; }
                else if (j == n) { minRight = nums1[i]; }
                else { minRight = Math.min(nums2[j], nums1[i]); }
                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }
}
