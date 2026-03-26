class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class MainF {
    public static void main(String[] args) {
        Student s = new Student(1, "Aniruddha");

        System.out.println(s);   // Calls toString()
    }
}
