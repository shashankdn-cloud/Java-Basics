public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read user input as integer
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        sc.close(); // Close Scanner (good practice)
    }
}
