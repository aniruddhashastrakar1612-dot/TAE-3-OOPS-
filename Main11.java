class Shape11 {
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle11 extends Shape11 {
    void area() {
        double r = 5;
        System.out.println("Circle Area: " + (3.14 * r * r));
    }
}

class Rectangle11 extends Shape11 {
    void area() {
        int l = 4, b = 6;
        System.out.println("Rectangle Area: " + (l * b));
    }
}

public class Main11 {
    public static void main(String[] args) {
        Circle11 c = new Circle11();
        Rectangle11 r = new Rectangle11();

        c.display();
        c.area();

        r.display();
        r.area();
    }
}