/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;

public class BaseClass {
    public String reverseWords(String sentence){
        String reversedSentence = "";
        while(true) {
            if(sentence.indexOf(" ") == -1) {
                reversedSentence = sentence + " " + reversedSentence;
                break;
            }
            int spaceIndex = sentence.indexOf(" ");
            String word = sentence.substring(0, spaceIndex);
            reversedSentence = word + " " + reversedSentence;
            sentence = sentence.substring(spaceIndex + 1);
        }
        if (reversedSentence.substring(0, 1).equals(" ")) {
            reversedSentence = reversedSentence.substring(1);
        }

        return reversedSentence;
    }
}
