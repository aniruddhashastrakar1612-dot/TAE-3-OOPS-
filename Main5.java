class Employee {
    int empno;
    String ename;
    float basic, hra, da, netpay;

    float Calculate() {
        return basic + hra + da;
    }

    void havedata(int no, String name, float b, float h, float d) {
        empno = no;
        ename = name;
        basic = b;
        hra = h;
        da = d;
        netpay = Calculate();
    }

    void dispdata() {
        System.out.println("Emp No: " + empno);
        System.out.println("Name: " + ename);
        System.out.println("Net Pay: " + netpay);
    }
}

public class Main5 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.havedata(1, "Ravi", 10000, 2000, 1500);
        e.dispdata();
    }
}