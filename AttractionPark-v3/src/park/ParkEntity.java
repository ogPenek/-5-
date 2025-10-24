package park;

public class ParkEntity {
    protected String name;

    public ParkEntity(String name) {
        this.name = name;
    }

    public static String entityType() {
        return "GeneralParkEntity";
    }

    public void displayInfo() {
        System.out.println(getClass().getSimpleName() + ".displayInfo() -> name=" + name);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{name='" + name + "'}";
    }
}
