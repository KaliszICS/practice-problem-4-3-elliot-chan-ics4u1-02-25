public class Chair {
    private int legs;
    private String material;

    // Constructor with no parameters
    public Chair() {
        this.legs = 4;
        this.material = "wood";
    }

    // Constructor with 1 parameter
    public Chair(int legs) {
        this.legs = legs;
        this.material = "wood";
    }

    // Constructor with 2 parameters
    public Chair(int legs, String material) {
        this.legs = legs;
        this.material = material;
    }

    // Getter for legs
    public int getLegs() {
        return legs;
    }

    // Getter for material
    public String getMaterial() {
        return material;
    }
}