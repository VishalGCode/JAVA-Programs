package demoAccessorMutator;

public class Student {
    private String name;
    private long roll;
    private float percentage;

    // Getter and Setter for 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for 'roll'
    public long getRoll() {
        return roll;
    }

    public void setRoll(long roll) {
        this.roll = roll;
    }

    // Getter and Setter for 'percentage'
    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }
}
