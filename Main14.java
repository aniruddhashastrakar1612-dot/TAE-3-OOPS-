class Person14 {
    void role() {
        System.out.println("I am a person");
    }
}

class Employee14 extends Person14 {
    void role() {
        System.out.println("I am an employee");
    }
}

class Manager14 extends Employee14 {
    void role() {
        System.out.println("I am a manager");
    }
}

public class Main14 {
    public static void main(String[] args) {
        Person14 p;

        p = new Person14();
        p.role();

        p = new Employee14();
        p.role();

        p = new Manager14();
        p.role();
    }
}