import java.util.Scanner;

/**
 * @author Khoand - B19DCVT208
 */
class Date {
    private short day, month, year;
    public static int number_of_date;

    public Date(short day, short month, short year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date() {
        this((short) 1, (short) 1, (short) 2023);
    }

    @Override
    public String toString() {
        return String.format("%02d", day) + "/" + String.format("%02d", month) + "/"+ String.format("%4d", year);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
            sc.nextLine();

        while (testCase-- > 0) {
            String[] inputs = sc.nextLine().trim().split("\\s+");

            switch (inputs[0].toUpperCase()) {
                case "C":
                    Date date = new Date();
                    System.out.println(date + " " + Date.number_of_date);
                    break;
                default:
                    short day = Short.parseShort(inputs[0]);
                    short month = Short.parseShort(inputs[1]);
                    short year = Short.parseShort(inputs[2]);

                    if (day == 5 || day == 20) {
                        Date.number_of_date++;
                    }
                    Date date1 = new Date(day, month, year);
                    System.out.println(date1 + " " + Date.number_of_date);
                    break;
            }
        }
    }
}
