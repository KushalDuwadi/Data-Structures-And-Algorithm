// 1.Array List is sorted in Ascending Order


// public class Binarysearch {

//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
//         int target = 1;
//         int result = search(arr, target);
//         System.out.println(result);  // Expected Output: 14 (index of 15)
//     }

//     static int search(int[] arr, int target) {
//         int start = 0;
//         int end = arr.length - 1;

//         while(start <= end) {
//             int mid =  (start + end) / 2;  // Avoids overflow

//             if(arr[mid] == target) {                                      // 1000000+(3000000-1000000)/2 = 20000000
//                                                                           // (1000000+3000000)/2 = 2000000
//                  return mid;  // Found!
//             }
//             else if(arr[mid] < target) {
//                 start = mid + 1;  // Search right half
//             }
//             else {
//                 end = mid - 1;  // Search left half
//             }
//         }

//         return -1;  // Not found
//     }
// }



// 2. Array List is sorted in descending order.............


public class Binarysearch {

    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int target = 5;
        int result = binarySearch(arr, target);
        System.out.println(result);
    }





    public static int binarySearch(int[] arr,int target){

        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            if(target>arr[mid]){
                end = mid-1;    
            }
               else if (target<arr[mid]){
            start = mid+1;
        }
        else if (target==arr[mid]){
            return mid;
        }
        }
        return -1;
}
}