/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
    public static void main(String[] args) {
        Dog firstDog = new Dog("Buddy");
        firstDog.setAge(5);
        Dog secondDog = new Dog("Max", "Bulldog");
        if (firstDog.isSleeping()) {
            System.out.println(firstDog.getName() + " is asleep.");
        } else {
            firstDog.bark();
        }
        if (secondDog.isSleeping()) {
            if (!firstDog.isSleeping()) { 
                firstDog.bark();
                secondDog.bark();
            }
        } else {
            if (!firstDog.isSleeping()) { //
                firstDog.bark();
                secondDog.bark();
            }
        }
    }
}
