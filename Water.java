import greenfoot.*;
import javax.swing.JOptionPane;

public class Water extends Actor {

    private int life = 2;

    public Water() {
        getImage().scale(10, 10);
    }

    public void act() {
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

        Actor Sandbag = getOneObjectAtOffset(dx, dy, Sandbag.class);
        if (Sandbag == null) return;
        life -= 1;
        if(life == 0){

        getWorld().removeObject(Sandbag);
        getWorld().addObject(new Water(), getX() + dx, getY() + dy);
        }

        Actor meadow = getOneObjectAtOffset(0, 0, Meadow.class);
        if (meadow == null) return;
        Greenfoot.stop();
        JOptionPane.showMessageDialog(null, "De dijk is doorgebroken!");
    }

    public void delete()
    {
        ((FloodWorld) getWorld()).countBags();
        getWorld().removeObject(this);
    }
}
