import greenfoot.*;

public class GravelBag extends Bag {
    public GravelBag() {
        super(2, 100);
    }
    
    @Override
    protected int getCost() {
        return 20;
    }
}
