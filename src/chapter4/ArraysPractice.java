package chapter4;

import java.util.*;

/**
 * 数组练习
 */
public class ArraysPractice {
    public static void main(String[] args) throws Exception{

        int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        Arrays.sort(array);

        printArray("数组排序结果为", array);
        int index=Arrays.binarySearch(array,2);
        System.out.println("元素 2  在第 " + index + " 个位置");

        int index1 = Arrays.binarySearch(array, 1);
        System.out.println("元素 1 所在位置（负数为不存在）：" + index1);
        int newIndex = -index1 - 1;
        array = insertElement(array, 1, newIndex);
        printArray("数组添加元素 1", array);


        String[][] data = new String[2][5];
        System.out.println("第一维数组长度: " + data.length);
        System.out.println("第二维数组长度: " + data[0].length);

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        System.out.println("反转前排序: " + arrayList);
        Collections.reverse(arrayList);
        System.out.println("反转后排序: " + arrayList);

        Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5};
        int min = (int) Collections.min(Arrays.asList(numbers));
        System.out.println(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));
        System.out.println("最小值: " + min);
        System.out.println("最大值: " + max);

        //数组合并
        String a[] = { "A", "E", "I" };
        String b[] = { "O", "U" };
        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));

        //数组填充
        int array1[] = new int[6];
        Arrays.fill(array1, 100);
        for (int i=0, n=array1.length; i < n; i++) {
            System.out.println(array1[i]);
        }
        System.out.println();
        Arrays.fill(array1, 3, 6, 50);
        for (int i=0, n=array1.length; i< n; i++) {
            System.out.println(array1[i]);
        }

        //数组扩容
        String[] names = new String[] { "A", "B", "C" };
        String[] extended = new String[5];
        extended[3] = "D";
        extended[4] = "E";
        System.arraycopy(names, 0, extended, 0, names.length);
        for (String str : extended){
            System.out.println(str);
        }

        //查找数组中的重复元素
        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};

        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if ((my_array[i] == my_array[j]) && (i != j))
                {
                    System.out.println("重复元素 : "+my_array[j]);
                }
            }
        }

        //删除数组元素
        ArrayList<String> objArray = new ArrayList<String>();
        objArray.clear();
        objArray.add(0,"第 0 个元素");
        objArray.add(1,"第 1 个元素");
        objArray.add(2,"第 2 个元素");
        System.out.println("数组删除元素前："+objArray);
        objArray.remove(1);
        objArray.remove("第 0 个元素");
        System.out.println("数组删除元素后："+objArray);

        //数组差集
        ArrayList objArray1 = new ArrayList();
        ArrayList objArray2 = new ArrayList();
        objArray2.add(0,"common1");
        objArray2.add(1,"common2");
        objArray2.add(2,"notcommon");
        objArray2.add(3,"notcommon1");

        objArray1.add(0,"common1");
        objArray1.add(1,"common2");
        objArray1.add(2,"notcommon2");
        System.out.println("array1 的元素" +objArray1);
        System.out.println("array2 的元素" +objArray2);

        System.out.println("objArray 是否包含字符串common2? ： " +objArray1.contains("common2"));
        System.out.println("objArray2 是否包含数组 objArray1? ：" +objArray2.contains(objArray1) );

        objArray1.retainAll(objArray2);
        System.out.println("array2 & array1 数组交集为："+objArray1);

        objArray1.removeAll(objArray2);
        System.out.println("array1 与 array2 数组差集为："+objArray1);

        int[] ary = {1,2,3,4,5,6};
        int[] ary1 = {1,2,3,4,5,6};
        int[] ary2 = {1,2,3,4};
        System.out.println("数组 ary 是否与数组 ary1相等? ：" +Arrays.equals(ary, ary1));
        System.out.println("数组 ary 是否与数组 ary2相等? ：" +Arrays.equals(ary, ary2));

        String[] arr1 = { "1", "2", "3","4" };
        String[] arr2 = { "4", "5", "6" };
        String[] result_union = union(arr1, arr2);
        System.out.println("并集的结果如下：");

        for (String str : result_union) {
            System.out.println(str);
        }

    }

    // 求两个字符串数组的并集，利用set的元素唯一性
    public static String[] union(String[] arr1, String[] arr2) {

        Set<String> set = new HashSet<String>();
        for (String str : arr1) {
            set.add(str);
        }
        for (String str : arr2) {
            set.add(str);
        }
        String[] result = {  };

        return set.toArray(result);
    }

    private static void printArray(String message, int array[]) {
        System.out.println(message + ": [length: " + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            if(i != 0){
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();

    }

    private static int[] insertElement(int original[], int element, int index) {

        int length = original.length;

        int destination[] = new int[length + 1];

        System.arraycopy(original, 0, destination, 0, index);

        destination[index] = element;

        System.arraycopy(original, index, destination, index + 1, length - index);

        return destination;
    }
}
