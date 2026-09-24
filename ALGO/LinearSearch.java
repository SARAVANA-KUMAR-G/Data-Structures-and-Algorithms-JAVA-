class Searcher{

    // For 1-D Array
    public static int find(int[] arr, int target){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static boolean contains(int[] arr, int target){
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    // For String
    public static int find(String str, char target){
        
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){
                return i;
            }
        }
        return -1;
    }
    public static boolean contains(String str, char target){
        
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }

    // For 2-D array/matrix
    public static String find(int[][] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length ; j++){
                if(arr[i][j] == target){
                return i + ", " + j;
            }
            }
        }
        return "";
    }
    public static boolean contains(int[][] arr, int target){
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length ; j++){
                if(arr[i][j] == target){
                return true;
            }
            }
        }
        return false;
    }
}

class LinearSearch{

    public static void main(String[] args) {
        
        int[] arr = {4, 1, 5, 2, 7, 3, 8};
        int target = 5;

        String str = "coding is fun";
        char charTarget = 'g';

        int[][] arr2D = {
                        {5,4,7},
                        {1,3,8},
                        {0,9,2},
                        {10,20}
        };
        int target2D = 10;

        System.out.println(Searcher.find(arr, target));
        System.out.println(Searcher.contains(arr, target));
        System.out.println();

        System.out.println(Searcher.find(str, charTarget));
        System.out.println(Searcher.contains(str, charTarget));
        System.out.println();

        System.out.println(Searcher.find(arr2D, target2D));
        System.out.println(Searcher.contains(arr2D, target2D));
        System.out.println();

    }
}