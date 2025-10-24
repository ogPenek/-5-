package park;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataStore {
    public static final List<Visitor> visitors = new ArrayList<>();
    public static final List<Attraction> attractions = new ArrayList<>();
    public static final List<Staff> staff = new ArrayList<>();
    public static final List<TransactionHistory> transactions = new ArrayList<>();

    private DataStore() {} 

    public static void addVisitor(Visitor v) {
        visitors.add(v);
        System.out.println("DataStore.addVisitor() -> added " + v.getName());
    }

    public static void addAttraction(Attraction a) {
        attractions.add(a);
        System.out.println("DataStore.addAttraction() -> added " + a.getName());
    }

    public static void addStaff(Staff s) {
        staff.add(s);
        System.out.println("DataStore.addStaff() -> added " + s.getName());
    }

    public static void addTransaction(TransactionHistory t) {
        transactions.add(t);
        System.out.println("DataStore.addTransaction() -> added transaction for " + t.getName());
    }

    public static void printSummary() {
        System.out.println("DataStore.summary -> visitors=" + visitors.size() + ", attractions=" + attractions.size() + ", staff=" + staff.size() + ", transactions=" + transactions.size());
    }

    public static List<Visitor> getVisitors() {
        return Collections.unmodifiableList(visitors);
    }
}
