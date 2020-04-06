import java.util.Scanner;

public class displayStar {
    public static void main(String args[]) {
        int i, j;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input a number of starts, n = ");
        int n = keyboard.nextInt();
        System.out.println("You type " + n);
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - 1 - i; j++)
                System.out.print(" ");
            for (j = n - i; j <= n + i; j++)
                System.out.print("*");
            System.out.print("\n");
        }
        System.exit(0);
    }
}