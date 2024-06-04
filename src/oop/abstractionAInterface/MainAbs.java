package oop.abstractionAInterface;

public class MainAbs {
    public static void main(String[] args) {

        Human human=new Lower();
        human.sum();
        human.pepole();

        System.out.println("****************");
        Lower lower=new Lower();
        lower.sum();

        System.out.println("****************");
        pepole pepole=new Lower();

        pepole.sum();



     //   human.printH();
    }
}
