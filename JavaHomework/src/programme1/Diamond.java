package programme1;

import java.util.Scanner;

/* Write a program in Java to display the pattern like a diamond.
While loop */
public class Diamond {
    public static void main(String[] args) {
        int i,j,r;  // r is number of row

        System.out.print("Input number of row: ");
        Scanner in = new Scanner(System.in);
        r = in.nextInt();

        for(i=0; i<=r; i++) {
            for(j=1; j<=r-i ;j++) {
                System.out.print(" ");
            }
            for(j=1; j<=2*i-1 ;j++)
                System.out.print("*");
            System.out.println(" ");
        }

        for(i=r-1; i>=1; i--) {
            for(j=1; j<=r-i; j++) {
                System.out.print(" ");
            }
            for(j=1; j<=2*i-1; j++){
                System.out.print("*");}
            System.out.println(" ");
        }

    }

}
