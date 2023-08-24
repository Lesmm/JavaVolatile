package com.xpel.boss;

import com.xpel.boss.bloc.Hey;

public class Main {

    public static Hey get() {
        System.out.println("Start ");
        Hey hey = Hey.get();
        System.out.println("Done ");
        return hey;
    }


    public static void main(String[] args) {
        new Thread(Main::get).start();
        new Thread(Main::get).start();
        new Thread(Main::get).start();
        new Thread(Main::get).start();
        new Thread(Main::get).start();
        new Thread(Main::get).start();
        new Thread(Main::get).start();
        new Thread(Main::get).start();
        new Thread(Main::get).start();
        new Thread(Main::get).start();
        new Thread(Main::get).start();
        new Thread(Main::get).start();
        new Thread(Main::get).start();
        new Thread(Main::get).start();
        new Thread(Main::get).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("DONE");
    }

}
