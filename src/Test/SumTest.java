package Test;

import java.util.*;

public class SumTest {
    public static int[] twoSum(int[] nums, int target) {
        /*int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(temp==nums[j]){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;*/

        /*Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {
            int temp = target - nums[j];
            if (map.containsKey(temp) && map.get(temp) != j)
                return new int[]{j, map.get(target - nums[j])};
        }
        throw new IllegalArgumentException("No two sum solution");*/
        List<Integer> arr=new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            arr.add(nums[j]);
        }
        for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if(arr.contains(temp)&&arr.indexOf(temp)!=i)
                return new int[]{i,arr.indexOf(temp)};
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));

    }
}
