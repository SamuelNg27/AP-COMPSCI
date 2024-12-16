/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	int strength;
	int dexterity;
	int intelligence;
	int constitution;
	int charisma;
	String role;

	public myCharacter() {
		role = "No Role";
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		constitution = 0;
		charisma = 0;
	}
	public myCharacter(String a){
		if(a.equals("wizard")||a.equals("Wizard")){
		role = "Wizard";
		}
		if(a.equals("rogue")||a.equals("Rouge")){
		role = "rogue";
		}
		if(a.equals("warrior")||a.equals("Warrrior")){
		role = "warrior";
		}
		else{
			role = "no role";
		}
	}
	
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

