import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
           
            System.out.print("Enter the first number: ");
            int a = Integer.parseInt(scanner.nextLine());

            
            System.out.print("Enter the second number: ");
            int b = Integer.parseInt(scanner.nextLine());

            int sum = a + b;
            int diff = a - b;
            int prod = a * b;

            System.out.println("Sum = " + sum);
            System.out.println("Difference = " + diff);
            System.out.println("Product = " + prod);
  
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero. Please provide a non-zero second number.");
            }

            int quo = a / b;
            int rem = a % b;

            
            System.out.println("Quotient = " + quo);
            System.out.println("Remainder = " + rem);

            } 
           
            catch (Exception e)
            {
            System.out.println("Error: " + e.getMessage());
            } 
            finally
            {
            scanner.close(); // Close the scanner to avoid resource leaks
            }
    }
}
