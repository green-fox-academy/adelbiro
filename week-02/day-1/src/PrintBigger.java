import java.util.Scanner;

// Write a program that asks for two numbers and prints the bigger one
public class PrintBigger {
    public static void main(String[] args) {
        Scanner getNumbers = new Scanner(System.in);
        System.out.println("Tell me the number");
        int number1 = getNumbers.nextInt();
        System.out.println("Tell me the other number");
        int number2 = getNumbers.nextInt();
        int biggerOne;
        if (number1 > number2){
            biggerOne = number1;
        } else {
            biggerOne = number2;
        }
        System.out.println(biggerOne);

    }
}
