package UT6;

public class Person8 {
    private String name;
    private int age;
    private double height;
    private static Person8 presidente;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Person8(String myName, int myAge, double myHeight) {
        name = myName;
        age = myAge;
        height = myHeight;
    }

    public boolean canBeGC() {
        boolean cBGC = false;
        if (this.height >= 160) {
            cBGC = true;
        }
        return cBGC;
    }

    public String toString() {
        String person;
        person = "person [" + this.name + ", " + this.age + ", " + this.height + ", ";
        if (this.canBeGC()) {
            person = person + " puede ser Guardia Civil]";
        } else {
            person = person + " no puede ser Guardia Civil]";
        }
        return person;
    }

    protected static void setPresidente(String nombre, int age, double height) {
        presidente = new Person8(nombre, age, height);
    }

    protected static void printPresident() {
        System.out.println("Presidente[" + presidente.name + "," + presidente.age + "," + presidente.height + "]");
    }

    public static void main(String[] args) {
        Person8 person1 = new Person8("Juan", 25, 159);
        Person8 person2 = new Person8("Luisa", 29, 165.5);
        Person8 person3 = new Person8("Ana", 33, 175);

        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());

        Person8.setPresidente("Pedro Sánchez", 35, 1.82);
        Person8.printPresident();

    }
}
