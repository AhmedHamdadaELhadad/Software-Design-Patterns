package oop.abstractionAInterface;

import java.util.ArrayList;
import java.util.Random;

public class MainInterface {
    public static void main(String[] args) {
        Random r = new Random(); // DOES NOT COMPILE
        System.out.println(r.nextFloat(1));

/*Runnable runnable=new Dog();

runnable.myMethod();

Callable callable=new Dog();

callable.myMethod();

        Dog dog=new Dog();
    dog.callInterfaceBMethod();
    dog.callInterfaceAMethod();

        System.out.println("***********");


        ArrayList<Runnable>  arrayList=new ArrayList<Runnable>();
        arrayList.add(runnable);
        arrayList.add(dog);
        printAll((Runnable) arrayList);*/

    }



    static void printAll(Runnable ... runnables){


    }
}
