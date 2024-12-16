/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String input = sc.nextLine();
		
		System.out.println("letter by letter");
		for(int i = 0; i < input.length(); i++){
			String x = input.substring(i,i+1);
			System.out.println(i+" "+x);
		}
		


		
	}
}
