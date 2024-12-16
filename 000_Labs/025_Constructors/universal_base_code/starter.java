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
		Scanner sc = new Scanner(System.in);
		myCharacter player  = new myCharacter();
		System.out.println("Your role is " +  player.getRole());
		System.out.println("Your strength trait is " + player.getStrength());
		System.out.println("Your dexterity trait is " + player.getDexterity());
		System.out.println("Your intelligence trait is " + player.getIntelligence());
		System.out.println("Your constitution trait is " + player.getConstitution());
		System.out.println("Your charisma trait is " + player.getCharisma());
		System.out.println("---------------------------------------");
		System.out.println("what class would you like to be");
		String newplayer2 = sc.nextLine();
		myCharacter newplayer = new myCharacter(newplayer2);
		System.out.println("Your role is " +  newplayer.getRole());
		System.out.println("Your strength trait is " + newplayer.getStrength());
		System.out.println("Your dexterity trait is " + newplayer.getDexterity());
		System.out.println("Your intelligence trait is " + newplayer.getIntelligence());
		System.out.println("Your constitution trait is " + newplayer.getConstitution());
		System.out.println("Your charisma trait is " + newplayer.getCharisma());
		

		
	}
}
