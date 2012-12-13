import greenfoot.*;

public class GravelBag extends Bag {
    public GravelBag() {
        super(2, 100);
    }
    
    @Override
    public int getCost() {
        return 20;
    }
}
