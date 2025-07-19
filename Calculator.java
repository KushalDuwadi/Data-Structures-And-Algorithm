import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the operator");
        char operator = input.next().trim().charAt(0);

          if(operator == 'x' || operator == 'X') {
                break; // Exit the loop if 'x' or 'X' is entered
            }
            else {
                System.out.println("Invalid operator");
            }

        if(operator == '+' || operator == '-' || operator == '*' || operator == '/') {

            //..take input from user
            System.out.println("Enter first number");
            double first = input.nextDouble();
            System.out.println("Enter second number");
            double second = input.nextDouble();

            if (operator=='+') {
                System.out.println("Result is " + (first + second));
                
            }
            else if (operator=='-') {
                System.out.println("Result is " + (first - second));
                
            }
            else if (operator=='*') {
                System.out.println("Result is " + (first * second));
                
            }
            else if (operator=='/') {
                if(second != 0) {
                    System.out.println("Result is " + (first / second));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                
            }
           
          
        }
        
    }
    input.close();
        
    }
}
