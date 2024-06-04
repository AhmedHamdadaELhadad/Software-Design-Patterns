package oop.abstractionAInterface;

public class Dog implements Runnable,Callable{


    @Override
    public void myMethod() {
        System.out.println("Default implementation");
    }

    public void callInterfaceAMethod() {
        Runnable.super.myMethod();
    }

    public void callInterfaceBMethod() {
        Callable.super.myMethod();
    }





}

