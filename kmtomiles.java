import java.util.*;

public class kmtomiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of kilometers: ");
        int a = sc.nextInt();

        System.out.println("The number of miles is: ");
        kmtomiles(a);

    }

    public static void kmtomiles(int a) {
        double c = a * 0.621371;
        System.out.print(c);
    }
}