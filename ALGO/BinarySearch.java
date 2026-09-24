class BinarySearch{

    public static void main(String[] args) {
        
        // int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int target = 2;

        int low = 0, high = arr.length-1, mid;
        boolean flag = false;

        String order = "asc";

        if(arr[low] > arr[high]){
            order = "desc";
            low = arr.length-1;
            high = 0;
        }

        if(order == "desc"){
            while(high <= low){
                mid = (low + high) / 2;
                if(arr[mid] == target){
                    System.out.println("Element Found at Index: " + mid);
                    return ;
                }
                if(arr[mid] < target){
                    low = mid - 1;
                    continue;
                }
                else if(arr[mid] > target){
                    high = mid + 1;
                    continue;
                }
                flag = true;
            }
        }

        else{
            while(low <= high){
                mid = (low + high) / 2;
                if(arr[mid] == target){
                    System.out.println("Element Found at Index: " + mid);
                    return ;
                }
                if(arr[mid] < target){
                    low = mid + 1;
                    continue;
                }
                else if(arr[mid] > target){
                    high = mid - 1;
                    continue;
                }
                flag = true;
            }
        }
        
        if(!flag)
            System.out.println("Element Not Found/doesn't Exist!");
    
    }
}