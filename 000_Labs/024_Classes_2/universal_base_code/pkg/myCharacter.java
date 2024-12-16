/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	//global variables
	int strength;
	int dexterity;
	int intelligence;
	int constitution;
	int charisma;
	String role;
//constructors
	public myCharacter() {
		role = "Wizard";
		strength = 5;
		dexterity = 5;
		intelligence = 5;
		constitution = 5;
		charisma = 5;
	}

//method
	public String getRole(){
		return role;
	}
	
	public int getStrength(){
		return strength;
	}
	
	public int getDexterity(){
		return dexterity;
	}
	
	public int getIntelligence(){
		return intelligence;
	}
	public int getConstitution(){
		return constitution;
	}
	public int getCharisma(){
		return charisma;
	}
	

}

