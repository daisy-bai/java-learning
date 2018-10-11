package chapter5;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Tester {

    /**
     * lambda 表达式只能引用标记了 final 的外层局部变量
     */
    final static String salutation = "Hello! ";

    interface GreetingService {
        void sayMessage(String message);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Google");
        list.add("Runoob");
        list.add("taobao");
        list.add("baidu");
        list.add("sina");

        List<String> list1 = new ArrayList<String>();
        list1.add("Google");
        list1.add("Runoob");
        list1.add("taobao");
        list1.add("baidu");
        list1.add("sina");

        Java8Tester tester = new Java8Tester();
        System.out.println("使用 Java 7 语法: ");

        tester.sortUsingJava7(list);
        System.out.println(list);
        System.out.println("使用 Java 8 语法: ");

        tester.sortUsingJava8(list1);
        System.out.println(list1);

        MathOperation addition = (int a, int b) -> a + b;
        System.out.println(addition.operation(5, 10));

        GreetingService greetingService = message -> System.out.println(salutation + message);
        greetingService.sayMessage("Daisy.bai");

        final int num = 1;
        Converter<Integer, String> s = (param) -> System.out.println(String.valueOf(param + num));
        s.convert(2);

        String[] players = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka", "David Ferrer",
                "Roger Federer", "Andy Murray",
                "Tomas Berdych", "Juan Martin Del Potro",
                "Richard Gasquet", "John Isner"};

        //使用匿名内部类排序
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        // lambdas,函数式接口
        Comparator<String> sortByName = (String s1, String s2) -> (s1.compareTo(s2));
        Arrays.sort(players, sortByName);

        Arrays.sort(players, (String s1, String s2) -> (s1.compareTo(s2)));

        System.out.println(Arrays.asList(players));

        //方法引用
        List names = new ArrayList();
        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");

        names.forEach(System.out::println);

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("输出所有数据:");
        // 传递参数 n
        eval(list2, n -> true);
        // Predicate<Integer> predicate1 = n -> n%2 == 0
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // 如果 n%2 为 0 test 方法返回 true

        System.out.println("输出所有偶数:");
        eval(list2, n -> n % 2 == 0);

        // Predicate<Integer> predicate2 = n -> n > 3
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // 如果 n 大于 3 test 方法返回 true

        System.out.println("输出大于 3 的所有数字:");
        eval(list2, n -> n > 3);

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered=strings.stream().filter(string->!strings.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);

        Integer value1 = null;
        Integer value2 = new Integer(10);
        // Optional.ofNullable - 允许传递为 null 参数
        Optional<Integer> a = Optional.ofNullable(value1);
        // Optional.of - 如果传递的参数是 null，抛出异常 NullPointerException
        Optional<Integer> b = Optional.of(value2);
        System.out.println(tester.sum(a,b));

    }

    public Integer sum(Optional<Integer> a, Optional<Integer> b){

        // Optional.isPresent - 判断值是否存在

        System.out.println("第一个参数值存在: " + a.isPresent());
        System.out.println("第二个参数值存在: " + b.isPresent());

        // Optional.orElse - 如果值存在，返回它，否则返回默认值
        Integer value1 = a.orElse(new Integer(0));

        //Optional.get - 获取值，值需要存在
        Integer value2 = b.get();
        return value1 + value2;
    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer n : list) {

            if (predicate.test(n)) {
                System.out.println(n + " ");
            }
        }
    }

    //函数式接口
    interface MathOperation {
        int operation(int a, int b);

        //默认方法
        default int addition(int a, int b) {
            return a + b;
        }
    }

    //函数式接口

    /**
     * 函数式接口(Functional Interface)就是一个有且仅有一个抽象方法，但是可以有多个非抽象方法的接口。
     * @param <T1>
     * @param <T2>
     */
    interface Converter<T1, T2> {
        void convert(int i);
    }

    // 使用 java 7 排序
    private void sortUsingJava7(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
    }

    // 使用 java 8 排序
    private void sortUsingJava8(List<String> names) {
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
    }
}
