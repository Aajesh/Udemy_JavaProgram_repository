package com.udemy.Nostatics;

public class NonStaticMemberDemo1 {
    int num;

    public NonStaticMemberDemo1() {
        System.out.println("Inside the constructor");
    }

    {
        System.out.println(" Inside the  Non static block");
    }

    public static void main(String[] args) {
        System.out.println("Inside the main method");
        new NonStaticMemberDemo1().doSomthing();

    }
    static{
        System.out.println("Inside the static block");
    }
    void doSomthing(){
        System.out.println("inside non static method");
    }
}
