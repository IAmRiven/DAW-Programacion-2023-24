class House implements Possesion {
    private double price;
    private int yearsOwned;

    public House(double price, int yearsOwned) {
        this.price = price;
        this.yearsOwned = yearsOwned;
    }

    public double getPrice() {
        return price;
    }

    public int getYearsOwned() {
        return yearsOwned;
    }

    @Override
    public double calculateValue() {
        return price + (price * 0.1 * yearsOwned);
    }

    @Override
    public double calculateTax() {
        return calculateValue() * 0.10;
    }
}
