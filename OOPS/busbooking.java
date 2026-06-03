package OOPS;

class Ticket {
    String passengerName;
    String contact;
    int ticketno;

    Ticket(String passengerName, String contact, int ticketno) {
        this.passengerName = passengerName;
        this.contact = contact;
        this.ticketno = ticketno;
    }

    void generateTicket() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Contact: " + contact);
        System.out.println("Ticket No: " + ticketno);
    }
}

class BusTicket extends Ticket {
    String boardingPoint;

    BusTicket(String passengerName, String contact, int ticketno, String boardingPoint) {
        super(passengerName, contact, ticketno);
        this.boardingPoint = boardingPoint;
    }

    @Override
    void generateTicket() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Contact: " + contact);
        System.out.println("Ticket No: " + ticketno);
        System.out.println("Boarding Point: " + boardingPoint);
    }
}

class TrainTicket extends Ticket {
    String coachType;

    TrainTicket(String passengerName, String contact, int ticketno, String coachType) {
        super(passengerName, contact, ticketno);
        this.coachType = coachType;
    }

    @Override
    void generateTicket() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Contact: " + contact);
        System.out.println("Ticket No: " + ticketno);
        System.out.println("Coach Type: " + coachType);
    }
}

public class busbooking {
    public static void main(String[] args) {

        BusTicket busTicket = new BusTicket(
                "John Doe", "1234567890", 101, "City A");
        busTicket.generateTicket();

        System.out.println();

        TrainTicket train = new TrainTicket(
                "Jane Doe", "0987654321", 202, "Sleeper");
        train.generateTicket();

        System.out.println();

        Ticket[] tickets = {
                new BusTicket("John Doe", "1234567890", 101, "City A"),
                new TrainTicket("Jane Doe", "0987654321", 202, "Sleeper")
        };

        for (Ticket t : tickets) {
            t.generateTicket();
            System.out.println();
        }
    }
}