import java.util.Arrays;

public class SelectionSort {
    
    public static void main(String[] args) {
        
        int[] arr = {3,4,1,5,2,6};

        System.out.println("Unsorted Array: ");
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length - 1; i++){
            int index_min = i;
             for(int j = i; j < arr.length - 1; j++){
                if(arr[index_min] > arr[j+1]){
                    index_min = j+1;
                    continue;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index_min];
            arr[index_min] = temp;
        }

        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(arr));
    }
}
