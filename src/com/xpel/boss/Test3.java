package com.xpel.boss;


import com.xpel.boss.util.ThreadUtil;

public class Test3 {

    static int finishCount = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("start ~~~");
                    ThreadUtil.sleep(500);
                    finishCount++;
                    System.out.println("start end ~~~");
                }
            });
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Finish count: " + finishCount);
        System.out.println("Process done~");
    }
}
