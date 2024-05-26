public class desafio5_4 {
    public static void main(String[] args) {
        int numerorandom = (int)(Math.random()*7)+1;
        diadelasemana(numerorandom);

    }
    public static void diadelasemana(int numerorandom) {
        String Dias [] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingos"};
        System.out.println("Estamos a dia: "+Dias[numerorandom-1]);
    }
}
