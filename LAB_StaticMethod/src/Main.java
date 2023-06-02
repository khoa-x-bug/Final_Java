import java.util.Scanner;

/**
 * @author Khoand - B19DCVT208
 */
class FlightBooking {
    private String flightId;
    private int userId;
    private static int seatAvailable;

    public FlightBooking(int userId) {
        this.userId = userId;
        flightId = "OOP23";
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public static int getSeatAvailable() {
        return seatAvailable;
    }

    public static void setSeatAvailable(int seatAvailable) {
        FlightBooking.seatAvailable = seatAvailable;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        sc.nextLine();


        while (testCase-- > 0) {
            FlightBooking[] bookings = new FlightBooking[4];

            FlightBooking.setSeatAvailable(180);

            String[] book = sc.nextLine().trim().split("\\s+");

            for (int i = 0; i < book.length - 1; i = i + 2) {
                int user_id = Integer.parseInt(book[i]);


                bookings[user_id] = new FlightBooking(user_id);
                String action = book[i + 1];

                switch(action.toLowerCase()) {
                    case "booking":
                        FlightBooking.setSeatAvailable(FlightBooking.getSeatAvailable() - 1);
                        System.out.printf("[Seat Available: %d]",FlightBooking.getSeatAvailable());
                        break;
                    case "confirmed":
                        System.out.printf("--User %d Confirmed--[Seat Available: %d]", user_id, FlightBooking.getSeatAvailable());
                        break;
                    default:
                        FlightBooking.setSeatAvailable(FlightBooking.getSeatAvailable() + 1);
                        System.out.printf("[Seat Available: %d]", FlightBooking.getSeatAvailable());
                        break;
                }
            }
            System.out.println("");

        }
    }
}