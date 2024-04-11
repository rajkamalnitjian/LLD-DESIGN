package com.example.LLD.Mutithreading;

import java.util.concurrent.ThreadFactory;

/*
//Process is instance of program.
//At the time of execution jvm start new process.
//Seperate memory and thread provided to each program;


Key 1:-


Note:-
In Java, the suspend(), resume(), and stop() methods are used to control the execution of threads.

Suspend: temporarily stops the execution of a thread. The thread can be resumed using the resume() method.
Resume: resumes the execution of a suspended thread.
Stop: permanently stops the execution of a thread.


*  these above three methods doesn't release Monitor lock on shared resource.

The suspend() and resume() methods are deprecated in Java 1.1 and should not be used. The stop() method is also deprecated in Java 1.5 and should not be used.
There are several reasons why these methods are deprecated. One reason is that they can cause problems with other threads and with the overall stability of the program. Another reason is that they are not necessary. There are other ways to control the execution of threads that are more reliable and efficient.
Here are some alternatives to using the suspend(), resume(), and stop() methods


Key 2:--

Join() method keep current thread to wait until it finishes their work.

Key 3:
Demon Thread:-A daemon thread is a thread that runs in the background and does not prevent the Java Virtual Machine (JVM) from exiting when all non-daemon threads in Java have been completed.

        th1.setDaemon(true);

 */
class MultiThreading0 implements  Runnable {
    @Override
    public  synchronized  void run() {

        System.out.println("Entered into MultiThreading0");
        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("MultiThreading0 running "+Thread.currentThread().getName());
    }
    public synchronized void task1 (){
        System.out.println(" Entered into task1 ");
    }
    public void task2 (){
        System.out.println(" Entered into task2 ");

        synchronized (this){
            System.out.println("Entered into task2 inside synchronize block ");
        }

    }
}
class MultiThreading1 extends  Thread {
    @Override
    public synchronized void run() {
        System.out.println("MultiThreading1 running "+Thread.currentThread().getName());
    }
}
public class ThreadLifeCycle {
    public static  void main(String args[] ){
//        System.out.println(Thread.currentThread().getName());
      MultiThreading0 multiThreading=new MultiThreading0();
//        Thread th1=new Thread(multiThreading);
//        th1.start();
//        MultiThreading1 multiThreading1=new MultiThreading1();
//        multiThreading1.start();

        Thread th1=new Thread(()->{
            multiThreading.task1();
        }) ;
        Thread th2=new Thread(()->{
            multiThreading.task2();
        }) ;
        Thread th3=new Thread(()->{
            multiThreading.run();
        }) ;
        th1.start();
        th2.start();
        th3.start();
    }
}
