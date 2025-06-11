import java.util.*;

public class AreaOfcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        double radius = sc.nextDouble();
        area(radius);
    }

    public static void area(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle is " + area);
    }
}
