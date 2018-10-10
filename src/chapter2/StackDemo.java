package chapter2;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * 栈是Vector的一个子类，它实现了一个标准的后进先出的栈。
 */
public class StackDemo {

    static void showpush(Stack<Integer> st, int a){
        st.push(new Integer(a));
        System.out.println("push("+a+")");
        System.out.println("stack:"+st);
    }

    static void showpop(Stack<Integer> st){
        System.out.println("pop-> ");
        Integer a=(Integer) st.pop();
        System.out.println(a);
        System.out.println("Stack: "+st );
    }

    public static void main(String[] args){

        Stack<Integer> st=new Stack<Integer>();
        System.out.println("stack: "+st);
        showpush(st,42);
        showpush(st,66);
        showpush(st,99);
        showpop(st);
        showpop(st);
        showpop(st);

        try{
            showpop(st);
        }catch (EmptyStackException e){
            System.out.println("empty stack");
        }

    }
}
