import java.util.Scanner;

class MakeString {
    private int x;
    private Integer y;

    public MakeString(int x, Integer obj) {
        this.x = x;
        this.y = obj;
    }

    public String toString() {
        return "int i: " + x + ", object iObj: " + y;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        sc.nextLine();

        while (testCase-- > 0) {
            int x = sc.nextInt();
            Integer obj = x;

            MakeString makeString = new MakeString(x, obj);
            System.out.println(makeString);
        }
    }
}