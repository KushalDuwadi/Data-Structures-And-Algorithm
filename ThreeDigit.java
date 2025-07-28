// // program  to find the total number in the array that is divisible by 3................


// public class ThreeDigit {

//     public static void main(String[] args) {
//         int[] num = {3,6,9,12,45,7,8,30,33};
//        int  count = 0;
//        int res = findNumbers(num);
//        System.out.println(res);
//     }

//     static int findNumbers(int[] num){
//         int count = 0;
//         for(int i =0;i<num.length;i++){
//             if(divisible(num[i])){ //num[0] = 3
//                 count++;
//             }
//         }

//         return count;
//     }

//     static boolean divisible(int nums){
//         if(nums%3==0){
  
//         return true;
       
//         }
//         return false;
//     }

// }




// program to find the numbers having three digits..................


public class ThreeDigit {

    public static void main(String[] args) {
        int[] num = {100, 23, 456, 789, 123};
              System.out.println(findNumbers(num));
        //  int res = findNumbers(num);
        // System.out.println(res);
    }

    static int findNumbers(int[] num){

        int count = 0;
        for(int i = 0;i<num.length;i++){
            if(digits(num[i])==3)
                count++;
        }
        return count;

    }





    static int digits(int num){
        int count = 0;

        while(num>0){
            num = num/10; //num = 10
            
            count++;  //2
        }
        return count;

    }
}



