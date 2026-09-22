class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

public class DoublyLinkedList{

    Node head = null;

    DoublyLinkedList(int headData){
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
            newNode.prev = temp;
        }
        else
            System.out.println("Linked List is Empty!");
    }
    void insertAtBegining(int data){
        if(head != null){
            Node temp = head;
            Node newNode = new Node(data);
            temp.prev = newNode;
            newNode.next = temp;
            head = newNode;
        }
        else
            System.out.println("List is Empty!");
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
            newNode.prev = temp;
        }
        else
            System.out.println("Index is not valid!");
    }

    // Access
    void get(int index){
        if(head != null){
            Node temp = head;
            for(int i = 0; i < index; i++){
                if(temp.next == null){
                    System.out.println("Index out of bound/invalid");
                    break;
                }
                temp = temp.next;
            }
            System.out.println("Data at index "+index+": "+temp.data);
        }
        else
            System.out.println("List is empty!");
    }

    // Search
    void search(int data){
        if(head != null){
            Node temp = head;
            int counter = 0;
            while(temp.next != null){
                temp = temp.next;
                counter++;
                if(temp.data == data){
                    break;
                }
            }
            System.out.println("Element Found! At index: "+counter);
        }
        else
            System.out.println("List is empty!");
    }

    // Update
    void update(int index, int newData){
        if(head != null){
            Node temp = head;
            for(int i = 0; i < index; i++){
                if(temp.next == null){
                    System.out.println("Cannot Update, Index Out of Bound!");
                    return ;
                }
                temp = temp.next;
            }
            temp.data = newData;
        }
        else
            System.out.println("List is Empty!");
    }

    // Delete
    void deleteAtIndex(int index){
        if(index == 0){
            deleteAtBegining();
            return ;
        }
        if(head != null){
            Node temp = head;
            for(int i = 0; i < index-1; i++){
                temp = temp.next;
                System.out.println(temp.data);
                if(temp.next == null){
                    temp.prev.next = temp.next;
                    return ;
                }
            }
            if(temp.next != null){
                temp.next = temp.next.next;
                temp.next.next.prev = temp;
                // temp.prev = null;
                // temp.next = null;
                return;
            }
            System.out.println("Index Out of Bound!");
        }
        else
            System.out.println("List is Empty!");
    }
    void deleteAtBegining(){
        if(head != null){
            Node temp = head;
            head = temp.next;
            head.prev = null;
        }
        else
            System.out.println("List is Empty!");
    }
    
    // Traverse/Display
    void display(){
        if(head != null){
            Node temp = head;
            System.out.print("null<-");
            while(temp != null){
                if(temp.next == null){
                    System.out.print(temp.data + "->");
                    break;
                }
                System.out.print(temp.data + "<->");
                temp = temp.next;
            }
            System.out.print("null\n");
        }
        else
            System.out.println("List is Empty!");
    }
        
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList(10);
        
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.insertAtIndex(2, 15);
        list.insertAtIndex(5, 25);

        list.insertAtBegining(11);

        // list.insert(12);

        list.display();
        System.out.println("");

        list.get(3);
        System.out.println("");

        list.search(15);
        System.out.println("");

        list.update(5, 99);
        list.display();
        System.out.println("");

        list.deleteAtIndex(5);
        list.display();

    }
}