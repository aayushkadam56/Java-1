class MovieTicket {

    double seatPrice = 250;
    int availableSeats = 50;

    void display() {
        System.out.println("Seat Price = ₹" + seatPrice);
        System.out.println("Available Seats = " + availableSeats);
    }
}

public class MovieTicketDemo {

    public static void main(String[] args) {

        MovieTicket ticket = new MovieTicket();

        ticket.display();
    }
}