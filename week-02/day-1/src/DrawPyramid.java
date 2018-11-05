import java.util.Scanner;

public class DrawPyramid {
// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number:");
        int number = input.nextInt();
        String star = "*";
        String space = "/ ";

        for (int i = 0; i < number; i++) {
            for (int k = 1; k <= number - 2; k++) {
                System.out.print(space);
            }
            for (double j = 0; j < (number /2 ) - 1; j++) {
                System.out.print(star);
            }
            System.out.println();
        }

    }
}
