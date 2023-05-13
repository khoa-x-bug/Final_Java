import java.util.Scanner;

/**
 * @author Khoand - B19DCVT208
 */
class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(Double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public Circle(Double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
        return radius + " " + color;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        while (testCase-- > 0) {
            double radius = sc.nextDouble();
            String color = sc.nextLine().trim();

            if (radius == -1) {
                Circle circle = new Circle();
                System.out.println(circle);
            } else if (color.isEmpty()) {
                Circle circle = new Circle(radius);
                System.out.println(circle);
            } else {
                Circle circle = new Circle(radius, color);
                System.out.println(circle);
            }

        }
    }

}