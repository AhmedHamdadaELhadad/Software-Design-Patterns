package solid.LSP.after;

public class Swan extends FlyingBird {
    @Override
    public void eat() {
        System.out.println("OMG! I can eat pizza!");
    }
    @Override
    public void fly() {
        System.out.println("I believe I can fly!");
    }
}