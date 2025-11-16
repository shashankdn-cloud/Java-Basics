import java.util.Scanner;

public class  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int b = scanner.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = 0;
        int remainder = 0;

        if (b != 0) {
            quotient = a / b;
            remainder = a % b;
        } else {
            System.out.println("Division or modulus by zero is not allowed.");
        }

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        if (b != 0) {
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        }
    }
}
