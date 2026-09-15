/**
 * Array
 */
public class Array {

    int[] arr;
    int capacity;
    int size;

    Array(int capacity){
        this.arr = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    // Create an array
    void createArray(int cap){
        arr = new int[cap];
    }

    // Access
    void getElement(int index){
        if(size == 0){
            System.out.println("Array is empty!");
            return;
        }
        if(index <= size)
            System.out.println(arr[index]);
        else
            System.out.println("Index is not valid!!");
    }

    // Insert
    void insert(int element){
        if(size < capacity){
            arr[size] = element;
            size++;
            return;
        }
        else{
            System.out.println("Array is Full!, Cannot insert " + element);
        }
    }
    void insertAtIndex(int index, int element){ // 1,2,3,4,
        if(size < capacity){
            int j;
            for(j = size; j > index; j--){
                arr[j] = arr[j-1];
            }
            arr[j] = element;
            size++;
        }
        else{
            System.out.println("Array is Full!, Cannot insert " + element);
        }
    }

    // Update
    void update(int index, int element){
        if(index < capacity){
            arr[index] = element;
        }
        else
            System.out.println("Index is invalid!");
    }

    // Delete
    void deleteAtIndex(int index){ // 1,2,3,5,5
        if(size == 0){
            System.out.println("Array is empty!");
            return;
        }
        if(index < size){
            int j;
            for(j = index; j < size-1; j++){
                arr[j] = arr[j+1];
            }
            arr[j] = 0;
            size--;
        }
        else{
            System.out.println("Index not found!!");
        }
    }

    // Get size and capacity of the array
    void getSize(){
        System.out.println("Array Size: " + size);
    }
    void getCapacity(){
        System.out.println("Array Capacity: " + capacity);
    }
    
    // Search
    String search(int element){
        if(size == 0){
            System.out.println("Array is empty!");
            return "";
        }
        int i;
        boolean flag = false;
        for(i = 0; i < size; i++){
            if(arr[i] == element){
                flag = true;
                break;
            }
        }
        return flag ? "Element found at index: " + i : "Element not found";
    }

    // Display
    void display(){
        System.out.print("Array: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        
        int arrayMaxSize = 5;
        Array arr = new Array(arrayMaxSize);
        // arr.createArray(arrayMaxSize);

        arr.insert(10);
        arr.insert(20);
        arr.insert(30);

        arr.insertAtIndex(4, 40);
        arr.insertAtIndex(3, 11);

        arr.getElement(2);

        arr.update(1, 33);

        arr.deleteAtIndex(1);
        arr.deleteAtIndex(0);

        System.out.println(arr.search(11));

        arr.display();
        arr.getSize();
        arr.getCapacity();
    }
}