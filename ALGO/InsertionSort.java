import java.util.Arrays;

public class InsertionSort {
    
    public static void main(String args[]){

        int[] arr = {10,14,12,76,34,222,33,11,22,65,3,2,4,1,5,0};

        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(arr));

        for(int i = 1; i < arr.length ; i++){
            boolean swap = false;
            int swapAt = 0;
            int j = i - 1;
            int temp = arr[i];
            for(; j >= 0; j--){
                if(temp < arr[j]){
                    arr[j+1] = arr[j];
                    swap = true;
                    swapAt = j;
                }
                if(j == 0){
                    break;
                }
            }
            if(swap){
                arr[swapAt] = temp;
            }
        }

        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(arr));

    }
}
