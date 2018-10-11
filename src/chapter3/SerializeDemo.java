package chapter3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * ObjectOutputStream 类用来序列化一个对象，
 * 如下的 SerializeDemo 例子实例化了一个 Employee 对象，
 * 并将该对象序列化到一个文件中。
 */

public class SerializeDemo {

    public static void main(String[] args){
        Employee e=new Employee();
        e.name="Daisy bai";
        e.address="beijing";
        e.number=1223445;
        e.SSN=111222333;

        try{
            FileOutputStream fileOut=new FileOutputStream("out.txt");

            ObjectOutputStream out=new ObjectOutputStream(fileOut);

            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in out.txt");

        }catch (IOException i){
            i.printStackTrace();
        }

    }
}
