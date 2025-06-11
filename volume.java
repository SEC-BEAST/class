import java.util.*;

public class volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of cylinder");
        double r = sc.nextDouble();
        System.out.println("enter the height of cylinder");
        double h = sc.nextDouble();
        System.out.println("volume of cylinder is :");
        volumeofcylinder(r, h);

    }

    public static void volumeofcylinder(double r, double h) {
        double volume = 3.14 * r * r * h;
        System.out.println(volume);
    }
}
