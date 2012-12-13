import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ConcreteDivider here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ConcreteDivider extends Bag
{
    /**
     * Act - do whatever the ConcreteDivider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ConcreteDivider() {
        super(6, 300);
    }
    public void act()
    {
        // Add your action code here.
    }
    
    @Override
    public int getCost() {
        return 60;
    }
}
