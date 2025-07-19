import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args){
        System.out.println("Enter The First Number");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Enter The Second Number");
        int secondNumber = scanner.nextInt();

        System.out.println("The Sum of "+ firstNumber +" and "+ secondNumber + " is " + (firstNumber + secondNumber));
        System.out.println("The Difference is: " + (firstNumber - secondNumber));
    }
    
}
