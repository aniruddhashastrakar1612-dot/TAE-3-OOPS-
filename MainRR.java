class RailwayReservation {
    int seats = 1;

    synchronized void bookTicket() {
        if (seats > 0) {
            System.out.println("Ticket booked successfully");
            seats--;
        } else {
            System.out.println("No tickets available");
        }
    }
}

class MyThread extends Thread {
    RailwayReservation r;

    MyThread(RailwayReservation r) {
        this.r = r;
    }

    public void run() {
        r.bookTicket();
    }
}

public class MainRR {
    public static void main(String[] args) {
        RailwayReservation r = new RailwayReservation();

        MyThread t1 = new MyThread(r);
        MyThread t2 = new MyThread(r);

        t1.start();
        t2.start();
    }
}