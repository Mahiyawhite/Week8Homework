package programme1;
/* Display left angle triangle of * using nested for loops
*
* *
* * *
* * * *
* * * * *. */

public class LeftAngleTriangle {
    public static void main(String[] args) {
        int r = 5;

        for (int x = 1; x <= r; x++) {
        for (int y = 1; y <= x; y++) {

            System.out.print("* ");
            }
            System.out.println();
        }
    }
}
