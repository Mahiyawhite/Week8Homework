package programme1;
/* Write a program in Java to display the pattern like a triangle with a number.
For eg.
Input number of rows: 10 */

import java.util.Scanner;

public class TriangleNumber {
    public static void main(String[] args) {
        int x,y;
        Scanner scan = new Scanner(System.in);

        System.out.print("Number of rows Enter : ");
        int r = scan.nextInt();

        for (x = 1; x <= r; x++) {
            for ( y = 1; y <= x; y++) {
                System.out.print(y);
            }
            System.out.println();
        }
      }
    }

