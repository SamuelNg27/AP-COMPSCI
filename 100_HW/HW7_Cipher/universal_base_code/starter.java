/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static String encode(String x){
		return 	Cipher.encode(x);
	}
	public static String keyedEncode(String x, int y){
		return Cipher.keyedEncode(x,y);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		System.out.println("Please enter a message you want to encode:");
        String input = sc.nextLine();
        System.out.println("Encoded message: " + encode(input));
        System.out.println("Please enter a message you want to encode with a key:");
        String keyedInput = sc.nextLine();
        System.out.println("Please enter a key (integer):");
        int key = sc.nextInt();
        System.out.println("Keyed encoded message: " + keyedEncode(keyedInput, key));
        while(counter < 36){
        	System.out.println("Keyed encoded message: " + keyedEncode(keyedInput, key));
        	key++;
        	counter++;
        }
        }
	}
	


