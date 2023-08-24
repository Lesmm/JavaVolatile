package com.xpel.boss.sync;

public class HeyBoy {

    private int age;

    private int weight;

    private int height;

    private String name;

    HeyBoy(String name) {
        this.name = name;
    }

    public void changeAge() {
        age = age + 1;
    }

    public void changeWeight() {
        weight = weight + 1;
    }

    public void changeHeight() {
        height = height + 1;
    }

    public void changeAll() {
        changeAge();
        changeWeight();
        changeHeight();
    }

    @Override
    public String toString() {
        return "HeyBoy" + "[" + name + "]" +
                "{" +
                "age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

}
