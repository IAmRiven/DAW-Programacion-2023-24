package UT6;

public class PersonNew {
   String name;
   int age;
   double height;

   public PersonNew(String myName, int myAge, double myHeight) {
     name = myName;
     age = myAge;
     height = myHeight;
   }
   public boolean canBeGC(){
        boolean cBGC=false;
    if (height>=160){
        cBGC=true;
    }
    return cBGC;
   }
   public String toString(){
    String person;
    person="person ["+name+", "+age+", "+height+", ";
    if (this.canBeGC()){
        person=person+" puede ser Guardia Civil]";
    } 
    else{
        person=person+" no puede ser Guardia Civil]";
    }
    return person;   
   }
   public static void main(String[] args) {
    Person person1 = new Person("Juan", 25,159);
	Person person2 = new Person("Luisa", 29, 165.5);
	Person person3 = new Person("Ana", 33, 175);

    System.out.println(person1.toString());
    System.out.println(person2.toString());
    System.out.println(person3.toString());
   }
}

