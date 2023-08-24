package com.xpel.boss.dcl;

public class HeyMan4 {

    private static HeyMan4 _instance;

    public static HeyMan4 getInstance() {
        if (_instance == null) {
            synchronized (HeyMan4.class) {
                if (_instance == null) {
                    // 1. alloc , 2. init , 3. store
                    // 1, 2, 3
                    // 1, 3, 2
                    _instance = new HeyMan4();
                }
            }
        }
        return _instance;
    }

}
