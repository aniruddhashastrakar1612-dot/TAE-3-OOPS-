class BankingSystem {
    int balance = 5000;

    void withdraw(int amount) {
        synchronized (this) {
            if (balance >= amount) {
                System.out.println("Withdrawing " + amount);
                balance -= amount;
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }
}

class User extends Thread {
    BankingSystem b;

    User(BankingSystem b) { this.b = b; }

    public void run() {
        b.withdraw(3000);
    }
}

public class MainBS {
    public static void main(String[] args) {
        BankingSystem b = new BankingSystem();

        User u1 = new User(b);
        User u2 = new User(b);

        u1.start();
        u2.start();
    }
}