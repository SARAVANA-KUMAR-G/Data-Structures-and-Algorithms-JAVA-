class Node{

    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class StackLinkedList {
    
    Node top;

    StackLinkedList(){
        this.top = null;
    }

    // insertAtFirst / Push Operation
    void push(int data){
        if(top == null){
            Node newNode = new Node(data);
            top = newNode;
            return ;
        }
        if(top != null){
            Node temp = top;
            Node newNode = new Node(data);
            newNode.next = temp;
            top = newNode;
        }
        else
            System.out.println("Linked List is Empty!");
    }

    // DeleteAtFirst / Pop Operation
    void pop(){
        if(top != null){
            if(top.next == null){
                top = null;
                return ;
            }
            top = top.next;
            return ;
        }
    }

    // Retrive / Display the top element
    void peek(){
        if(top != null){
            System.out.println("Top element is: " + top.data);
            return ;
        }
        System.out.println("Stack is Empty!");
    }

    // Check if the Stack is Empty or Not
    void isEmpty(){
        if(top == null){
            System.out.println("Stack is Empty!");
            return ;
        }
        System.out.println("Stack is not Empty!");
    }

    // Traverse/Display
    void display(){
        if(top != null){
            Node temp = top;
            while(temp != null){
                System.out.println(temp.data);
                System.out.println("|");
                System.out.println("v");
                temp = temp.next;
            }
            System.out.print("null\n");
        }
        else
            System.out.println("List is Empty!");
    }

    public static void main(String[] args) {
        
        StackLinkedList mystack = new StackLinkedList();

        mystack.push(10);
        mystack.push(20);
        mystack.push(30);
        mystack.push(40);
        mystack.push(50);

        mystack.display();
        System.out.println();

        mystack.pop();
        mystack.pop();

        mystack.display();

        System.out.println();
        mystack.peek();

        System.out.println();
        mystack.isEmpty();
    }
}
