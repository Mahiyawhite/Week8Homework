package programme1;

import java.util.Scanner;

/* -Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge. */
public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
        int i = 1;
        int min = 0;
        int max = 0;
        boolean first = true;

        while (true) {
            System.out.println("Enter number: " + i++);
            boolean Int = scan.hasNextInt();

            if (Int) {
                int number = scan.nextInt();

                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }

                if (number < min) {
                    min = number;
                }

                if (number > max) {
                    max = number;
                }
            } else {
                break;
            }
                scan.nextLine();
            }

            System.out.println("Minimum number entered: " + min);
            System.out.println("Maximum number entered: " + max);
            scan.close();
        }

}
