class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

public class CircularLinkedList{

    Node tail;

    CircularLinkedList(int tailNode){
        Node newNode = new Node(tailNode);
        this.tail = newNode;
        newNode.next = newNode;
    }

    // Insert
    void insertAtBegining(int data){
        if(tail != null){
            Node newNode = new Node(data);
            newNode.next = tail.next;
            tail.next = newNode;
            return ;
        }
        else
            System.out.println("LL is Empty!");
    }
    void insertAtLast(int data){
        if(tail != null){
            Node newNode = new Node(data);
            Node temp = tail;
            while(temp.next != tail){
                temp = temp.next;
            }
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
            return ;
        }
        else
            System.out.println("Index is not valid!");
    }

    // Delete
    void deleteAtFirst(){
        if(tail.next == tail){
            tail = null;
            return ;
        }
        if(tail != null){
            tail.next = tail.next.next;
            return ;
        }
        else
            System.out.println("Linked List is Empty!`");
    }
    void deleteAtLast(){
        if(tail.next == tail){
            tail = null;
            return ;
        }
        if(tail != null){
            Node temp = tail;
            while(temp.next != tail){
                temp = temp.next;        
            }
            temp.next = temp.next.next; // tail.next
            tail = temp;
            return;
        }
        else
            System.out.println("List is Empty!");
    }
    
    // Traverse/Display
    void display(){
        if(tail != null){
            Node temp = tail;
            do{ 
                System.out.print(temp.data + "->");
                temp = temp.next;
            }while(temp != tail);
            System.out.print("\n");
        }
        else
            System.out.println("List is Empty!");
    }
        
    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList(10);

        list.insertAtBegining(11);
        list.insertAtBegining(21);
        list.display();
        System.out.println();

        list.insertAtLast(15);
        list.insertAtLast(25);
        list.display();
        System.out.println();

        list.deleteAtLast();
        list.display();
        System.out.println();

        list.deleteAtFirst();
        list.display();
        System.out.println();

    }
}