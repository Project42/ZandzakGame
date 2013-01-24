import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IronDivider here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IronDivider extends Bag
{
    /**
     * Act - do whatever the IronDivider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public IronDivider() {
        super(5, 4);
        getImage().scale(75,50);
    }
    public void act()
    {
        // Add your action code here.
    }
    
    @Override
    public int getCost() {
        return 50;
    }
}
