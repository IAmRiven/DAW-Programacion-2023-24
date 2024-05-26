public class profesion {
    String nombre;
    double altura;
    int edad;
    
    public profesion(String nombre, double altura, int edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
    }
    public boolean checkAltura(){
        return altura >= 160;
    }

    @Override
    public String toString() {
        String persona;
        persona = this.nombre+" con "+this.altura+" con "+this.edad;
        if (this.checkAltura()) {
            persona=persona+" puede ser guardia civil.";
        } else {
            persona=persona+" no puede ser guardia civil.";
        }
        return persona;
    }

    public static void main(String[] args) {
        profesion persona_1 = new profesion("Manolo", 160, 34);
        profesion persona_2 = new profesion("Emilio", 120, 43);

        System.out.println(persona_1);
        System.out.println(persona_2);

    }
}


// You can become a “Guardia Civil” if you are taller than or equal to 160 cms.
// Modify the class person to store the height of a person and create a new method
// that decides if a person can be a “Guardia Civil”.
// The method should return a boolean.

