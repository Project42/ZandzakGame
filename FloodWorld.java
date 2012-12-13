import greenfoot.*;

public class FloodWorld extends World {
    public boolean stopped;
    private Counter scoreCounter;
    private Player player;
    
    public FloodWorld()  {
        super(80, 80, 10);

        setPaintOrder(GameOverScreen.class, MenuBar.class, Player.class, Bag.class, Water.class, Floodbank.class);

        for(int i=0; i<=80; i++) {
            for(int j=0; j<=30; j++) {
                addObject(new Water(), i, j);
            }
        }

        for(int i = 0; i <= 80; i++) {
            for(int j = 50; j <= 70; j++) {
                addObject(new Meadow(), i, j);
            }
        }

        addObject(new MenuBar(), 39, 75);

        for(int i = 0; i <= 80; i++) {
            for(int j = 30; j <= 50; j++) {
                addObject(new Floodbank(), i, j);
            }
        }

        addObject(player = new Citizen(), 40, 67);

        scoreCounter = new Counter("Score: ");
        addObject(scoreCounter, 10, 2);
        scoreCounter.add(10);
    }

    public void act(){

        scoreCounter.add(2);
    }

    public void countBags(){
        scoreCounter.add(5);
    }
    
    public Player getPlayer() {
        return player;
    }
}
