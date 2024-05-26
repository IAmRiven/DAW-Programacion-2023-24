package UT6;

public class Person {
   String name;
   int age;
   double height;
   static Person presidente;


   public Person(String myName, int myAge, double myHeight) {
     name = myName;
     age = myAge;
     height = myHeight;
   }
   public boolean canBeGC(){
        boolean cBGC=false;
    if (this.height>=160){
        cBGC=true;
    }
    return cBGC;
   }
   public String toString(){
    String person;
    person="person ["+this.name+", "+this.age+", "+this.height+", ";
    if (this.canBeGC()){
        person=person+" puede ser Guardia Civil]";
    } 
    else{
        person=person+" no puede ser Guardia Civil]";
    }
    return person;   
   }
   public static void setPresidente(String nombre, int age, double height){
    presidente=new Person(nombre, age, height);
   }
   public static void printPresident(){
    System.out.println("Presidente["+presidente.name+","+presidente.age+","+presidente.height+"]");
   }
   public static void main(String[] args) {
    Person person1 = new Person("Juan", 25,159);
	Person person2 = new Person("Luisa", 29, 165.5);
	Person person3 = new Person("Ana", 33, 175);

    System.out.println(person1);
    System.out.println(person2);
    System.out.println(person3);

    Person.setPresidente("Pedro Sánchez",35,1.82);
    Person.printPresident();
    

   }
}

