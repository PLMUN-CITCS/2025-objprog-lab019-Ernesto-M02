import java.util.Scanner;

public class FactorialCalculator {

    // Method to get a valid non-negative integer input from the user
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int userInput = -1; 
        boolean validInput = false;

        // Loop until a valid non-negative integer is entered
        while (!validInput) {
            System.out.print("Please enter a non-negative integer: ");
            if (scanner.hasNextInt()) {
                userInput = scanner.nextInt();
                if (userInput >= 0) {
                    validInput = true; 
                } else {
                    System.out.println("Error: Input must be a non-negative integer.");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter a valid non-negative integer.");
                scanner.next(); 
            }
        }
        return userInput;
    }

    // Method to calculate the factorial of a non-negative integer
    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; 
        }
        
        long factorial = 1; 
        for (int i = 1; i <= n; i++) {
            factorial *= i; 
        }
        return factorial;
    }

    // Main method to run the program
    public static void main(String[] args){
        int number = getNonNegativeInteger();
        long factorial = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}