package com.udemy.statics;

public class StaticMethodDemo {
    public static void main(String[] args){
        System.out.println(" main method ");
        StaticMethodDemo.staticMethod1();
    }

    public static void staticMethod1(){
        System.out.println("static method 1");
    }

    static {
        System.out.println("static block1 ");
        StaticMethodDemo.staticMethod1();

    }
}
