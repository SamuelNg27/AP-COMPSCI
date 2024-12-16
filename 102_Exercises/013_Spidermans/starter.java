/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman guy = new Spiderman("Tobey Maguire", 48, "Green Goblin");
		Spiderman guy2 = new Spiderman("Andrew Garfield", 40, "Electro");
		Spiderman guy3 = new Spiderman("Tom Holland", 27, "The Vulture");
		System.out.println(guy.getActor());
		System.out.println(guy.getAge());
		System.out.println(guy.getVillain());
		System.out.println(guy2.getActor());
		System.out.println(guy2.getAge());
		System.out.println(guy2.getVillain());
		System.out.println(guy3.getActor());
		System.out.println(guy3.getAge());
		System.out.println(guy3.getVillain());
	}
}
