/**
 * @author Khoand - B19DCVT208
 */
class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public Double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getRadius() + " " + circle.getColor());
        System.out.println(circle.getArea());
    }
}