

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
	public String setRole(String x){
		return role;
	}
	
	public int setStrength(int x){
		strength = Math.max(x,0);
		return strength;
	}
	
	public int setDexterity(int x){
		dexterity = Math.max(x,0);
		return dexterity;
	}
	
	public int setIntelligence(int x){
		intelligence = Math.max(x,0);
		return intelligence;
	}
	public int setConstitution(int x){
		constitution = Math.max(x,0);
		return constitution;
	}
	public int setCharisma(int x){
		charisma = Math.max(x,0);
		return charisma;
	}
	 public boolean setAll(String a, int b, int c, int d, int e, int f) {
        setRole(a);
        setStrength(b);
        setDexterity(c);
        setIntelligence(d);
        setConstitution(e);
        setCharisma(f);
        return true;
}
}


