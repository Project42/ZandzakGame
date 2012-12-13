import greenfoot.*;

public class CementBag extends Bag {
    public CementBag() {
        super(3, 150);
    }
    
    @Override
    protected int getCost() {
        return 30;
    }
}
