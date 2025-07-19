import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        int first = 0, second = 1 ;
        System.out.println("Enter the number of terms in Fibonacci series:");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        number.close();


        // for(int i = 1;i<=n;i++){
        //     int next = first + second;
        //     System.out.println("Fibonacci number are : " + first);
        //     first = second;
        //     second = next;
        // }
        while(n > 0) {
            System.out.println("Fibonacci number is: " + first);
            int next = first + second;
            first = second;
            second = next;
            n--;
        }
 
    }
    
}
