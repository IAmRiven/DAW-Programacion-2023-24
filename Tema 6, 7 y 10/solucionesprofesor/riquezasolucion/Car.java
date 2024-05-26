class Car implements Possesion {
    private double price;
    private int kilometersDriven;

    public Car(double price, int kilometersDriven) {
        this.price = price;
        this.kilometersDriven = kilometersDriven;
    }

    public double getPrice() {
        return price;
    }

    public int getKilometersDriven() {
        return kilometersDriven;
    }

    @Override
    public double calculateValue() {
        if (kilometersDriven < 100000) {
            return price - (price * 0.1 * (kilometersDriven / 10000));
        } else {
            return 0;
        }

    }

    @Override
    public double calculateTax() {
        double value = calculateValue();
        return value * 0.1;
    }
}
