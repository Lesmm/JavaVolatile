package com.xpel.boss;

import java.util.concurrent.TimeUnit;

public class Test1 {

    static boolean flag = true;

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "\t start!");

                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                flag = false;

                System.out.println(Thread.currentThread().getName() + "\t over!");
            }
        }, "Thread-1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "\t start!");

                while (flag) {

                    try {
                        TimeUnit.MILLISECONDS.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(Thread.currentThread().getName() + "\t over!");
            }
        }, "Thread-2").start();
    }
}
