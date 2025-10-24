package park;

public class Attraction extends ParkEntity {
    protected String type;
    protected int capacity;
    protected double ticketPrice;
    protected boolean isWorking;

    public Attraction(String name, String type, int capacity, double ticketPrice) {
        super(name);
        this.type = type;
        this.capacity = capacity;
        this.ticketPrice = ticketPrice;
        this.isWorking = false;
    }

    public static String defaultAttractionCategory() {
        return "Amusement";
    }

    public void open() {
        isWorking = true;
        System.out.println(getClass().getSimpleName() + ".open() -> " + name + " opened");
    }

    public void close() {
        isWorking = false;
        System.out.println(getClass().getSimpleName() + ".close() -> " + name + " closed");
    }

    void performSafetyCheck() {
        System.out.println(getClass().getSimpleName() + ".performSafetyCheck() called for " + name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Атракціон: " + name + " (" + type + "), місткість: " + capacity + ", ціна: " + ticketPrice);
    }

    @Override
    public String toString() {
        return "Attraction{name='" + name + "', type='" + type + "', capacity=" + capacity + ", ticketPrice=" + ticketPrice + ", isWorking=" + isWorking + "}";
    }
}
