import greenfoot.*;

public abstract class Player extends Actor {
    private int speed;
    private int initialSpeed;
    private Bag.BagType bagType;

    protected Player(int speed) {
        this.initialSpeed = speed;
        this.speed = speed;
        this.bagType = Bag.BagType.SANDBAG;
    }

    @Override
    public void act() {
        if (Greenfoot.isKeyDown("w")) move(0, -speed / 4);
        if (Greenfoot.isKeyDown("s")) move(0, +speed / 4);
        if (Greenfoot.isKeyDown("a")) move(-speed / 4, 0);
        if (Greenfoot.isKeyDown("d")) move(+speed / 4, 0);

        if(Greenfoot.mouseClicked(null)) {
            getWorld().addObject(Bag.createBag(bagType), getX(), getY());
            Greenfoot.playSound("sandbag.wav");
        }
    }

    private void move(int dx, int dy) {
        setLocation(getX() + dx, getY() + dy);
    }

    public void carryBag(Bag bag) {
        bag.getWorld().removeObject(bag);
        speed = initialSpeed - bag.getWeight();
        bagType = bag.getType();
    }
}
