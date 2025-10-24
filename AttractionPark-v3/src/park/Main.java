package park;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== AttractionPark v3 (static demo) ===\n");

        Attraction rc = ObjectFactory.createAttraction("Американські гірки", "екстремальний", 20, 150.0);
        Attraction wheel = ObjectFactory.createAttraction("Оглядове колесо", "сімейний", 40, 80.0);

        Visitor ivan = ObjectFactory.createVisitor("Іван", 25);
        Visitor petroV = ObjectFactory.createVisitor("Петро", 12);

        Operator ol = ObjectFactory.createOperator("Олег", 33, 6, rc.getName());
        Technician taras = ObjectFactory.createTechnician("Тарас", 45, 12, "електрик");

        TransactionHistory t1 = ObjectFactory.createTransaction(ivan.getName(), 150.0);
        TransactionHistory t2 = ObjectFactory.createTransaction(petroV.getName(), 80.0);

        System.out.println();
        System.out.println("ParkEntity.entityType(): " + ParkEntity.entityType());
        System.out.println("Person.species(): " + Person.species());
        System.out.println("Attraction.defaultAttractionCategory(): " + Attraction.defaultAttractionCategory());
        System.out.println("TransactionHistory.currency(): " + TransactionHistory.currency());

        System.out.println();
        rc.displayInfo();
        rc.performSafetyCheck(); 
        rc.open();
        rc.close();

        ivan.greet();
        ivan.visitAttraction(rc);
        System.out.println("Visitor NameInfo: " + ivan.getNameInfo());

        ol.greet();
        ol.work(); 
        ol.checkSafety();

        taras.greet();
        taras.work();
        taras.repair();

        t1.displayInfo();
        t1.refund();

        System.out.println();
        DataStore.printSummary();

        System.out.println();
        System.out.println("=== End ===");
    }
}

