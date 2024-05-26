import java.util.Scanner;

public class desafio4_3 {
    public static void main(String[] args) {
        for (int repetir = 0; repetir < 3; repetir++) { //Bucle para pedir otros datos
            calculoprecio(); //Llamamos a la función
        }
    }
    public static void calculoprecio() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("¿Cuánto te ha costado la compra?"); //Pedimos el precio total sin impuestos
        double precio_bruto = keyboard.nextDouble(); //Precio sin impuestos
        System.out.println("¿Qué descuento tiene el producto?"); //Pedimos el tipo de descuento que tiene el producto 4%/10%/21%
        double descuento = keyboard.nextInt();
        if (descuento == 4) {
                descuento = 1.04;
        } else if (descuento == 10) {
                descuento = 1.10;
        } else {
            descuento = 1.21;
        }
        double sumar_impuestos = precio_bruto * descuento; //Precio introducido * descuentos [ 4, 10, 21] del IVA
        int precio_envio = 8; //Precio del envio

        if (sumar_impuestos <= 49) {
            sumar_impuestos = sumar_impuestos + precio_envio;
            System.out.println("El precio final es menor a 50, se ha sumado +8 euros.");
        } else if (sumar_impuestos >= 50) {
            System.out.println("El coste de envio es gratis.");
        }
        keyboard.close();

        System.out.println("Se está calculando el IVA de: "+descuento+"%");
        System.out.println("Precio bruto (Precio inicial): "+precio_bruto);
        System.out.println("Precio neto (final): "+sumar_impuestos);

    }
}
