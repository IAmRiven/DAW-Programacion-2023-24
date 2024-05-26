

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> cartItems;
    
    public ShoppingCart() {
        cartItems=new ArrayList<>();
    }
    public void addProduct(Product p){
        cartItems.add(p);
    }
    public void show(){
        DecimalFormat formato=new DecimalFormat("#.##");
        System.out.println("******Elementos del carrito******");
        double totalPrice=0;
         for (Product p : cartItems) {
            System.out.println(p.getName()+": "+p.getPrice()); 
            totalPrice+=p.getPrice();
         }
         System.out.println("");
         System.out.println("Precio Total= "+formato.format(totalPrice));
     }
    
    public static void main(String[] args) {
        Product lechuga=new Product("lechuga", 1);
        Product leche=new Product("leche",1.20);
        Product pan=new Product("Pan", 0.60);
        ProductOnSale natillas= new ProductOnSale("Natillas danone pack 4", 2, 10);
        ShoppingCart sc=new ShoppingCart();
        sc.addProduct(lechuga);
        sc.addProduct(leche);
        sc.addProduct(pan);
        sc.addProduct(pan);
        sc.addProduct(natillas);
        sc.show();  

        ShoppingCart sc2=new ShoppingCart();
        sc2.show();
    }
}
