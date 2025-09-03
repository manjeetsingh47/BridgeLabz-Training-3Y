package oops.level_2;


class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = null;
        this.price = 0;
    }

    void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        if (seatNumber != null) {
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        } else {
            System.out.println("Ticket not booked yet.");
        }
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Inception");
        ticket.displayTicketDetails();

        ticket.bookTicket("B12", 15.50);
        ticket.displayTicketDetails();
    }
}