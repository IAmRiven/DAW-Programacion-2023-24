import java.util.ArrayList;

public class MainPossessions {
    public static void main(String[] args) {
        Person person = new Person("Amancio Rodriguez", 70, 178);
        Person person2 = new Person("Carlos Orenes", 25, 185);

        // Create possessions
        BankAccount bankAccount = new BankAccount(5000);
        BankAccount bankAccount2 = new BankAccount(50000);
        House house = new House(200000, 10);

        Car car = new Car(30000, 50000);

        // Add possessions to person
        person.addPossession(bankAccount);
        person.addPossession(house);
        person.addPossession(house);
        person.addPossession(car);

        person2.addPossession(bankAccount2);
        person2.addPossession(house);
        person2.addPossession(car);

        System.out.println("");

        // // Calculate wealth
        // double wealth = person.calculateWealth();
        // System.out.println("Total wealth: " + wealth + " euros");

        // // calculate tax
        // double tax = person.calculateTax();
        // System.out.println("Total tax: " + tax + " euros");

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person2);
        persons.add(person);

        for (Person p : persons) {
            // Calculate wealth
            System.out.println("*******************************************");
            System.err.println(p.getName());
            double wealth = p.calculateWealth();
            System.out.println("Total wealth: " + wealth + " euros");

            // calculate tax
            double tax = p.calculateTax();
            System.out.println("Total tax: " + tax + " euros");
            System.out.println("********************************************");

        }

    }

}
