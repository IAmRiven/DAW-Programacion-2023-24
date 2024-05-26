public class Guardia {
    int altura;

    public Guardia(int altura) {
        this.altura = altura;
    }

    public boolean pasaRequisitos() {
        return altura >= 160;
    }

    public static void main(String[] args) {
        Guardia persona_1 = new Guardia(160);
        Guardia persona_2 = new Guardia(190);
        Guardia persona_3 = new Guardia(140);

        System.out.println(
                "Persona 1 " + "con " + persona_1.altura + " cms puede ser Guardia Civil? "
                        + persona_1.pasaRequisitos());
        System.out.println(
                "Persona 2 " + "con " + persona_2.altura + " cms puede ser Guardia Civil? "
                        + persona_2.pasaRequisitos());
        System.out.println(
                "Persona 3 " + "con " + persona_3.altura + " cms puede ser Guardia Civil? "
                        + persona_3.pasaRequisitos());
    }

}
// Challenge6_3. Can a person become a “Guardia Civil”.
// You can become a “Guardia Civil” if you are taller than or equal to 160 cms.
// Modify the class person to store the height of a person and create a new
// method
// that decides if a person can be a “Guardia Civil”.
// The method should return a boolean.
