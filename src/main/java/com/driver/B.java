package com.driver;

public class B extends A {

    public  String meth(){
        return "Method is overridden in Extendend class B";
    }
    public String parentMethod(){
        return super.meth();
    }
}
