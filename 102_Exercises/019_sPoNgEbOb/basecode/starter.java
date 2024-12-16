/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a word or phrase:");
	String input = sc.nextLine();
	
	System.out.println("Your new sentence is:");
	
	for(int i = 0; i < input.length(); i++){
		
		String Letter = input.substring(i,i+1);
		
		if(i %2 == 1){
			String Upper = Letter.toUpperCase();
			System.out.print(Upper);
		}
		if(i%2 == 0){
			String lower = Letter.toLowerCase();
			System.out.print(lower);
		}
	}
	
	}
}
