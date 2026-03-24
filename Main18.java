class Bank18 {
    final double interestRate = 5.0;

    double calculateInterest(double amount) {
        return (amount * interestRate) / 100;
    }
}

public class Main18 {
    public static void main(String[] args) {
        Bank18 b = new Bank18();

        System.out.println("Interest on 10000: " + b.calculateInterest(10000));
        System.out.println("Interest on 20000: " + b.calculateInterest(20000));
    }
}