import greenfoot.*;

public abstract class Player extends Actor {
    private int speed;
    private int initialSpeed;
    private Bag.BagType bagType;

    protected GreenfootImage image1;
    protected GreenfootImage image2;
    protected GreenfootImage image3;
    protected GreenfootImage image4;
    protected GreenfootImage image5;
    protected GreenfootImage image6;
    protected GreenfootImage image7;
    protected GreenfootImage image8;

    protected Player(int speed) {
        this.initialSpeed = speed;
        this.speed = speed;
        this.bagType = Bag.BagType.SANDBAG;
    }

    @Override
    public void act() {
        if (Greenfoot.isKeyDown("w")) {
            move(0, -speed / 4);
            switchImageStraight();
        }

        if (Greenfoot.isKeyDown("s")) {
            move(0, +speed / 4);
            switchImageBack();
        }

        if (Greenfoot.isKeyDown("a")) {
            move(-speed / 4, 0);
            switchImageLeft();
        }

        if (Greenfoot.isKeyDown("d")) {
            move(+speed / 4, 0);
            switchImageRight();
        }

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

    protected void switchImageLeft()
    {
        if (getImage() == image1)
        {
            setImage(image2);
        }
        else
        {
            setImage(image1);
        }
    }

    protected void switchImageRight()
    {
        if (getImage() == image3)
        {
            setImage(image4);
        }
        else
        {
            setImage(image3);
        }
    }

    protected void switchImageStraight()
    {
        if (getImage() == image5)
        {
            setImage(image6);
        }
        else
        {
            setImage(image5);
        }
    }

    protected void switchImageBack()
    {
        if (getImage() == image7)
        {
            setImage(image8);
        }
        else
        {
            setImage(image7);
        }
    }
}
