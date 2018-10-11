package chapter3;


/**
 * Java 提供了三种创建线程的方法：
 通过实现 Runnable 接口；
 通过继承 Thread 类本身；
 通过 Callable 和 Future 创建线程。
 */

public class TestThread {

    public static void main(String[] args){

        /*RunnableDemo r1=new RunnableDemo("Thread-1");
        r1.start();

        RunnableDemo r2=new RunnableDemo("Thread-2");
        r2.start();*/

        ThreadDemo T1 = new ThreadDemo( "Thread-3");
        T1.start();

        ThreadDemo T2 = new ThreadDemo( "Thread-4");
        T2.start();
    }

}

/**
 * 通过实现 Runnable 接口；
 */
class RunnableDemo implements Runnable{
    private Thread t;
    private String threadName;

    RunnableDemo(String name){
        threadName=name;
        System.out.println("Creating " +  threadName );
    }

    public void run(){
        System.out.println("Running " +  threadName );
        try{
            for(int i=4;i>0;i--){

                System.out.println("Thread: " + threadName + ", " + i);

                Thread.sleep(50);
            }
        }catch (InterruptedException e){
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");

    }

    public void start(){
        System.out.println("Starting " +  threadName );
        if(t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }

}

/**
 * 通过继承 Thread 类本身；
 */
class ThreadDemo extends Thread{
    private Thread t;
    private String threadName;

    ThreadDemo( String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }

    public void run() {
        System.out.println("Running " +  threadName );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(50);
            }
        }catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }



}