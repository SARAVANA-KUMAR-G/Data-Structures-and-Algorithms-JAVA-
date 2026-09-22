public class StackArray {
    
    int top;
    int[] arr;

    StackArray(int size){
        this.top = -1;
        this.arr = new int[size];
    }

    // Insert / Push Operation
    void push(int data){
        if(top >= -1){
            arr[top+1] = data;
            top++;
        }
    }

    // Delete / Pop Operation
    void pop(){
        if(top != -1){
            System.out.println("Element Deleted: "+arr[top]);
            top--;
            return ;
        }
        System.out.println("Stack is Empty!");
    }

    // Retrive / Display the top element
    void peek(){
        if(top != -1){
            System.out.println("Top element is: " + arr[top]);
            return ;
        }
        System.out.println("Stack is Empty!");
    }

    // Check if the Stack is Empty or Not
    void isEmpty(){
        if(top == -1){
            System.out.println("Stack is Empty!");
            return ;
        }
        System.out.println("Stack is not Empty!");
    }

    // Display Stack
    void display(){
        if(top != -1){
            for (int i = top; i >= 0; i--) {
                System.out.println("|"+arr[i]+"|");
                System.out.println("----");
            }
            return ;
        }
        System.out.println("Stack is Empty!");
    }

    public static void main(String[] args) {
        
        StackArray mystack = new StackArray(5);

        mystack.push(10);
        mystack.push(20);
        mystack.push(30);
        mystack.push(40);
        mystack.push(50);
        // mystack.push(60); Stack OverFlows

        mystack.display();

        mystack.pop();
        mystack.pop();

        mystack.display();

        System.out.println();
        mystack.peek();

        System.out.println();
        mystack.isEmpty();
    }
}
