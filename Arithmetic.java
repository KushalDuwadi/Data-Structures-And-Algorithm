import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args){
        System.out.println("Enter The First Number");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Enter The Second Number");
        int secondNumber = scanner.nextInt();

        //sum of two numbers
        System.out.println("The Sum of "+ firstNumber +" and "+ secondNumber + " is " + (firstNumber + secondNumber));
        //Diffrence of two numbers
        System.out.println("The Difference is: " + (firstNumber - secondNumber));
        //Product of two numbers
        System.out.println("The Product is: " + (firstNumber * secondNumber));
        //Division of two numbers
        if (secondNumber != 0) {
            System.out.println("The Division is: " + (firstNumber / secondNumber));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
        //Modulus of two numbers
        if (secondNumber != 0) {
            System.out.println("The Modulus is: " + (firstNumber % secondNumber));
        } else {
            System.out.println("Modulus by zero is not allowed.");
        }


        scanner.close();
    }
    
}
