class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

public class LLReversal{

    Node head;

    LLReversal(int headData){
        Node newNode = new Node(headData);
        this.head = newNode;
    }

    // Insert
    void insert(int data){
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
    void insertAtIndex(int index, int data){
        if(head != null){
            Node temp = head;
            Node newNode = new Node(data);
            for(int i = 0; i < index-1; i++){
                if(temp.next == null){
                    System.out.println("Index out of bound, so "+ data +" inserted at the end..");
                    break;
                }
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        else
            System.out.println("Index is not valid!");
    }

    // Reverse Function
    void reverseLList(){
        if(head != null){
            if(head.next == null){
                System.out.println("Cannot perform Reversal!, Linked List has only one node.");
                return ;
            }
            Node prev = null;
            Node current = head;
            Node next = null;
            while(current != null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
            System.out.println("Reversed LL:");
            while(prev != null){
                System.out.print(prev.data + "->");
                prev = prev.next;
            }
            System.out.print("null\n");
        }
        else
            System.out.println("Linked List is Empty!");
    }
    
    // Traverse/Display
    void display(){
        if(head != null){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.print("null\n");
        }
        else
            System.out.println("List is Empty!");
    }
        
    public static void main(String[] args) {

        LLReversal list = new LLReversal(10);
        
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.insertAtIndex(2, 15);
        list.insertAtIndex(5, 25);

        list.display();

        list.reverseLList();
    }
}