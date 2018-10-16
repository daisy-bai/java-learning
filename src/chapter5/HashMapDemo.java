package chapter5;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;

public class HashMapDemo {
    public static void main(String[] args){
        HashMap<String,String> phonebook=new HashMap<String,String>();
        phonebook=initPhoneBook(phonebook);

        Scanner in=new Scanner(System.in);
        String keyword=in.nextLine();
        while (keyword.isEmpty()){
            phonebook=initPhoneBook(phonebook);
            keyword=in.nextLine();
        }
        System.out.println("The result is :");
        System.out.println(querySearch(phonebook,keyword));
        in.close();
    }
    public static HashMap<String,String> initPhoneBook(HashMap<String,String> phonebook){
        phonebook.put("daisy.bai","123456");
        phonebook.put("daisy.ju","345678");
        phonebook.put("daisy.juju","567891");
        phonebook.put("dave.wu","125678");
        return phonebook;
    }
    public static String querySearch(HashMap<String,String> phonebook,String key){
        String result=new String();
        result=phonebook.get(key);
        if(result==null)
            return "Can not find this user.";
        return phonebook.get(key);
    }
}
