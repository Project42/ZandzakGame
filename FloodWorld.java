import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FloodWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FloodWorld extends World
{
    /**
     * Constructor for objects of class FloodWorld.
     * 
     */
        public FloodWorld() 
    {
        super(80, 80, 6);
        
       for(int i=0; i<=80; i++){
           for(int j=0; j<=30; j++){
              Water water = new Water();
              addObject(water, i, j);
           }
       } 
        
       for(int i=0; i<=80; i++){
           for(int j=50; j<=80; j++){
              Wei wei = new Wei();
              addObject(wei, i, j);
           }
       }
      
       for(int i=0; i<=80; i++){
           for(int j=30; j<=50; j++){
              Dijk dijk = new Dijk();
              addObject(dijk, i, j);
           }
       }
       Burger burger = new Burger();
       addObject(burger, 40, 80);
       
    }
    public boolean stopped;
}
  
       
     
   
