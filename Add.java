import java.util.*;

public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        System.out.println("sum is");
        sum(a, b);
    }

    public static void sum(int a, int b) {
        int res = a + b;
        System.out.println(res);
    }
}
