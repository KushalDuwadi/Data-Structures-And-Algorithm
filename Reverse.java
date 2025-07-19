public class Reverse {
    public  static void main(String[] args){
        int number = 123456;
        int reversed  = 0;

        // Reversing the number using a for loop
        
        for(int i = 0; i < 6; i++) {
            // Reversing the number by extracting the last digit and building the reversed number
            int lastdigit = number % 10;
            reversed = reversed * 10 + lastdigit;
            number = number / 10;

        }
        // Printing the reversed number using while loop

        while (number>0) {
            int lastdigit = number % 10;
            reversed = reversed * 10 + lastdigit;
            number = number / 10;
            
        }
        System.out.println("Reversed number after  iteration: " + reversed);;

        
    }
}
