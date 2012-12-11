import greenfoot.*;

public class FloodWorld extends World {
    public boolean stopped;

    public FloodWorld()  {
        super(80, 80, 6);

        for(int i=0; i<=80; i++) {
            for(int j=0; j<=30; j++) {
                addObject(new Water(), i, j);
            }
        }

        for(int i = 0; i <= 80; i++) {
            for(int j = 50; j <= 80; j++) {
                addObject(new Meadow(), i, j);
            }
        }

        for(int i = 0; i <= 80; i++) {
            for(int j = 30; j <= 50; j++) {
                addObject(new Floodbank(), i, j);
            }
        }

        Citizen citizen = new Citizen();
        addObject(citizen, 40, 80);
    }
}
