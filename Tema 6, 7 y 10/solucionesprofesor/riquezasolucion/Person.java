
import java.util.ArrayList;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int height;
    private ArrayList<Possesion> possesions;
    private int numberOfHouses;

    public Person(String myName, Integer myAge, int myHeight) {
        name = myName;
        age = myAge;
        height = myHeight;
        possesions = new ArrayList<>();
        numberOfHouses = 0;
    }

    public void addPossession(Possesion possession) {
        possesions.add(possession);
        if (possession instanceof House) {
            numberOfHouses++;
        }
    }

    public double calculateWealth() {
        double wealth = 0;
        for (Possesion possession : possesions) {
            wealth += possession.calculateValue();
        }
        return wealth;
    }

    public double calculateTax() {
        double tax = 0;
        if (numberOfHouses > 1) {
            for (Possesion possession : possesions) {
                tax += possession.calculateTax();
            }
        } else {
            for (Possesion possession : possesions) {
                if (!(possession instanceof House)) {
                    tax += possession.calculateTax();
                }

            }

        }

        return tax;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "\nNombre: " + name +
                "\nEdad: " + age +
                "\nAltura: " + height + "cm";
    }

    @Override
    public int compareTo(Person p) {

        return (age - p.age);

    }

}
