package com.xpel.boss.bloc;

import java.util.ArrayList;
import java.util.List;

public class HeyTest {

    public static Hey get() {
        System.out.println("Start");
        Hey hey = Hey.get();
        System.out.println("Done");
        return hey;
    }

    private static List<Thread> startedThreads = new ArrayList<>();

    public static void start(Thread t) {
        t.start();
        startedThreads.add(t);
    }

    public static void join() {
        startedThreads.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    public static void main(String[] args) {
        Thread t;
        t = new Thread(HeyTest::get);
        start(t);
        System.out.println("initialize thread is: " + t);
        t = new Thread(HeyTest::get);
        start(t);
        t = new Thread(HeyTest::get);
        start(t);
        t = new Thread(HeyTest::get);
        start(t);
        t = new Thread(HeyTest::get);
        start(t);
        t = new Thread(HeyTest::get);
        start(t);
        t = new Thread(HeyTest::get);
        start(t);
        t = new Thread(HeyTest::get);
        start(t);
        t = new Thread(HeyTest::get);
        start(t);
        t = new Thread(HeyTest::get);
        start(t);
        t = new Thread(HeyTest::get);
        start(t);
        t = new Thread(HeyTest::get);
        start(t);
        t = new Thread(HeyTest::get);
        start(t);
        t = new Thread(HeyTest::get);
        start(t);
        t = new Thread(HeyTest::get);
        start(t);

        join();

        System.out.println("PROCESS DONE");
    }

}
