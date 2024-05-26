package UT6;

public class Prueba8 {
    public static void main(String[] args) {
        Person8 juan= new Person8("Juan Gabarri Garcia",18,180);
        System.out.println(juan.toString());
        Person8.setPresidente("Pedro Sánchez",45,180);
        Person8.printPresident();
    }
}
