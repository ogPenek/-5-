package park;

public class Visitor extends Person {

    public static class NameInfo {
        public final String firstName;
        public final String lastName;

        public NameInfo(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public String toString() {
            return firstName + (lastName != null && !lastName.isEmpty() ? " " + lastName : "");
        }
    }

    private NameInfo nameInfo;

    public Visitor(String name, int age) {
        super(name, age);
        this.nameInfo = new NameInfo(name, "");
    }

    public void visitAttraction(Attraction a) {
        System.out.println(getClass().getSimpleName() + ".visitAttraction() -> " + name + " visits " + a.getName());
    }

    @Override
    public void greet() {
        System.out.println(getClass().getSimpleName() + ".greet() -> Я відвідувач " + name + ", вік: " + age);
    }

    public NameInfo getNameInfo() {
        return nameInfo;
    }

    @Override
    public String toString() {
        return "Visitor{name='" + name + "', age=" + age + "'}";
    }
}
