package park;

public class ObjectFactory {
    private ObjectFactory() {} 

    public static Attraction createAttraction(String name, String type, int capacity, double price) {
        Attraction a = new Attraction(name, type, capacity, price);
        DataStore.addAttraction(a);
        System.out.println("ObjectFactory.createAttraction() -> created " + a.getName());
        return a;
    }

    public static Visitor createVisitor(String name, int age) {
        Visitor v = new Visitor(name, age);
        DataStore.addVisitor(v);
        System.out.println("ObjectFactory.createVisitor() -> created " + v.getName());
        return v;
    }

    public static Operator createOperator(String name, int age, int exp, String assigned) {
        Operator o = new Operator(name, age, exp, assigned);
        DataStore.addStaff(o);
        System.out.println("ObjectFactory.createOperator() -> created " + o.getName());
        return o;
    }

    public static Technician createTechnician(String name, int age, int exp, String specialization) {
        Technician t = new Technician(name, age, exp, specialization);
        DataStore.addStaff(t);
        System.out.println("ObjectFactory.createTechnician() -> created " + t.getName());
        return t;
    }

    public static TransactionHistory createTransaction(String visitorName, double amount) {
        TransactionHistory tr = new TransactionHistory(visitorName, amount);
        DataStore.addTransaction(tr);
        System.out.println("ObjectFactory.createTransaction() -> created transaction for " + visitorName);
        return tr;
    }
}
