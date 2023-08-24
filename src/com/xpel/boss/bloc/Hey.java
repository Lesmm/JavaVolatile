package com.xpel.boss.bloc;

import com.xpel.boss.util.ThreadUtil;

public class Hey {

    private static Hey _justOne; // = new Hey();

    static {
        _justOne = new Hey();
        // https://docs.oracle.com/javase/specs/jls/se7/html/jls-12.html#jls-12.4.2
        ThreadUtil.sleep(1000);
        System.out.println("Initialize done: " + _justOne + ". Current thread: " + Thread.currentThread());
    }

    public static Hey get() {
        return _justOne;
    }

    public Hey() {
        System.out.println("Hey " + hashCode());
    }
}
