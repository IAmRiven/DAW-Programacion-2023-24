import java.util.Scanner;

public class desafio4_6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Dime el ancho de la pared: ");
        double ancho = keyboard.nextDouble(); 
        System.out.print("Dime el alto de la pared: ");
        double alto = keyboard.nextDouble();
        double areapared = areapared(ancho, alto);
        
        System.out.println("El area de la pared es: "+areapared);

        System.out.println("Necesitas: "+litros(areapared)+" litro/s de pintura.");

        keyboard.close();
    }

    public static double areapared(double ancho, double alto) {
        return(ancho * alto);        
    }

    public static double litros(double areapared) {
        return(areapared * 4);
        
    }

}
// cuánta pintura se necesita para pintar una pared.
// Lo primero que tenemos que hacer es crear una función 
// para calcular el ** área de la pared con un ancho y alto ** 
// proporcionados. Una vez que conocemos el área, tenemos 
// que pasar esta área a una segunda función que calcula los 
// litros de pintura necesarios para esta área suponiendo que 
// necesitamos 4 litros de pintura por cada metro cuadrado.
