import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WoodenDivider here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WoodenDivider extends Bag
{
    /**
     * Act - do whatever the WoodenDivider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public WoodenDivider() {
        super(4, 1);
        getImage().scale(75,50);
    }
    public void act()
    {
        // Add your action code here.
    }
    @Override
    public int getCost() {
        return 40;
    }
}
