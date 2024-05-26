
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Cat(5.2));
        // animals.add(new Rat(1.7, true));
        animals.add(new Sheep(15.0, "White"));
        animals.add(new Rat(1.5, false));
        animals.add(new Rat(3, true));
        animals.add(new Sheep(30, "Black"));
        animals.add(new Sheep(40, "Black-White"));
        Animal victima = new Sheep(40, "Brown");
        animals.add(victima);

        for (Animal animal : animals) {
            animal.print();
            animal.canEat(victima);
            System.out.println(); // Separador

        }
    }
}
