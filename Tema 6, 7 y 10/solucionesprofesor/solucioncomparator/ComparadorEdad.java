import java.util.Comparator;

public class ComparadorEdad implements Comparator<SerVivo> {

    @Override
    public int compare(SerVivo o1, SerVivo o2) {
        
        int edad1, edad2;

        if (o1 instanceof Persona){
            edad1=o1.getEdad();

        }else{
            edad1=((Perro)o1).getEdadHumana();

        }

        if (o2 instanceof Persona){
            edad2=o2.getEdad();

        }else{
            edad2=((Perro)o2).getEdadHumana();

        }

        return Integer.compare(edad1,edad2);
    }


    
}
