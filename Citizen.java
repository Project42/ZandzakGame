import greenfoot.*;

public class Citizen extends Actor {
    private int speed;

    public Citizen() {
        speed = 4;
        getImage();
    }

    @Override
    public void act() {
        if (Greenfoot.isKeyDown("w")) move(0, -speed);
        if (Greenfoot.isKeyDown("s")) move(0, +speed);
        if (Greenfoot.isKeyDown("a")) move(-speed, 0);
        if (Greenfoot.isKeyDown("d")) move(+speed, 0);
        
        
        if(Greenfoot.mouseClicked(null)) {
            int x = -getImage().getWidth()*4;
            int y = getImage().getHeight()*4;
            Water water = (Water) getOneObjectAtOffset(x , y, Water.class);
            if(water != null) {
                water.delete();
               getWorld().addObject(new Sandbag(), x, y);
                Greenfoot.playSound("sandbag.wav");
            }
        }
    }

    private void move(int dx, int dy) {
        setLocation(getX() + dx, getY() + dy);
    }

    public void schotSpeed() {
        speed += 2;
    }

    public void grindzakSpeed() {
        speed -= 1;
    }

    public void zandzakSpeed() {
        speed += 0;
    }

    public void cementzakSpeed() {
        speed -= 2;
    }
}

