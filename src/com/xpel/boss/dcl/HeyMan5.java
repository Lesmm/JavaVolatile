package com.xpel.boss.dcl;

public class HeyMan5 {

    private volatile static HeyMan5 _instance;

    public static HeyMan5 getInstance() {
        if (_instance == null) {
            synchronized (HeyMan5.class) {
                if (_instance == null) {
                    // 1, 2, 3
                    _instance = new HeyMan5();
                }
            }
        }
        return _instance;
    }

}
