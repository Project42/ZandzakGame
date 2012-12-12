import greenfoot.*;

public class Bag extends Actor {
    private int weight;

    public enum BagType {
        SANDBAG, GRAVEL_BAG, CEMENT_BAG
    }

    static Bag createBag(BagType type) {
        switch (type) {
            case SANDBAG: return new Sandbag();
            case GRAVEL_BAG: return new GravelBag();
            case CEMENT_BAG: return new CementBag();
        }

        /* Java, being a terrible language, enforces us to write a
         * return statement, even when that return statement will
         * never EVER be reached since all possible cases in the
         * switch return. */
        assert false;
        return null;
    }

    protected Bag(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public BagType getType() {
        if (this.getClass() == Sandbag.class) return BagType.SANDBAG;
        if (this.getClass() == GravelBag.class) return BagType.GRAVEL_BAG;
        if (this.getClass() == CementBag.class) return BagType.CEMENT_BAG;

        assert false;
        return null;
    }
}
