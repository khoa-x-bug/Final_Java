import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        sc.nextLine();

        while (testCase-- > 0) {
            String[] inputs = sc.nextLine().trim().split("\\s+");
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