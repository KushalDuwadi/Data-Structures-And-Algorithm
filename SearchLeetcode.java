// program to find the number of even digit from the given array list.....


//let us take an example

// int[] arr = {44,547,6,528,7894,45,1258,44}  Here even number of digit are 44,7894,45,1285 ,44 = total is 5

public class SearchLeetcode {
    public static void main(String[] args) {
        int[] arr = {44,547,6,528,7894,45,1258,44};
       System.out.println(findNubers(arr));
    }

//     static int findNubers(int[] arr){
//         int count = 0;
//         for(int num:arr){
//             if(even(num)){
//                 count++;
//             }
//         }
//         return count;
// }
static int findNubers(int[] arr){
    int count = 0;
    for(int i = 0; i < arr.length; i++){
        if(even(arr[i])){
            count++;
        }
    }
    return count;
}

public static boolean even(int num){

    int numberofDigits = digits(num);
    if(numberofDigits % 2 == 0){
        return true;
    }
    return false;

}


static int digits(int num){
    int count = 0;
    while(num != 0){
        count++;
        num = num/10;
}
return count;


}
}
