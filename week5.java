import java.util.InputMismatchException;
import java.util.Scanner;

class SeatAlreadyBookedException extends Exception {
    SeatAlreadyBookedException(String message) {
        super(message);
    }
}

class Reservation {
    private static final int TOTAL_SEATS = 10;
    private boolean[] booked = new boolean[TOTAL_SEATS + 1];
    private String[] passengerNames = new String[TOTAL_SEATS + 1];

    void reserveSeat(String passengerName, int seatNo) throws SeatAlreadyBookedException {
        if (passengerName == null || passengerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Passenger name cannot be empty");
        }
        if (seatNo < 1 || seatNo > TOTAL_SEATS) {
            throw new IllegalArgumentException(
                "Invalid seat number " + seatNo + ". Choose between 1 and " + TOTAL_SEATS);
        }
        if (booked[seatNo]) {
            throw new SeatAlreadyBookedException(
                "Seat " + seatNo + " is already booked by " + passengerNames[seatNo]);
        }
        booked[seatNo] = true;
        passengerNames[seatNo] = passengerName.trim();
        System.out.println("Seat " + seatNo + " reserved successfully for " + passengerNames[seatNo]);
    }

    void displaySeats() {
        System.out.println("\n-- Seat Status --");
        for (int i = 1; i <= TOTAL_SEATS; i++) {
            if (booked[i])
                System.out.println("Seat " + i + " : Booked by " + passengerNames[i]);
            else
                System.out.println("Seat " + i + " : Available");
        }
        System.out.println();
    }
}

public class RailwayApp {
    public static void main(String[] args) {
        Reservation res = new Reservation();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n-- Railway Reservation --");
            System.out.println("1. Reserve a seat");
            System.out.println("2. Display seats");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        sc.nextLine();
                        System.out.print("Enter passenger name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter seat number: ");
                        int seatNo = sc.nextInt();
                        res.reserveSeat(name, seatNo);
                        break;
                    case 2:
                        res.displaySeats();
                        break;
                    case 3:
                        System.out.println("Exiting");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice !");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid integer");
                sc.next();
            } catch (SeatAlreadyBookedException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Transaction completed.");
            }
        }
        sc.close();
        System.out.println("\nKoushik kalyan N\n1WN25CS112");
    }
}
