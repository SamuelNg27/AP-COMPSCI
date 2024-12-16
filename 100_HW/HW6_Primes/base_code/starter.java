
import java.util.Scanner;

public class starter{
    public static boolean checkPrime(int num) {
        if (num < 2) {
            return false;
        }
        int divisor = 2;
        while (divisor <= Math.sqrt(num)) {
            if (num % divisor == 0) {
                return false;
            }
            divisor++;
        }
        return true;
    }
    public static void printPrimes(int max) {
        int number = 2;
        while (number < max) {
            if (checkPrime(number)) {
                System.out.println(number);
            }
            number++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = sc.nextInt();
        System.out.println("Prime numbers less than "+ input + ":");
        printPrimes(input);
    }
}


