import java.util.Scanner;
import java.util.Arrays;

public class ArraysQ {
    public static void main(String[] args){
        int[] marks = new  int[5];
        Scanner input = new Scanner(System.in);
        for(int i =0; i<marks.length; i++){
            int mark = input.nextInt();
            marks[i] = mark; // taking input for the array

        }
        //displaying the array of marks
        for(int i = 0; i<marks.length; i++){
            // System.out.print("  " + marks[i]);
            System.out.print(Arrays.toString(marks));
        }
    }
}
