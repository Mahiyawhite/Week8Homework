package programme1;
/* Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
Input an alphabet: p
Expected Output:
Input letter is Consonant */

import java.util.Scanner;

    public class Vowel {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Character ");
            char ch = scan.next().charAt(0);

            if (Character.isLetter(ch)) {
                switch (ch) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        System.out.println(ch + " is a vowel.");
                        break;
                    default:
                        System.out.println(ch + " is a consonant.");
                }
            } else {
                System.out.println("Error: Please enter a valid alphabet.");
            }
        }
    }


