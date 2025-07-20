// import java.util.Scanner;

// public class Functions {
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter the first number: ");
//         int num1 = input.nextInt();
//         System.out.println("Enter the second number: ");
//         int num2 = input.nextInt();
//         int sum  =  add(num1,num2);
//         System.out.println("The sum is: " + sum);
//         int difference = subtract(num1,num2);
//         System.out.println("The sum is: " + difference);

//         input.close();
//     }

//     public static int add(int a, int b){
//         return a+b;
//     }
//     public static int subtract(int a, int b){
//         return a - b;
//     }
// }


// import  java.util.Scanner;

import java.util.Arrays;

public class Functions {

    public static void main(String[] args){
        int[] numbers = {1,5,3,4,2};
        change(numbers);
        System.out.println("The first element is: " + numbers[0]);
         System.out.println("The  element are: " +  (Arrays.toString(numbers)));//convert the array into the string.

   
        for(int i = 0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
    }
    static void change(int[] arr){
        arr[0]=10;
    }
}
