import greenfoot.*;

public class Citizen extends Player {
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    private GreenfootImage image5;
    private GreenfootImage image6;
    private GreenfootImage image7;
    private GreenfootImage image8;

    public Citizen() {
        super(4);

        image1 = new GreenfootImage("BURGERlinks2.png");
        image2 = new GreenfootImage("BURGERlinks1.png");
        image3 = new GreenfootImage("BURGERrechts2.png");
        image4 = new GreenfootImage("BURGERrechts1.png");
        image5 = new GreenfootImage("BURGERvoor2.png");
        image6 = new GreenfootImage("BURGERvoor1.png");
        image7 = new GreenfootImage("BURGERachter2.png");
        image8 = new GreenfootImage("BURGERachter1.png");
    }

    @Override
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

    @Override
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

    @Override
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

    @Override
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

