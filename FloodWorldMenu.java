import greenfoot.*;

public class FloodWorldMenu extends World {
    public FloodWorldMenu() {
        super(80, 80, 10);
        setBackground("achtergrondSelectie.png");
    }

    @Override
    public void act() {
        if (Greenfoot.isKeyDown("1")) {
            Greenfoot.setWorld(new FloodWorld(SandbagPlayer.PlayerType.POLICE));
            return;
        }

        if (Greenfoot.isKeyDown("2")) {
            Greenfoot.setWorld(new FloodWorld(SandbagPlayer.PlayerType.GENIUS));
            return;
        }

        if (Greenfoot.isKeyDown("3")) {
            Greenfoot.setWorld(new FloodWorld(SandbagPlayer.PlayerType.CITIZEN));
            return;
        }
    }
}
