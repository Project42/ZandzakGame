import greenfoot.*;
import javax.swing.JOptionPane;

public class Water extends Actor {
    public Water() {
        getImage().scale(10, 10);
    }

    public void act() {
        if (Math.random() > 0.1) return;
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

        Actor meadow = getOneObjectAtOffset(0, 0, Meadow.class);
        if (meadow == null) return;
        Greenfoot.stop();
        JOptionPane.showMessageDialog(null, "De dijk is doorgebroken!");
    }
}
