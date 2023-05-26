import java.util.Scanner;

/**
 * @author Khoand - B19DCVT208
 */
class Swap {
    private int x;
    private int y;

    public Swap(int x, int y) {
        int temp = x;
        this.x = y;
        this.y = temp;
    }

    public String toString() {
        return x + " " + y;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        sc.nextLine();

        while (testCase-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            Swap swap = new Swap(x, y);

            System.out.println(swap);
        }
    }
}