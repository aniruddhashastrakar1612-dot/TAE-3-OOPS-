abstract class Shape {
    abstract void calculate_area();

    void display_info() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    double radius = 5;

    void calculate_area() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class RectangleShape extends Shape {
    int length = 4, breadth = 6;

    void calculate_area() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Main7 {
    public static void main(String[] args) {
        // Shape s = new Shape(); ❌ ERROR (cannot instantiate abstract class)

        Circle c = new Circle();
        RectangleShape r = new RectangleShape();

        c.display_info();
        c.calculate_area();

        r.display_info();
        r.calculate_area();
    }
}