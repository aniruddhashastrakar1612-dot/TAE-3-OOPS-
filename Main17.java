class Employee17 {
    String name;
    int id;
    static int employeeCount = 0;

    Employee17(String n, int i) {
        name = n;
        id = i;
        employeeCount++;
    }

    String getInfo() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }

    static void showCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

public class Main17 {
    public static void main(String[] args) {
        Employee17 e1 = new Employee17("Amit", 1);
        Employee17 e2 = new Employee17("Ravi", 2);
        Employee17 e3 = new Employee17("Neha", 3);

        System.out.println(e1.getInfo());
        System.out.println(e2.getInfo());
        System.out.println(e3.getInfo());

        Employee17.showCount();
    }
}