package park;

public class Operator extends Staff {
    private String assignedAttraction;

    public Operator(String name, int age, int experienceYears, String assignedAttraction) {
        super(name, age, experienceYears);
        this.assignedAttraction = assignedAttraction;
    }

    @Override
    public void work() {
        System.out.println(getClass().getSimpleName() + ".work() -> " + name + " керує атракціоном: " + assignedAttraction);
    }

    public void checkSafety() {
        System.out.println(getClass().getSimpleName() + ".checkSafety() -> перевірка безпеки на " + assignedAttraction);
    }

    @Override
    public String toString() {
        return "Operator{name='" + name + "', experience=" + experienceYears + ", assignedAttraction='" + assignedAttraction + "'}";
    }
}
