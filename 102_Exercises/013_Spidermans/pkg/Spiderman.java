package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String Actor;		// What's the actors name?
	int Age;			// What's the age of the actor?
	String Villain;		// Who's the arch nemesis of this Spiderman?

	public Spiderman(){
		 Actor = "Unknown";
		 Age = 0;
		 Villain = "Unknown";
	}
	public Spiderman(String Actor){
		this.Actor = Actor;
		Age = 0;
		Villain = "Unknown";
	}
	public Spiderman(int Age){
		this.Age = Age;
		Actor = "Unknown";
		Villain = "Unknown";
	}
	public Spiderman(String Actor, int Age){
		this.Actor = Actor;
		this.Age = Age;
		Villain = "Unknown";
	}
	public Spiderman(String Actor, int Age, String Villain){
		this.Actor = Actor;
		this.Age = Age;
		this.Villain = Villain;
	}
	// String Actor constructor! 			Age - 0, Villain Unknown 
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	// String Actor, int Age constructor! 	Villain Unknown
	// String Actor, int Age, String Villain constructor!		
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	
	public void setActor(String Actor){
		this.Actor = Actor;
	}
	public void setAge(int Age){
		this.Age = Age;
	}
	public void setVillain(String Villain){
		this.Villain = Villain;
	}
	public String getActor(){
		return Actor;
	}
	public int getAge(){
		return Age;
	}
	public String getVillain(){
		return Villain;
	}
	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + Villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
