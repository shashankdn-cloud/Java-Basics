import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int b = scanner.nextInt();

        int andResult = a & b;
        int orResult = a | b;
        int xorResult = a ^ b;

        System.out.println("Bitwise AND (&): " + andResult + " (Binary: " + Integer.toBinaryString(andResult) + ")");
        System.out.println("Bitwise OR  (|): " + orResult + " (Binary: " + Integer.toBinaryString(orResult) + ")");
        System.out.println("Bitwise XOR (^): " + xorResult + " (Binary: " + Integer.toBinaryString(xorResult) + ")");
    }
}
