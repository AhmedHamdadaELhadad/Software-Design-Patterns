package solid.LSP.before;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<Bird>();
        birds.add(new Swan());
        birds.add(new Penguin());
        letBirdsFly(birds);
    }




    public static void letBirdsFly(List<Bird> birds) {
        for(Bird bird: birds) {
            bird.fly();
        }
    }
}
