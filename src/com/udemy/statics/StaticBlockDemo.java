package com.udemy.statics;

public class StaticBlockDemo {
    public static void main(String[] args) {
        System.out.println("main method");

    }
    static {
        System.out.println("static block 1 execution");
    }

    static {
        System.out.println("static block 2 execution");
    }
}