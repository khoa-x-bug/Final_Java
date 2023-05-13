import java.util.Scanner;

/**
 * @author Khoand - B19DCVT208
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        sc.nextLine();

        while (testCase -- > 0) {
            //Chia dữ liệu đầu vào  thành mảng các chuỗi
            String[] inputs = sc.nextLine().split(" ");
            int countString = inputs.length;
            int countChar = 0;

            for (String input : inputs) {
                countChar += input.length();
            }
            countChar = countChar + countString - 1;
            System.out.println(countChar + " " + countString);
        }
    }
}
