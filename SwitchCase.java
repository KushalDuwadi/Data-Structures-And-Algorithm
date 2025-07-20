import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args){
        System.out.println("Switch Case Example ");
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7: ");
        int day = input.nextInt();
        switch(day){
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;  
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
                break;
        }


        input.close();
    }



}
