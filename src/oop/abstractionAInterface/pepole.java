package oop.abstractionAInterface;

public abstract class pepole implements Runnable {
 void pepole(){
     System.out.println("not Constrouctor ");
}
pepole(){
        System.out.println("Pepole Constrouctor ");
    }

public  abstract void sum();

    public  void call(){

        System.out.println("Call in Pepole  ");
    }


    public void call(pepole p){

    }

}
