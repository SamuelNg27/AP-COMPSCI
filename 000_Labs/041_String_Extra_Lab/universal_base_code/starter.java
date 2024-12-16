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
        System.out.println("Enter a phrase:");
        String inputPhrase = sc.nextLine();
        System.out.println("Original Phrase: " + inputPhrase);
        String reversedPhrase = test.reverseWords(inputPhrase);
        System.out.println("Reversed Phrase: " + reversedPhrase);
    }
}
