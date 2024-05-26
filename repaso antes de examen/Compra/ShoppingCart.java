package Compra;

import java.text.DecimalFormat;
import java.util.HashMap;

public class ShoppingCart {
    private HashMap<Product, Integer> cartItems;

    public ShoppingCart() {
        cartItems = new HashMap<>();
    }

    public void addProduct(Product p) {
        cartItems.put(p, cartItems.getOrDefault(p, 0) + 1);
    }

    public void show() {
        DecimalFormat formato = new DecimalFormat("#.##");
        System.out.println("******Elementos del carrito******");
        double preciototal_carrito = 0;

        for (HashMap.Entry<Product, Integer> recorrer_carrito : cartItems.entrySet()) {
            double totalPrice = 0;
            int cantidad = recorrer_carrito.getValue();
            totalPrice += recorrer_carrito.getKey().getPrice();
            getcantidadProducto(cantidad);
            System.out.println(recorrer_carrito.getKey().getName() + " con " + recorrer_carrito.getValue() + " cuesta: "
                    + cantidad * totalPrice);
            preciototal_carrito = preciototal_carrito + (cantidad * totalPrice);
        }
        System.out.println("Precio total del carrito: " + formato.format(preciototal_carrito) + " euros");
    }

    public int getcantidadProducto(int cantidad) {
        return cantidad;
    }

    public static void main(String[] args) {
        Product lechuga = new Product("lechuga", 1);
        Product leche = new Product("leche", 1.20);
        Product pan = new Product("Pan", 0.60);
        ProductOnSale natillas = new ProductOnSale("Natillas danone pack 4", 2, 10);
        ShoppingCart sc = new ShoppingCart();
        sc.addProduct(lechuga);
        sc.addProduct(lechuga);
        sc.addProduct(lechuga);
        sc.addProduct(lechuga);
        sc.addProduct(lechuga);
        sc.addProduct(lechuga);
        sc.addProduct(lechuga);
        sc.addProduct(leche);
        sc.addProduct(leche);
        sc.addProduct(leche);
        sc.addProduct(leche);
        sc.addProduct(natillas);
        // sc.addProduct(pan);
        // sc.addProduct(pan);
        // sc.addProduct(natillas);
        sc.show();

    }
}
