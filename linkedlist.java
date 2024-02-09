import java.util.Scanner;

public class LinkedListCRUD {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Method to add a new node at the end of the linked list
    void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

    // Method to display the linked list
    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to insert a new node at the beginning of the linked list
    void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to delete a node with a specific value from the linked list
    void delete(int key) {
        Node current = head;
        Node prev = null;

        // If the key is in the head node
        if (current != null && current.data == key) {
            head = current.next;
            return;
        }

        // Search for the key to be deleted, keep track of the previous node
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        // If key was not present in the linked list
        if (current == null) {
            System.out.println("Key not found in the linked list.");
            return;
        }

        // Unlink the node with the given key
        prev.next = current.next;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedListCRUD linkedList = new LinkedListCRUD();

        while (true) {
            System.out.println("\nLinked List CRUD Operations Menu:");
            System.out.println("1. Display Linked List");
            System.out.println("2. Append (Add at End)");
            System.out.println("3. Prepend (Add at Beginning)");
            System.out.println("4. Delete Node");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Linked List Elements:");
                    linkedList.display();
                    break;

                case 2:
                    System.out.print("Enter the element to append: ");
                    int appendElement = scanner.nextInt();
                    linkedList.append(appendElement);
                    System.out.println("Element appended successfully.");
                    break;

                case 3:
                    System.out.print("Enter the element to prepend: ");
                    int prependElement = scanner.nextInt();
                    linkedList.prepend(prependElement);
                    System.out.println("Element prepended successfully.");
                    break;

                case 4:
                    System.out.print("Enter the element to delete: ");
                    int deleteElement = scanner.nextInt();
                    linkedList.delete(deleteElement);
                    System.out.println("Element deleted successfully.");
                    break;

                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
