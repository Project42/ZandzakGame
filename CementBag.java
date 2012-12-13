import greenfoot.*;

public class CementBag extends Bag {
    public CementBag() {
        super(3, 150);
        getImage().scale(30, 30);
    }
    
    @Override
    public int getCost() {
        return 30;
    }
}
