/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a message you want to decipher");
		String input = sc.nextLine();
		String output = Cipher.encode(input);
		System.out.println(output);
		
	}

	}

