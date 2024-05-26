
// BankAccount.java
public class BankAccount implements Possesion {
    private double money;

    public BankAccount(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    @Override
    public double calculateValue() {
        return money;
    }

    @Override
    public double calculateTax() {
        return 0;
    }
}
