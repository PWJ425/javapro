package com.neued.test;

public class MyTest0213 {
    public static int a=0;
    public static void main(String[] args) {
       /* Thread t=new Thread(()->{
            for (int i=0;i<100;i++){
                System.out.println(Thread.currentThread().getName()+"线程输出---"+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"线程输出---"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
       for (int i=0;i<5000;i++){
           Thread t=new Thread(()->{
               a++;
           });
           t.start();
       }
        System.out.println(a);

    }
}
