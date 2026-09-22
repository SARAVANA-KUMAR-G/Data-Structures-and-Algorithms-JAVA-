class Node <T>{
        T data;
        Node<T> next;

        Node(T data){
            this.data = data;
            this.next = null;
        }
    }

public class LinkedListGeneric <T>{

    Node<T> head;

    LinkedListGeneric(T headData){
        Node<T> newNode = new Node<>(headData);
        this.head = newNode;
    }

    // Insert
    void insert(T data){
        if(head != null){
            Node<T> temp = head;
            Node<T> newNode = new Node<>(data);
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        else
            System.out.println("Linked List is Empty!");
    }
    void insertAtBegining(T data){
        if(head != null){
            Node<T> temp = head;
            Node<T> newNode = new Node<>(data);
            head = newNode;
            newNode.next = temp;
            return ;
        }
        else
            System.out.println("LL is Empty!");
    }
    void insertAtIndex(int index, T data){
        if(head != null){
            Node<T> temp = head;
            Node<T> newNode = new Node<>(data);
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

    // Access
    void get(int index){
        if(head != null){
            Node<T> temp = head;
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
    void search(T data){
        if(head != null){
            Node<T> temp = head;
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
    void update(int index, T newData){
        if(head != null){
            Node<T> temp = head;
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
        if(head != null){
            Node<T> temp = head;
            for(int i = 0; i < index-1; i++){
                if(temp.next == null){
                    break;
                }
                temp = temp.next;        
            }
            if(temp.next != null){
                temp.next = temp.next.next;
                return;   
            }
            System.out.println("Index Out of Bound!");
        }
        else
            System.out.println("List is Empty!");
    }
    
    // Traverse/Display
    void display(){
        if(head != null){
            Node<T> temp = head;
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

        LinkedListGeneric<Integer> list = new LinkedListGeneric<>(10);
        
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.insertAtIndex(2, 15);
        list.insertAtIndex(10, 25);

        list.insertAtBegining(11);

        list.display();
        list.get(3);
        list.search(15);

        list.update(5, 99);
        list.display();

        list.deleteAtIndex(4);
        list.display();

    }
}