package Compra;

public class ProductOnSale extends Product {
    private double discount;

    public ProductOnSale(String name, double price, int discount) {
        super(name, price);
        this.discount = discount;
    }

    public double getPrice() {
        return (super.getPrice() - (super.getPrice() * (discount / 100)));

    }

}
