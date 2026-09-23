class QueueArray{

    int[] arr;
    int front;
    int rear;

    QueueArray(int size){
        this.arr = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    // Insert
    void enqueuev1(int data){
        if(front == -1){
            arr[rear+1] = data;
            front++;
            rear++;
            return ;
        }
        if(arr.length == rear+1){
            System.out.println("Queue is Full! Cannot insert: "+data);
            return ;
        }
        arr[rear+1] = data;
        rear++;
    }
    void enqueuev2(int data){
        if(front == -1){
            arr[rear+1] = data;
            front++;
            rear++;
            return ;
        }
        if(arr.length == rear+1){
            System.out.println("Queue is Full! Cannot insert: "+data);
            return ;
        }
        arr[rear+1] = data;
        rear++;
    }

    // Delete
    void dequeuev1(){
        if(front == -1){
            System.out.println("Queue is Empty! Cannot delete/dequeue.");
            return ;
        }
        System.out.println("Element deleted: " + arr[front]);
        front++;
    }
    void dequeuev2(){ // This function left-shift once whenever we delete the front element
        if(front == -1){
            System.out.println("Queue is Empty! Cannot delete/dequeue.");
            return ;
        }
        System.out.println("Element deleted: " + arr[front]);
        for(int i = 0; i < rear; i++){
            arr[i] = arr[i+1];
        }
        arr[rear] = 0;
        rear--;
    }

    void display(){
        for(int i : arr) {
            System.out.print(i + "|"); 
        }
    }

    public static void main(String[] args) {
        
        QueueArray queue = new QueueArray(10);

        queue.enqueuev2(10);
        queue.enqueuev2(20);
        queue.enqueuev2(30);
        queue.enqueuev2(40);
        queue.enqueuev2(50);
        queue.enqueuev2(60);
        queue.enqueuev2(70);
        queue.enqueuev2(80);
        queue.enqueuev2(90);

        queue.display();
        System.out.println();

        System.out.println(queue.front);
        System.out.println(queue.rear);

        queue.dequeuev2();
        System.out.println(queue.front);

        queue.dequeuev2();

        queue.display();
    }
}