import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Khoand - B19DCVT208
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while (testCase -- > 0) {
            BigInteger a = sc.nextBigInteger();
            String cal = sc.next();
            BigInteger b = sc.nextBigInteger();

            switch (cal) {
                case "+":
                    System.out.println(a.add(b));
                    break;
                case "-":
                    System.out.println(a.subtract(b));
                    break;
                case "*":
                    System.out.println(a.multiply(b));
                    break;
            }
        }
    }
}