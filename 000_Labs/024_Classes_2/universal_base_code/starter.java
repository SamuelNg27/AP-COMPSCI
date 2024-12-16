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
		myCharacter player  = new myCharacter();
		System.out.println("Your role is " +  player.getRole());
		System.out.println("Your strength trait is " + player.getStrength());
		System.out.println("Your dexterity trait is " + player.getDexterity());
		System.out.println("Your intelligence trait is " + player.getIntelligence());
		System.out.println("Your constitution trait is " + player.getConstitution());
		System.out.println("Your charisma trait is " + player.getCharisma());


		
	}
}
