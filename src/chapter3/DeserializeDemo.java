package chapter3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 对于 JVM 可以反序列化对象，它必须是能够找到字节码的类。
 * 如果JVM在反序列化对象的过程中找不到该类，则抛出一个 ClassNotFoundException 异常。
 */
public class DeserializeDemo {
    public static void main(String[] args){
        Employee e=null;
        try{
            FileInputStream fileIn=new FileInputStream("out.txt");

            ObjectInputStream in=new ObjectInputStream(fileIn);

            e=(Employee)in.readObject();
            in.close();
            fileIn.close();

        }catch(IOException i){
            i.printStackTrace();
            return;
        }catch (ClassNotFoundException c){
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + e.name);
        System.out.println("Address: " + e.address);
        /**
         * 当对象被序列化时，属性 SSN 的值为 111222333，
         * 但是因为该属性是短暂的，该值没有被发送到输出流。
         * 所以反序列化后 Employee 对象的 SSN 属性为 0。
         */
        System.out.println("SSN: " + e.SSN);
        System.out.println("Number: " + e.number);
    }
}
