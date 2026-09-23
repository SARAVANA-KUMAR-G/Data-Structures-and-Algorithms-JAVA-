class Node{

    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class QueueLinkedList {
    
    Node head;

    QueueLinkedList(){
        this.head = null;
    }

    // insertAtFirst / Push Operation
    void enqueue(int data){
        if(head == null){
            Node newNode = new Node(data);
            head = newNode;
            return ;
        }
        if(head != null){
            Node temp = head;
            Node newNode = new Node(data);
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        else
            System.out.println("Linked List is Empty!");
    }

    // DeleteAtFirst / Pop Operation
    void dequeue(){
        if(head != null){
            if(head.next == null){
                head = null;
                return ;
            }
            head = head.next;
            return ;
        }
        System.out.println("Queue is Empty!");
    }

    // Check if the Stack is Empty or Not
    void isEmpty(){
        if(head == null){
            System.out.println("Queue is Empty!");
            return ;
        }
        System.out.println("Queue is not Empty!");
    }

    // Traverse/Display
    void display(){
        if(head != null){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                System.out.println("|");
                System.out.println("v");
                temp = temp.next;
            }
            System.out.print("null\n");
        }
        else
            System.out.println("Queue is Empty!");
    }

    public static void main(String[] args) {
        
        QueueLinkedList myQueue = new QueueLinkedList();

        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.enqueue(40);
        myQueue.enqueue(50);

        myQueue.display();
        System.out.println();

        myQueue.dequeue();
        myQueue.dequeue();

        myQueue.display();

        System.out.println();
        myQueue.isEmpty();
    }
}
