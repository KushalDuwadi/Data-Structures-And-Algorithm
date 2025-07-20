import java.util.Scanner;

// This program checks if a given number is a palindrome or not.

// public class Practice {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter a number to check if it palindrome number or not: ");
//         int number = input.nextInt();
//         int temp  = number;
//         int reverse  = 0;

//         while(number>0){
//             int digit = number % 10;
//             reverse = reverse*10 + digit; 
//              number = number/10;
 

//         }
//           System.out.println("Reverse: " + reverse);
//           if(temp==reverse){
//                 System.out.println("The number is a palindrome number.");
//             } else {
//                 System.out.println("The number is not a palindrome number.");
//           }

//           input.close();
      
//     }
// }



//2. This program check if the given number is armstrong number is not.




public class Practice{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check if the number is an armstrong number or not: ");
        int number = input.nextInt();
        System.out.println("The number you have entered is "+ number);
        int temp = number;     
        int sum=0;

        while(number>0){
            int digit = number % 10;
            int power = digit*digit*digit;
            sum = sum + power;
            number = number / 10;
        }
        //checking if the sum and temp are equal or not.
        if(temp==sum){
            System.out.println("The number is an armstrong number.");
        } else {
            System.out.println("The number is not an armstrong number.");
        }

        input.close();
      

    }
}