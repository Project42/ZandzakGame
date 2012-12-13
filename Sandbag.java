import greenfoot.*;

public class Sandbag extends Bag {
    public Sandbag() {
        super(1, 50);
        getImage().scale(30, 30);
    }
    
    @Override
    protected int getCost() {
        return 10;
    }
}
