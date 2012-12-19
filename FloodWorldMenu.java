import greenfoot.*;

public class FloodWorldMenu extends World {
    public FloodWorldMenu() {
        super(80, 80, 10);
    }

    @Override
    public void act() {
        if (Greenfoot.isKeyDown("1")) {
            Greenfoot.setWorld(new FloodWorld(Player.PlayerType.CITIZEN));
        }

        if (Greenfoot.isKeyDown("2")) {
            Greenfoot.setWorld(new FloodWorld(Player.PlayerType.POLICE));
        }

        if (Greenfoot.isKeyDown("3")) {
            Greenfoot.setWorld(new FloodWorld(Player.PlayerType.GENIUS));
        }
    }
}
