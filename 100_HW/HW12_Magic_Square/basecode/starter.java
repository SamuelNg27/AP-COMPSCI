import pkg.*;
import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of special squares to find: ");
        int n = sc.nextInt();
        CVMath.specialSquare(n);
	}
}
