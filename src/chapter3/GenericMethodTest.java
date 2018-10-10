package chapter3;

public class GenericMethodTest {


    public static <E> void printArray(E[] inputArray){
        for(E element:inputArray){
            System.out.printf("%s ",element);
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Integer[] intArray={1,2,3,4,5};
        Double[] doubleArray={1.1,1.2,1.3,1.4,1.5};
        Character[] charArray={'H','E','L','P'};

        System.out.println( "整型数组元素为:" );
        printArray( intArray  ); // 传递一个整型数组

        System.out.println( "\n双精度型数组元素为:" );
        printArray( doubleArray ); // 传递一个双精度型数组

        System.out.println( "\n字符型数组元素为:" );
        printArray( charArray ); // 传递一个字符型数组
    }
}
