class Employee20 {
    String name;
    double salary;

    // Constructor using this keyword
    Employee20(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class Main20 {
    public static void main(String[] args) {

        Employee20 e1 = new Employee20("Amit", 50000);
        Employee20 e2 = new Employee20("Neha", 60000);

        e1.display();
        e2.display();
    }
}