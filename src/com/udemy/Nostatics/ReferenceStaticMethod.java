package com.udemy.Nostatics;

public class ReferenceStaticMethod {

    static  ReferenceStaticMethod referenceStaticMethod=new ReferenceStaticMethod();

    static {
        System.out.println(ReferenceStaticMethod.referenceStaticMethod);
        //ReferenceStaticMethod.init()
        ReferenceStaticMethod.referenceStaticMethod =ReferenceStaticMethod.init();



    }

    private static ReferenceStaticMethod init() {
        return new ReferenceStaticMethod();
    }

    public static void main(String[] args) {
        System.out.println(ReferenceStaticMethod.referenceStaticMethod);
    }
//    private static void init() {
//        ReferenceStaticMethod.referenceStaticMethod =new ReferenceStaticMethod();
//    }



}
