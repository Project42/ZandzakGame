import greenfoot.*;

public class Sandbag extends Actor implements Bag {
    public Sandbag() {
        getImage().scale(30, 30);
    }

    public int getWeight() {
        return 2;
    }
}
