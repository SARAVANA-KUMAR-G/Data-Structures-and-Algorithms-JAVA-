class Node{
    int coef;
    int expo;
    Node next;

    Node(int coef, int expo){
        this.coef = coef;
        this.expo = expo;
        this.next = null;
    }
}

public class LinkedListPolyAdd{

    Node head;

    // Insert
    void insertAtLast(int coef, int expo){
        if(head == null){
            Node newNode = new Node(coef, expo);
            head = newNode;
            return ;
        }
        if(head != null){
            Node newNode = new Node(coef, expo);
            Node temp = head;
            if(head.next == null){
                head.next = newNode;
                return ;
            }
            while(temp.next != null){ // 1, 2, 3
                temp = temp.next;
            }
            temp.next = newNode;
        }
        else
            System.out.println("Linked List is Empty!!");
    }
    
    // Traverse/Display
    void display(){
        if(head != null){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.coef + "x^" + temp.expo + " + ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Adding two polynomials
    void addPolyLL(LinkedListPolyAdd P, Node P1, Node P2){
        P = new LinkedListPolyAdd();
        if(P1 != null && P2 != null){
            while(P1 != null && P2 != null){
                if(P1.expo == P2.expo){
                    P.insertAtLast(P1.coef + P2.coef, P1.expo);
                }
                else if(P1.expo > P2.expo){
                    P.insertAtLast(P1.coef, P1.expo);
                    P1 = P1.next;
                    continue;
                }
                else if(P2.expo > P1.expo){
                    P.insertAtLast(P2.coef, P2.expo);
                    P2 = P2.next;
                    continue;
                }
                P1 = P1.next;
                P2 = P2.next;

                // If P1 or P2 becomes null
                if(P1 == null){
                    while(P2 != null){
                        P.insertAtLast(P2.coef, P2.expo);
                        P2 = P2.next;
                    }
                    break;
                }
                else if(P2 == null){
                    while(P1 != null){
                        P.insertAtLast(P1.coef, P1.expo);
                        P1 = P1.next;
                    }
                    break;
                }
            }
        }
        System.out.println("Addition of Two Polynomials:");
        P.display();

    }
        
    public static void main(String[] args) {

        LinkedListPolyAdd P1 = new LinkedListPolyAdd();
        P1.insertAtLast(2, 2);
        P1.insertAtLast(10, 1);
        P1.insertAtLast(20, 0);
        P1.display();

        LinkedListPolyAdd P2 = new LinkedListPolyAdd();
        P2.insertAtLast(3, 2);
        P2.insertAtLast(11, 1);
        P2.insertAtLast(12, 0);
        P2.display();

        LinkedListPolyAdd P = new LinkedListPolyAdd();
        P.addPolyLL(P, P1.head, P2.head);

    }
}