/*
   * Author:
   * Date:
   * Collaborator(s):
*/

import java.util.Scanner;
class starter {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please ente a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("Here's your sentence in Pig Latin!");
        while (true) {
            if (sentence.indexOf(" ") == -1) {
                System.out.print(toPigLatin(sentence));
                break;
            }
            int space = sentence.indexOf(" ");
            String word = sentence.substring(0, space);
            System.out.print(toPigLatin(word) + " ");
            sentence = sentence.substring(space + 1);
        }
        System.out.println();
    }
    public static String toPigLatin(String word) {
        if (word.length() == 0)
        return word; 
        if ("aeiouAEIOU".indexOf(word.substring(0,1)) != -1) {
            return word + "-way";
        }
        int firstVowelIndex = -1;
        for (int i = 0; i < word.length(); i++) {
            if ("aeiouAEIOU".indexOf(word.charAt(i)) != -1) {
                firstVowelIndex = i;
                break;
            }
        }
        if (firstVowelIndex != -1) {
            String consonantCluster = word.substring(0, firstVowelIndex);
            String remainingWord = word.substring(firstVowelIndex);
            return remainingWord + "-" + consonantCluster + "ay";
        }
        return word + "-ay";
    }
}
