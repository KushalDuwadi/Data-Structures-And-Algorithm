import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);

        //if conditional
        int number = input.nextInt();
        if(number>0){
            System.out.println("Number is positive");
        }

        //if-else conditional
        if(number<0){
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is positive");
        }

        //if-else if-else conditional
        if(number>0){
            System.out.println("Number is positive");
        }else if(number<0){
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is zero");
            input.close();

    }
    //Loops in java................................

    //while loop
    int number1 = 1;
    while(number1<=5)
    {
        System.out.println("Number is " + number1);
        number1++;
    }

    //do-while loop



        Scanner input1 = new Scanner(System.in);
        String password ;

        do {
            System.out.print("Enter password: ");
            password = input1.nextLine();
        } while (!password.equals("secret"));

        System.out.println("Access granted!");
     
        input1.close();
    
      }
}

