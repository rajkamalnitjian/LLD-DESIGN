package com.example.LLD.Mutithreading;

import java.util.concurrent.ThreadFactory;

/*
//Process is instance of program.
//At the time of execution jvm start new process.
//Seperate memory and thread provided to each program;

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
