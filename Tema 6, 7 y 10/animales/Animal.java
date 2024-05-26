
import java.util.HashMap;
import java.util.Map;

class Animal {
    private static Map<String, Integer> speciesCount = new HashMap<>();
    private double weight;
    private String species;

    public Animal(double weight, String species) {
        this.weight = weight;
        this.species = species;
        speciesCount.put(species, speciesCount.getOrDefault(species, 0) + 1);
    }

    public double getWeight() {
        return weight;
    }

    public String getSpecies() {
        return species;
    }

    public void print() {
        System.out.println("Species: " + species);
        System.out.println("Weight: " + weight);
        System.out.println("Contador especies: " + speciesCount.get(species));
        if (speciesCount.getOrDefault(species, 0) < 3) {
            System.out.println("Warning: This species is in danger of extinction!");
        }
    }

    public boolean canEat(Animal otherAnimal) {
        // Herbivores can't eat other animals
        if (this instanceof Herbivore) {
            System.out.println("Herbivores can't eat other animals.");
            return false;
        }

        // An animal can't eat another animal of the same species
        if (this.getSpecies().equals(otherAnimal.getSpecies())) {
            System.out.println("An animal can't eat another animal of the same species.");
            return false;
        }

        // Check if the animal has rabies
        if (this instanceof Rat && ((Rat) this).hasRabies()) {
            System.out.println("The rat has rabies and can eat other animals.");
            return true;
        }

        // A carnivore animal can eat another animal if it is bigger than the other
        if (this instanceof Carnivore && this.getWeight() > otherAnimal.getWeight()) {
            return true;
        }

        System.out.println("The animal can't eat the other animal.");
        return false;
    }
}

// Sheep class extending Animal
class Sheep extends Animal implements Herbivore {
    private String color;

    public Sheep(double weight, String color) {
        super(weight, "Sheep");
        this.color = color;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Color: " + color);
    }
}

// Rat class extending Animal
class Rat extends Animal implements Carnivore {
    private boolean hasRabies;

    public Rat(double weight, boolean hasRabies) {
        super(weight, "Rat");
        this.hasRabies = hasRabies;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Rabies: " + (hasRabies ? "Yes" : "No"));
    }

    public boolean hasRabies() {
        return hasRabies;
    }
}

// Cat class extending Animal
class Cat extends Animal implements Carnivore {
    public Cat(double weight) {
        super(weight, "Cat");
    }
}
