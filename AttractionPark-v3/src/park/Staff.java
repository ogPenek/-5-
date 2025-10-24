package park;

public class Staff extends Person {
    protected int experienceYears;

    public Staff(String name, int age, int experienceYears) {
        super(name, age);
        this.experienceYears = experienceYears;
    }

    public void work() {
        System.out.println(getClass().getSimpleName() + ".work() -> " + name + " виконує загальну роботу");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{name='" + name + "', experienceYears=" + experienceYears + "}";
    }
}
