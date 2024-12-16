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
		int x = 3;
		System.out.println("Your role is " +  player.setRole("No role"));
		System.out.println("Your strength trait is " + player.setStrength(x));
		System.out.println("Your dexterity trait is " + player.setDexterity(x));
		System.out.println("Your intelligence trait is " + player.setIntelligence(x));
		System.out.println("Your constitution trait is " + player.setConstitution(x));
		System.out.println("Your charisma trait is " + player.setCharisma(x));
		System.out.println("---------------------------------------");
		System.out.println("what calss would you like to be");
		String newplayer2 = sc.nextLine();
		myCharacter newplayer = new myCharacter(newplayer2);
		System.out.println("Your role is " +  newplayer.setRole(newplayer2));
		System.out.println("Your strength trait is " + newplayer.setStrength(x));
		System.out.println("Your dexterity trait is " + newplayer.setDexterity(x));
		System.out.println("Your intelligence trait is " + newplayer.setIntelligence(x));
		System.out.println("Your constitution trait is " + newplayer.setConstitution(x));
		System.out.println("Your charisma trait is " + newplayer.setCharisma(x));
	}
}
