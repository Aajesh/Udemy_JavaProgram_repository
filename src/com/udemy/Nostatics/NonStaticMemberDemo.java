package com.udemy.Nostatics;

public class NonStaticMemberDemo {
    int num;

    {
        System.out.println(" Inside Non static block");
    }

  /*  public NonStaticMemberDemo() {
        System.out.println("Inside the constructor");
    }*/

    public static void main(String[] args) {
        System.out.println("Inside the main method");
        new NonStaticMemberDemo();
        new NonStaticMemberDemo();
        new NonStaticMemberDemo();
    }

    static{
        System.out.println("Inside the static block");
    }

}
