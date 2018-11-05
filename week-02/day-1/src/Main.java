import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            // The pyramid should have as many lines as the number was

                Scanner sc = new Scanner(System.in);
                int lines = sc.nextInt();

                for (int i = 0; i < lines; i++) {
                    for (int j = lines; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k <= i * 2; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }


    }
}
