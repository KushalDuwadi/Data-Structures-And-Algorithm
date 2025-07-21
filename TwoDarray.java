import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        int [][] marks = new int [3][4];


        Scanner input = new Scanner(System.in);
        //taking a input for a row..
        System.out.println("Enter the marks for 3 rows and 4 columns:");
        for(int row = 0; row<marks.length; row++){ //marks.length = 3
            // taking input for the column

            for(int col = 0;col<marks[row].length; col++){//marks[row].length = 4
                marks[row][col] = input.nextInt();
            }
        }
        System.out.println("The marks are: ");
        //displaying the array of marks
        for(int row = 0; row<marks.length; row++){
            for(int col = 0; col<marks[row].length; col++){
                System.out.print(marks[row][col] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
