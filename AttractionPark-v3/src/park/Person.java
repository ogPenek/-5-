package park;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static String species() {
        return "Homo sapiens";
    }

    public void greet() {
        System.out.println(getClass().getSimpleName() + ".greet() -> Привіт, я " + name);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{name='" + name + "', age=" + age + "}";
    }
}
