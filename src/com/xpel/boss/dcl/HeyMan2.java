package com.xpel.boss.dcl;

public class HeyMan2 {

    private static HeyMan2 _instance = new HeyMan2();

    public static HeyMan2 getInstance() {
        return _instance;
    }

    static {
        System.out.println("load");
    }

    public HeyMan2() {
        System.out.println("new");
    }
}
