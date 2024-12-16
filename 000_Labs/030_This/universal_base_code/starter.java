/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}
	public static int randomAge(){
		int random = (int)(Math.random()*10);
		return random;
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf test = new PooleDwarf();
        PooleDwarf guy1 = new PooleDwarf(randName(), randomAge());
        PooleDwarf guy2 = new PooleDwarf(randName(), randomAge());
        PooleDwarf guy3 = new PooleDwarf(randName(), randomAge());
        PooleDwarf guy4 = new PooleDwarf(randName(), randomAge());
        PooleDwarf guy5 = new PooleDwarf(randName(), randomAge());
        PooleDwarf guy6 = new PooleDwarf(randName(), randomAge());
        PooleDwarf guy7 = new PooleDwarf(randName(), randomAge());

        int duplicate = 0;
        if (guy2.isSameName(guy1.getName())) {
            duplicate++;
        }
        if (guy3.isSameName(guy1.getName())) {
            duplicate++;
        }
        if (guy4.isSameName(guy1.getName())) {
            duplicate++;
        }
        if (guy5.isSameName(guy1.getName())) {
            duplicate++;
        }
        if (guy6.isSameName(guy1.getName())) {
            duplicate++;
        }
        if (guy7.isSameName(guy1.getName())) {
            duplicate++;
        }
        System.out.println(guy1.getName()+" was the name with " + duplicate + " matches!");
    }
}
