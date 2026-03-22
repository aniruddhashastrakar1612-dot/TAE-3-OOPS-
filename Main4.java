class Resort {
    int RNo, Days;
    String Name;
    float Charges;

    float Compute() {
        float amount = Days * Charges;
        if (amount > 11000)
            amount = amount * 1.02f;
        return amount;
    }

    void Getinfo(int r, String n, float c, int d) {
        RNo = r;
        Name = n;
        Charges = c;
        Days = d;
    }

    void DispInfo() {
        System.out.println("Room No: " + RNo);
        System.out.println("Name: " + Name);
        System.out.println("Charges: " + Charges);
        System.out.println("Days: " + Days);
        System.out.println("Amount: " + Compute());
    }
}

public class Main4 {
    public static void main(String[] args) {
        Resort r = new Resort();
        r.Getinfo(101, "Amit", 2000, 6);
        r.DispInfo();
    }
}