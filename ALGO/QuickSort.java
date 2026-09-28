import java.util.Arrays;
public class QuickSort {

    static int[] combineArr(int[] arr1, int[] arr2, int mid){

        int k = 0;
        if(arr1.length == 0){
            int[] resultArr = new int[arr2.length+1];
            resultArr[k] = mid;
            k++;
            for(int i = 0; k < resultArr.length; i++){
                resultArr[k] = arr2[i];
                k++;
            }
            return resultArr;
        }
        if(arr2.length == 0){
            int[] resultArr = new int[arr1.length+1];
            for(int i = 0; k < resultArr.length; i++){
                resultArr[k] = arr1[i];
                k++;
            }
            resultArr[k] = mid;
            k++;
            return resultArr;
        }
        int[] resultArr = new int[arr1.length+arr2.length+1];
        for(int i = 0; i<arr1.length ;i++){
            resultArr[k] = arr1[i];
            k++;
        }
        resultArr[k] = mid;
        k++;
        for(int j = 0; j < arr2.length; j++){
            resultArr[k] = arr2[j];
            k++;
        }

        return resultArr;
           
    }
    
    static int[] quickSort(int[] arr, int low, int high){

        int pivot = arr[low];
        int i = low, j = arr.length-1;

        while(i<j){
            while(arr[i] <= pivot){
                i++;
                if(i>=arr.length-1){
                    break;
                }
                continue;
            }
            while(arr[j] >= pivot){
                j--;
                if(j <= 0){
                    break;
                }
                continue;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        arr[low] = arr[j];
        arr[j] = pivot;
        int mid = arr[j];

        int arr1[] = new int[j];
        int arr2[] = new int[arr.length-j-1];

        for(int a = 0; a < arr1.length; a++){
            arr1[a] = arr[a];
        }
        for(int b = 0; b < arr2.length; b++){
            arr2[b] = arr[j+1+b];
        }

        if(arr1.length != 1 && arr1.length != 0){
            arr1 = quickSort(arr1, 0, arr1.length-1);
        }
        if(arr2.length != 1 && arr2.length != 0){
            arr2 = quickSort(arr2, 0, arr2.length-1);
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(mid);
        System.out.println(Arrays.toString(arr2));
        arr = combineArr(arr1, arr2, mid);
        System.out.println(Arrays.toString(arr));

        return arr;
    }

    public static void main(String args[]){

        int[] arr = {5,3,8,4,2,7,1,10};
        
        System.out.println(Arrays.toString(quickSort(arr, 0, arr.length-1)));
    }
}
