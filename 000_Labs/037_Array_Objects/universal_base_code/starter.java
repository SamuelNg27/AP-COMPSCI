/*
 *	Author:  
 *  Date: 
*/


import pkg.*;
import java.util.*;

class starter {
    public static void main(String args[]) {
        Wizard[] wizards = new Wizard[100];
        Warrior[] warriors = new Warrior[100];
        for (int i = 0; i < 100; i++) {
            wizards[i] = new Wizard();
            warriors[i] = new Warrior();
        }
        int remainingWizards = 100;
        int remainingWarriors = 100;
        int wizardIndex = 0;
        int warriorIndex = 0;
        while (remainingWizards > 0 && remainingWarriors > 0) {
            if (wizardIndex < 100 && !wizards[wizardIndex].isDead()) {
                wizards[wizardIndex].attack(warriors[warriorIndex]);
                if (warriors[warriorIndex].isDead()) {
                    warriorIndex++;  
                    remainingWarriors--; 
                }
            }
            if (warriorIndex < 100 && !warriors[warriorIndex].isDead()) {
                warriors[warriorIndex].attack(wizards[wizardIndex]);
                if (wizards[wizardIndex].isDead()) {
                    wizardIndex++;  
                    remainingWizards--; 
                }
            }
        }
        if (remainingWizards == 0) {
            System.out.println("Warriors won with  " + remainingWarriors + "left in their army");
        } else {
            System.out.println("Wizards won with " + remainingWizards + " left in their army");
        }
    }
}
