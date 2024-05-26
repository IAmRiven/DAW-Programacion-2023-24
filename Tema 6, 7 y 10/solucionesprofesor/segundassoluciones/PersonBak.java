package UT6;

public class PersonBak {
   String name;
   int age;
   double height;

   public PersonBak(String myName, int myAge, double myHeight) {
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
    String PersonBak;
    PersonBak="PersonBak ["+this.name+", "+this.age+", "+this.height+", ";
    if (this.canBeGC()){
        PersonBak=PersonBak+" puede ser Guardia Civil]";
    } 
    else{
        PersonBak=PersonBak+" no puede ser Guardia Civil]";
    }
    return PersonBak;   
   }
   public static void main(String[] args) {
    PersonBak PersonBak1 = new PersonBak("Juan", 25,159);
	PersonBak PersonBak2 = new PersonBak("Luisa", 29, 165.5);
	PersonBak PersonBak3 = new PersonBak("Ana", 33, 175);

    System.out.println(PersonBak1.toString());
    System.out.println(PersonBak2.toString());
    System.out.println(PersonBak3.toString());
   }
}

