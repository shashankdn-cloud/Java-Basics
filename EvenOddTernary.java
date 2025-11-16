import java.util.Scanner;

public class EvenOddTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        String result = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println(num + " is " + result + ".");
    }
}