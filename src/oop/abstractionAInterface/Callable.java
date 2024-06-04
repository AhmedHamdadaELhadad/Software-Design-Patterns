package oop.abstractionAInterface;

public interface Callable {

     final String name="AA" ;

    default void myMethod(){
        System.out.println("IN Runnable ");
    };

}
