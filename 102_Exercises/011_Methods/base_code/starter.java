/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {
	public static boolean isLeapYear(int x){
		if(x == 2004){
			return true;
		}
		else{
			return false;
		}
	}
	public static int getDigitSum(int x){
		int sum = 0;
		while(x > 0){
			sum += x % 10;
			x /= 10;
		}
		return sum;
	}
	public static void printIfConsecutive(int x,int y, int z){
		if(y == x + 1 && z == y +1){
			System.out.println("These numbers are consecutive!!!");
		}
		else{
			System.out.println("These numbers are not consecutive!!!");
		}
	}
	// The goal of the first method is to give back whether the year given is a leap year or not. 2004 is a leap year.


	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year))
			System.out.println(year + " is a leap year!");
		else
			System.out.println(year + " is not a leap year!");

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		printIfConsecutive(num1, num2, num3);
		System.out.println();
		System.out.println("----------------------------------------");
	}
}
