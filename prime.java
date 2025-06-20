import java.util.Scanner;
public class prime {

    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");

        int n = scanner.nextInt(); 
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}