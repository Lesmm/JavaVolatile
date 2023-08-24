package com.xpel.boss.dcl;

public class HeyMan6 {

    private volatile static HeyMan6 _instance;

    // https://en.wikipedia.org/wiki/Double-checked_locking
    public static HeyMan6 getInstance() {
        HeyMan6 localRef = _instance;
        if (localRef == null) {
            synchronized (HeyMan6.class) {
                localRef = _instance;
                if (localRef == null) {
                    _instance = localRef = new HeyMan6();
                }
            }
        }
        return localRef;
    }

}
