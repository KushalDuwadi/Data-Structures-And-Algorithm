//  Program to find the serched item or number using liner search technique...................


// public class SearchAlgo {

//     public static void main(String[] args) {
        

//         int[] arr = {45,65,89,75,12,35,8,4,46};
//         int target = 65;

//         int result = linearSearch(arr, target);
//         if(result == -1)
//         System.out.println("Element is not present in array");
//         else{
//             System.out.println("The searched element  " + result + " is present");
        
//         }
//     }

    
//          static int linearSearch(int[] arr, int target){

//             for(int i=0;i<arr.length;i++)
//             {
//                 if(arr[i]==target){
//                     return target;
//                 }
           

//             }
//             return -1;
// }
// }



//  program to search the character in the given string.............................................

// public class SearchAlgo {

//     public static void main(String[] args) {

//         String name = "kushal";
//         char target = 'K';

//         boolean res = searchChar(name,target);
//         System.out.println(res);

//     }


//     static boolean searchChar(String str, char target){

//         for(int i = 0;i<str.length();i++){
//             if(str.charAt(i) == target){
//                 return true;
//         }

        
//     }
//     return false;
// }
// }


// program to find the target element in between the given index...................





            //     public class SearchAlgo {
                
            //         public static void main(String[] args) {

            //             int[] arr = { 45,65,85,78,21,746,45 };
            //             int target = 855;
            //             int sindex = 0;
            //             int eindex = 4;

            //             int result = searchNumber(arr,target,sindex,eindex);
            //             System.out.println(result);

            //     }

            //     static int searchNumber(int[] arr,int target, int sindex,int eindex){

            //         for (int i=sindex;i<=eindex;i++){
            //             if(arr[i] == target){
            //                 return i;
            //         }

            //     }
            //     return -1;
            // }}



//program to find the minimum number from given one dimension array...........................................

// public class SearchAlgo {

//     public static void main(String[] args) {
//         int[] arr = { 45,65,85,78,21,746,45,10};
//         int min_number = 45;
//         int result = minFunction(arr, min_number);
//         System.out.println(result);
//     }

//         static int minFunction(int[] arr, int min_number){

//             for (int i = 0;i<arr.length;i++){
//                 if(arr[i]<min_number)
//                 min_number  = arr[i];
//             }
//             return min_number;

//         }

// }



// Program for searching the target element in two dimensional array..............
// Here we have retun two indexes ie. i and j respectively ; for that we cannot simply write return i,j
// for returning multiple item have ro declare while defining and initillization  the function

import java.util.Arrays;

public class SearchAlgo {

    public static void main(String[] args) {
        int[][] arr =  {
            { 45,65,85,78 },
            { 21,746,45,10 },
            { 78,21,65,855 }

        };
        int target = 855;

        int[] result = searchFunction(arr, target);
        System.out.println("Row: " + result[0] + ", Column: " + result[1]);
        System.out.println(Arrays.toString(result));
    }

static int[] searchFunction(int[][] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if (arr[i][j] == target) {
                return new int[]{i, j}; // return row and column
            }
        }
    }
    return new int[]{-1, -1}; // not found
}}