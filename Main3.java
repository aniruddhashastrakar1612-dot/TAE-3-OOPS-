class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;

    void GetCar(int id, String type) {
        CarId = id;
        CarType = type;
    }

    float GetRent() {
        if (CarType.equals("Small"))
            Rent = 1000;
        else if (CarType.equals("Van"))
            Rent = 800;
        else if (CarType.equals("SUV"))
            Rent = 2500;

        return Rent;
    }

    void ShowCar() {
        System.out.println("Car ID: " + CarId);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + GetRent());
    }
}

public class Main3 {
    public static void main(String[] args) {
        CARRENTAL c = new CARRENTAL();
        c.GetCar(1, "SUV");
        c.ShowCar();
    }
}