package src.main.BasicQuestions;

//Program to reverse a singly linked list
public class ReverseLinkedList {

    public static void printList(Node head){
           Node temp = head;
           while(temp!=null){
               System.out.println(temp.data+" ");
               temp = temp.next;
           }
        System.out.println();
    }

    public static Node reverse(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;

        while(current!=null){
            next = current.next; // store next node
            current.next = prev; // Reverse current node's pointer
            prev = current;      // Move prev forward
            current = next;      // Move current forward
        }
        return prev; // New head of the reversed list
    }

    static void main() {
        // Create Linked List  1 -> 2 -> 3 -> 4 -> 5

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("The original linked list before reversing: ");
        printList(head);

        head = reverse(head);
        System.out.println("Reversed Linked List: ");
        printList(head);
    }
}

// for definding the structure of Node
class Node{

    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}