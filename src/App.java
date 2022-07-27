import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a letter ('A' to 'D'): ");
        char letter = in.next().charAt(0);
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        String color;
        if (((letter - 'A') + n) % 2 == 0) {
            color = "Black";
        } else {
            color = "White";
        }
        System.out.println();
        System.out.println("The background color is " + color);
    }
}