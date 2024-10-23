
import java.util.*;
public class Implementation {
    Node head;
    class  Node{
        String data;
        Node next;

        // CONST
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    // Add a node at the beginning of the list
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add a node at the end of the list
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curNode = head;
        while (curNode.next != null) { // Loop until the last node
            curNode = curNode.next;
        }
        curNode.next = newNode; // Append the new node at the end
    }


    // Print the entire list
    public void printList() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + " -> ");
            curNode = curNode.next;
        }
        System.out.println("null");
    }



    public static void main(String[] args) {

        //OBJECT
        Implementation list = new Implementation();

        list.addFirst("is");
        list.addFirst("name");

        list.printList();


    }
}
