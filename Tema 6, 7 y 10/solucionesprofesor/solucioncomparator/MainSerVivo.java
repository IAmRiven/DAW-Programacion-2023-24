import java.util.ArrayList;
import java.util.Collections;

public class MainSerVivo {
    public static void main(String[] args) {
        ArrayList<SerVivo> seresVivos=new ArrayList<>();
        seresVivos.add(new Perro("Bobi","Perro",8,"g2457h"));
        seresVivos.add(new Perro("Dante","Perro",1,"g2457h"));
        seresVivos.add(new Perro("Nero","Perro",4,"g2457h"));
        seresVivos.add(new Persona("Juan","Humana", 25, "34856874g"));
        seresVivos.add(new Persona("Pedro","Humana", 35, "34855555h"));
        
        Collections.sort(seresVivos,new ComparadorEdad());
        System.out.println(seresVivos.toString());

    }
    
}
