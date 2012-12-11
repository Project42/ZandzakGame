import greenfoot.*;
import javax.swing.JOptionPane;

public class Water extends Actor {
    public Water() {
        getImage().scale(6, 6);
    }

    public void act() {
        if (!((FloodWorld)getWorld()).stopped && Math.random() < 0.1) {
    
            int dx = 0, dy = 0;
            switch ((int)(3.0 * Math.random())) {
                case 0: dx = 0; dy = 1; break;
                case 1: dx = 1; dy = 0; break;
                case 2: dx = -1; dy = 0; break;
            }
    
            Dijk dijk = (Dijk)getOneObjectAtOffset(dx, dy, Dijk.class);
            if (dijk == null) {
                return;
            }
            else{
                getWorld().removeObject(dijk);
                getWorld().addObject(new Water(), getX() + dx, getY() + dy);
            }
    
            Wei wei = (Wei)getOneObjectAtOffset(0, 0, Wei.class);
            if (wei == null) {
                return;
            }
            else{
            ((FloodWorld)getWorld()).stopped = true;
                JOptionPane.showMessageDialog(null, "De dijk is doorgebroken!");
                return;
            }
            
            

            
    }
}
}
