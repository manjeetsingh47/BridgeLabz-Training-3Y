package workshop_28_8_25;

import java.util.Scanner;

public class CinemaSeatAllocation {
    static final int ROWS = 5;
    static final int SEATS_PER_ROW = 10;
    static int[][] cinema = new int[ROWS][SEATS_PER_ROW];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(" WELCOME TO CINEMA SEAT");

        while (true) {
            System.out.print("\nEnter number of seats needed (Enter 0 to exit): ");
            int seats = sc.nextInt();

            if (seats == 0) {
                System.out.println("Exiting... Thank you!");
                break;
            }

            if (seats < 1 || seats > SEATS_PER_ROW) {
                System.out.println(" Invalid number of seats. Must be between 1 and " + SEATS_PER_ROW);
                continue;
            }

            boolean booked = bookSeats(seats);

            if (booked) {
                System.out.println(" Seats successfully booked!");
            } else {
                System.out.println(" Not available. Couldn't find " + seats + " adjacent empty seats.");
            }

            displaySeats();
        }
    }

    // Function to find and book adjacent seats
    static boolean bookSeats(int numSeats) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j <= SEATS_PER_ROW - numSeats; j++) {
                boolean found = true;

                for (int k = 0; k < numSeats; k++) {
                    if (cinema[i][j + k] == 1) {
                        found = false;
                        break;
                    }
                }

                if (found) {
                    // Book the seats
                    for (int k = 0; k < numSeats; k++) {
                        cinema[i][j + k] = 1;
                    }
                    System.out.println("🎫 Booked in Row " + (i + 1) + ", Seats " + (j + 1) + " to " + (j + numSeats));
                    return true;
                }
            }
        }
        return false; // No available block found
    }

    // Function to display current seat layout
    static void displaySeats() {
        System.out.println("\nCurrent Seat Layout (0 = Empty, 1 = Booked):");
        for (int i = 0; i < ROWS; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < SEATS_PER_ROW; j++) {
                System.out.print(cinema[i][j] + " ");
            }
            System.out.println();
        }
    }
}
