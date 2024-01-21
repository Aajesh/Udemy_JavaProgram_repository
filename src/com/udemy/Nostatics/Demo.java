package com.udemy.Nostatics;

public class Demo {
    static Demo demo;

    static {
        System.out.println(demo);
        demo = new Demo();

    }
    public static void main(String[] args) {
        System.out.println(Demo.demo);
    }
}
