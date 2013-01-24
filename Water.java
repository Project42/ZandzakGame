import greenfoot.*;
import javax.swing.JOptionPane;

public class Water extends Actor {

    private int life = 2;

    public Water() {
        getImage().scale(10, 10);
    }

    public void act() {
        checkDifficulty();
        
        if (getOneIntersectingObject(Bag.class) != null) {
            getWorld().addObject(new Floodbank(), getX(), getY());
            getWorld().removeObject(this);
            return;
        }

        Actor meadow = getOneObjectAtOffset(0, 0, Meadow.class);
        if (meadow == null) return;
        Greenfoot.stop();
        JOptionPane.showMessageDialog(null, "De dijk is doorgebroken!");
    }
    
    public void checkDifficulty() {      

        if((((FloodWorld)getWorld()).getScoreCounter().value) <= 1000){
            if (Math.random() > 0.01) return;
            int dx = 0, dy = 0;
            switch ((int)(3.0 * Math.random())) {
                case 0: dx = 0; dy = 1; break;
                case 1: dx = 1; dy = 0; break;
                case 2: dx = -1; dy = 0; break;
            }

        Actor floodbank = getOneObjectAtOffset(dx, dy, Floodbank.class);
            if (floodbank == null) return;
            getWorld().removeObject(floodbank);
            getWorld().addObject(new Water(), getX() + dx, getY() + dy);
            
        }
        
        else if(((((FloodWorld)getWorld()).getScoreCounter().value) <= 2000)&&((((FloodWorld)getWorld()).getScoreCounter().value) > 1000)){
            if (Math.random() > 0.02) return;
                int dx = 0, dy = 0;
                switch ((int)(3.0 * Math.random())) {
                    case 0: dx = 0; dy = 1; break;
                    case 1: dx = 1; dy = 0; break;
                    case 2: dx = -1; dy = 0; break;
                }
        Actor floodbank = getOneObjectAtOffset(dx, dy, Floodbank.class);
            if (floodbank == null) return;
            getWorld().removeObject(floodbank);
            getWorld().addObject(new Water(), getX() + dx, getY() + dy);
                
            
        }
        
        else if(((((FloodWorld)getWorld()).getScoreCounter().value) <= 2500)&&((((FloodWorld)getWorld()).getScoreCounter().value) > 2000)){
            if (Math.random() > 0.03) return;
                int dx = 0, dy = 0;
                switch ((int)(3.0 * Math.random())) {
                    case 0: dx = 0; dy = 1; break;
                    case 1: dx = 1; dy = 0; break;
                    case 2: dx = -1; dy = 0; break;
                }
        Actor floodbank = getOneObjectAtOffset(dx, dy, Floodbank.class);
            if (floodbank == null) return;
            getWorld().removeObject(floodbank);
            getWorld().addObject(new Water(), getX() + dx, getY() + dy);
                
            
        }
        
        else if(((((FloodWorld)getWorld()).getScoreCounter().value) <= 3000)&&((((FloodWorld)getWorld()).getScoreCounter().value) > 2500)){
            if (Math.random() > 0.04) return;
                int dx = 0, dy = 0;
                switch ((int)(3.0 * Math.random())) {
                    case 0: dx = 0; dy = 1; break;
                    case 1: dx = 1; dy = 0; break;
                    case 2: dx = -1; dy = 0; break;
                }
        Actor floodbank = getOneObjectAtOffset(dx, dy, Floodbank.class);
            if (floodbank == null) return;
            getWorld().removeObject(floodbank);
            getWorld().addObject(new Water(), getX() + dx, getY() + dy);
                
            
        }
        
        else if(((((FloodWorld)getWorld()).getScoreCounter().value) <= 3500)&&((((FloodWorld)getWorld()).getScoreCounter().value) > 3000)){
            if (Math.random() > 0.05) return;
                int dx = 0, dy = 0;
                switch ((int)(3.0 * Math.random())) {
                    case 0: dx = 0; dy = 1; break;
                    case 1: dx = 1; dy = 0; break;
                    case 2: dx = -1; dy = 0; break;
                }
         Actor floodbank = getOneObjectAtOffset(dx, dy, Floodbank.class);
            if (floodbank == null) return;
            getWorld().removeObject(floodbank);
            getWorld().addObject(new Water(), getX() + dx, getY() + dy);
               
            
        }
        
        else if(((((FloodWorld)getWorld()).getScoreCounter().value) <= 4000)&&((((FloodWorld)getWorld()).getScoreCounter().value) > 3500)){
            if (Math.random() > 0.06) return;
                int dx = 0, dy = 0;
                switch ((int)(3.0 * Math.random())) {
                    case 0: dx = 0; dy = 1; break;
                    case 1: dx = 1; dy = 0; break;
                    case 2: dx = -1; dy = 0; break;
                }
        Actor floodbank = getOneObjectAtOffset(dx, dy, Floodbank.class);
            if (floodbank == null) return;
            getWorld().removeObject(floodbank);
            getWorld().addObject(new Water(), getX() + dx, getY() + dy);
                
            
        }
        
        else if(((((FloodWorld)getWorld()).getScoreCounter().value) <= 4500)&&((((FloodWorld)getWorld()).getScoreCounter().value) > 4000)){
            if (Math.random() > 0.08) return;
                int dx = 0, dy = 0;
                switch ((int)(3.0 * Math.random())) {
                    case 0: dx = 0; dy = 1; break;
                    case 1: dx = 1; dy = 0; break;
                    case 2: dx = -1; dy = 0; break;
                }
        Actor floodbank = getOneObjectAtOffset(dx, dy, Floodbank.class);
            if (floodbank == null) return;
            getWorld().removeObject(floodbank);
            getWorld().addObject(new Water(), getX() + dx, getY() + dy);
                
            
        }
        
        else if(((((FloodWorld)getWorld()).getScoreCounter().value) <= 5000)&&((((FloodWorld)getWorld()).getScoreCounter().value) > 4500)){
            if (Math.random() > 0.10) return;
                int dx = 0, dy = 0;
                switch ((int)(3.0 * Math.random())) {
                    case 0: dx = 0; dy = 1; break;
                    case 1: dx = 1; dy = 0; break;
                    case 2: dx = -1; dy = 0; break;
                }
        Actor floodbank = getOneObjectAtOffset(dx, dy, Floodbank.class);
            if (floodbank == null) return;
            getWorld().removeObject(floodbank);
            getWorld().addObject(new Water(), getX() + dx, getY() + dy);
                
            
        }
        
        else if((((FloodWorld)getWorld()).getScoreCounter().value) > 5000){
            if (Math.random() > 0.15) return;
                int dx = 0, dy = 0;
                switch ((int)(3.0 * Math.random())) {
                    case 0: dx = 0; dy = 1; break;
                    case 1: dx = 1; dy = 0; break;
                    case 2: dx = -1; dy = 0; break;
                }
        Actor floodbank = getOneObjectAtOffset(dx, dy, Floodbank.class);
            if (floodbank == null) return;
            getWorld().removeObject(floodbank);
            getWorld().addObject(new Water(), getX() + dx, getY() + dy);
                
            
        }
       
    }
}
