// public class Counting {

//1.  Using a for loop and array to count occurrences of a number


//     public static void main(String[] args){
//         int[] numbers = {1, 2, 3, 4, 5,4,5,7,8,9,10};
//         int count = 0;
//         int searchNumber = 1;
//         for(int i = 0;i<numbers.length;i++){
//             if (numbers[i]==searchNumber){
//                 count++;
//             }
           

//         }
//          System.out.println("Number "+ searchNumber + " found " + count + " times.");
//     }
// }


// public class Counting{

//     //2.  Using a while loop to count occurrences of digits in a number
//     //   This code counts how many times each digit appears in a number.


//     public static void main(String[] args){
//         int number = 123454123;
//         int count[] = new int[10];

//         while(number>0){
//             int digit = number % 10;
//             count[digit]++; 
//             number /= 10;    
            
//         }
//         // first cycle digit = 3 count[3] = 1 number = 12345412
//         // second cycle digit = 2 count[2] = 1 number = 123454
//         // third cycle digit = 1 count[1] = 1 number = 123454
//         // fourth cycle digit = 4 count[4] = 1 number = 12345
//         // fifth cycle digit = 5 count[5] = 1 number = 1234
//         // sixth cycle digit = 4 count[4] = 2 number = 123
//         // seventh cycle digit = 3 count[3] = 2 number = 12
//         // eighth cycle digit = 2 count[2] = 2 number = 1
//         // ninth cycle digit = 1 count[1] = 2 number = 0
//         System.out.println("Digit counts:");
//         for(int i = 0;i<10;i++){
//             System.out.println("Digit " + i + ": " + count[i] + " times");
//         }

//     }
// }



public class Counting {

    //3. without usig arrays, using a for loop to count occurrences of a number

    public static void main(String[] args){
        int number = 123247445;
        for(int digit =0;digit<9;digit++){
            int count = 0;
            int temp = number;

            while(temp>0){
            int lastdigit = temp % 10;
            if(lastdigit == digit){
                count++;
            }
            temp = temp/10;
        }

        System.out.println("Digit " + digit + " occurs " + count + " times.");
    }
        

       
    }
}