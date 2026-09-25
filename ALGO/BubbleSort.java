import java.util.Arrays;

public class BubbleSort {
    
    public static void main(String args[]){

        // int[] arr = {4,1,5,7,2};
        int[] arr = {10,14,12,76,34,34,34,11,222,33,11,22,65,3,2,4,1,5,0};

        // int passCount = 0;

        System.out.println("Unsorted Array:");
        System.out.println(Arrays.toString(arr));

        // Using While loop:-
        // while(arr.length - 1 != passCount){
        //     int a = 0, b = 1;
        //     for(int i = 0; i < arr.length - passCount; i++){
        //         if(b == arr.length - passCount){
        //             break;
        //         }
        //         if(arr[a] > arr[b]){
        //             int temp = arr[a];
        //             arr[a] = arr[b];
        //             arr[b] = temp;
        //         }
        //         a++;b++;
        //     }
        //     passCount++;
        // }

        // Using two for loops
        int swap;
        for(int i = 1; i < arr.length; i++){
            swap = 0;
            for(int j = 0; j < arr.length - i; j++){
                if(arr[j] < arr[j+1]){
                    continue;
                }
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swap++;
            }
            if(swap == 0){
                break;
            }
        }

        System.out.println("\nSorted Array:");
        System.out.println(Arrays.toString(arr));

    }
}
