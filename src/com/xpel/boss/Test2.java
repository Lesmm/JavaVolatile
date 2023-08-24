package com.xpel.boss;


public class Test2 {

    static {
        System.out.println("========= static bloc thread: " + Thread.currentThread().getName() + ", " + Thread.currentThread().getId());
    }

    int value = 0;

    boolean flag = false;

    public void changeFlag() {
        int a = 5;
        boolean b = false;
        value = a;
        flag = true;
    }

    public void changeValue() {
        if (flag) {
            int newValue = value + 1;
            System.out.println(">>>" + newValue);
        }
    }

    public void start() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        changeFlag();
                    }
                }, "AThread-" + i).start();
            } else {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        changeValue();
                    }
                }, "AThread-" + i).start();
            }

        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Test2().start();
        }
    }
}
