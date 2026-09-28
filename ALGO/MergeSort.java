import java.util.Arrays;

class MergeSort{

    static int[] forSortedArr(int[] arr1, int[] arr2){
        int[] resultArr = new int[(arr1.length+arr2.length)];
        int i = 0, j = 0;
        for(int k = 0; k < arr1.length + arr2.length; k++){
            if(i >= arr1.length){
                resultArr[k] = arr2[j];
                j++;
                continue;
            }
            if(j >= arr2.length){
                resultArr[k] = arr1[i];
                i++;
                continue;
            }

            if(i != (arr1.length) && arr1[i] < arr2[j]){
                resultArr[k] = arr1[i];
                i++;
                continue;
            }
            if(j != (arr2.length)){
                resultArr[k] = arr2[j];
                j++;
                continue;
            }

        }

        return resultArr;
    }

    static int[] divideConquer(int[] arr){
        
        int arr1Length = arr.length/2;
        int arr2Length = arr.length - arr1Length;
        int[] arr1 = new int[arr1Length];
        int[] arr2 = new int[arr2Length];

        int i;
        for(i=0; i<arr1Length; i++){
            arr1[i] = arr[i];
        }
        for(int j=0; j<arr2Length; j++){
            arr2[j] = arr[j+i];
        }

        if(arr1.length != 1){
            arr1 = divideConquer(arr1);
        }
        if(arr2.length != 1){
            arr2 = divideConquer(arr2);
        }
        int[] resultArr = forSortedArr(arr1, arr2);

        return resultArr;

    }

    public static void main(String args[]){

        int[] UnArr = {3,1,1,5,6,2,4,22,44,11,23,56,12,32,15};
       
        System.out.println(Arrays.toString(divideConquer(UnArr)));

    }
}