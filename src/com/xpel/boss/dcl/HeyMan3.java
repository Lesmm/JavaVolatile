package com.xpel.boss.dcl;

public class HeyMan3 {

    private static HeyMan3 _instance;

    public static synchronized HeyMan3 getInstance() {
        if (_instance == null) {
            _instance = new HeyMan3();
        }
        return _instance;
    }


}
