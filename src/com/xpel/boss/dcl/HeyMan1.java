package com.xpel.boss.dcl;

public class HeyMan1 {

    private static HeyMan1 _instance;

    // https://docs.oracle.com/javase/specs/jls/se7/html/jls-12.html#jls-12.4.2
    static {
        _instance = new HeyMan1();
    }

    public static HeyMan1 getInstance() {
        return _instance;
    }


}
