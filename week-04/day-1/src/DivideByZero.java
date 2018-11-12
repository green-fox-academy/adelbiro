import java.util.ArrayList;
import java.util.Scanner;

public class DivideByZero {
    public static void dividerFunction(int input) {
        try {
            double output = 10/input;
            System.out.println(output);
        }
        catch (ArithmeticException e) {
            System.out.println("fail");
        }
    }
    public static void main(String[] args) {
        dividerFunction(0);
    }
}
