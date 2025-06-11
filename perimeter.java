import java.util.*;

public class perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        int l = sc.nextInt();
        System.out.println("Enter the breadth of rectangle: ");
        int b = sc.nextInt();

        System.out.println("Perimeter of rectangle is: ");
        perimeterofrectangle(l, b);

    }

    public static void perimeterofrectangle(int l, int b) {
        int p = 2 * (l + b);
        System.out.println(p);
    }
}
