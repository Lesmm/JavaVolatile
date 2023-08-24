package com.xpel.boss.sync;

import com.xpel.boss.util.ThreadUtil;

import java.util.ArrayList;
import java.util.List;

public class HeyBoyTest {

    public static void main(String[] args) {
        List<HeyBoy> list = new ArrayList<>();
        List<Thread> allThreads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            HeyBoy boy = new HeyBoy("GeGe");
            list.add(boy);
            for (int j = 0; j < 1000; j++) {
                Thread t1 = new Thread(boy::changeAll);
                Thread t2 = new Thread(boy::changeAll);
                Thread t3 = new Thread(boy::changeAll);
                Thread t4 = new Thread(boy::changeAll);
                Thread t5 = new Thread(boy::changeAll);

                Thread t6 = new Thread(boy::changeAll);
                Thread t7 = new Thread(boy::changeAll);
                Thread t8 = new Thread(boy::changeAll);
                Thread t9 = new Thread(boy::changeAll);
                Thread t10 = new Thread(boy::changeAll);

                t1.start();
                t2.start();
                t3.start();
                t4.start();
                t5.start();

                t6.start();
                t7.start();
                t8.start();
                t9.start();
                t10.start();

                allThreads.add(t1);
                allThreads.add(t2);
                allThreads.add(t3);
                allThreads.add(t4);
                allThreads.add(t5);
                allThreads.add(t6);
                allThreads.add(t7);
                allThreads.add(t8);
                allThreads.add(t9);
                allThreads.add(t10);
            }
        }

        allThreads.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("--------- wait -----------");
        ThreadUtil.sleep(1 * 1000);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ":" + list.get(i));
        }
        System.out.println("--------- process done -----------");
    }
}
