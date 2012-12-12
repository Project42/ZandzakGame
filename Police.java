import greenfoot.*;

public class Police extends Player {
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    private GreenfootImage image5;
    private GreenfootImage image6;
    private GreenfootImage image7;
    private GreenfootImage image8;
    
    public Police() {
        super(6);
        
        image1 = new GreenfootImage("POLITIElinks2.png");
        image2 = new GreenfootImage("POLITIElinks1.png"); 
        image3 = new GreenfootImage("POLITIErechts2.png");
        image4 = new GreenfootImage("POLITIErechts1.png"); 
        image5 = new GreenfootImage("POLITIEvoor2.png");
        image6 = new GreenfootImage("POLITIEvoor1.png"); 
        image7 = new GreenfootImage("POLITIEachter2.png");
        image8 = new GreenfootImage("POLITIEachter1.png"); 
    }
    
    public void act(){
        if (Greenfoot.isKeyDown("w")){
            switchImageLeft();
        }
        
        if (Greenfoot.isKeyDown("s")){
            switchImageRight();
        }
        
        if (Greenfoot.isKeyDown("a")){
            switchImageStraight();
        }
        
        if (Greenfoot.isKeyDown("d")){
            switchImageBack();
        }
        

    }
    
    public void switchImageLeft()
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
    
    public void switchImageRight()
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
    
    public void switchImageStraight()
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
    
    public void switchImageBack()
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
