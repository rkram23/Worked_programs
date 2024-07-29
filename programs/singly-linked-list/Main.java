import java.util.*;

class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    LinkedList() {
        head = null;
    }

    // insertAtBeg
    void insertAtBeg(int val) {
        Node newnode = new Node(val);

        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    // insertAtPos
    void insertAtPos(int pos, int data) {
        if (pos == 0) {
            insertAtBeg(data);
            return;
        } else {
            Node inode = new Node(data);
            Node temp = head;
            for (int i = 1; i < pos; i++) {
                temp = temp.next;
                if (temp == null) {
                    System.out.println("Invalid Position");
                    return;
                }
            }
            inode.next = temp.next;
            temp.next = inode;
        }
    }

    // insertAtEnd
    void insertAtEnd(int val) {
        Node endNode = new Node(val);
        if (head == null) {
            head = endNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = endNode;
        }
    }

    // display
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // printReverse
    void printReverse() {
        recursivePrint(head);
        System.out.println();
    }

    void recursivePrint(Node node) {
        if (node == null)
            return;
        recursivePrint(node.next);
        System.out.print(node.data + " ");
    }

    // print element at Position
    void printAtPos(int pos) {
        if (pos == 0) {
            System.out.println(head.data);
        } else {
            Node temp = head;
            for (int i = 1; i <= pos; i++) {
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

    // deleteAtBeg
    void deleteAtBeg() {
        if (head != null) {
            head = head.next;
        }
    }

    // deleteAtPos
    void deleteAtPos(int pos) {
        if (head == null) {
            System.out.println("Invalid Position");
            return;
        }

        if (pos == 0) {
            deleteAtBeg();
            return;
        }

        Node prev = null;
        Node temp = head;
        for (int i = 0; i < pos; i++) {
            prev = temp;
            temp = temp.next;
            if (temp == null) {
                System.out.println("Invalid Position");
                return;
            }
        }
        prev.next = temp.next;
    }

    // deleteAtEnd
    void deleteAtEnd() {
        if (head == null) {
            System.out.println("No Node to delete ");
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    // find and print the middle node
    void printMiddle() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node slow_ptr = head;
        Node fast_ptr = head;

        while (fast_ptr != null && fast_ptr.next != null) {
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
        }
        System.out.println("Middle element: " + slow_ptr.data);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int n;

        do {
            System.out.println("1 => insertAtBeg  2 => insertAtPos 3 => insertAtEnd 4 => deleteAtBeg  5 => deleteAtPos 6 => display 7 => deleteAtEnd 8 => Print Reverse 9 => printAtPos 10 => Print Middle 11 => Exit");
            System.out.println("Enter Your Choice : ");
            n = sc.nextInt();

            switch (n) {
                case 1: {
                    System.out.println("insertAtBeg");
                    System.out.println("Enter a Number : ");
                    int num = sc.nextInt();
                    list.insertAtBeg(num);
                    break;
                }
                case 2: {
                    System.out.println("Insert At Position ");
                    System.out.println("Enter Position : ");
                    int pos = sc.nextInt();
                    System.out.println("Enter a Number : ");
                    int num = sc.nextInt();
                    list.insertAtPos(pos, num);
                    break;
                }
                case 3: {
                    System.out.println("Insert At End ");
                    System.out.println("Enter element : ");
                    int num = sc.nextInt();
                    list.insertAtEnd(num);
                    break;
                }
                case 4: {
                    System.out.println("Delete At Beginning");
                    list.deleteAtBeg();
                    break;
                }
                case 5: {
                    System.out.println("deleteAtPos");
                    System.out.println("Enter Position to delete : ");
                    int pos = sc.nextInt();
                    list.deleteAtPos(pos);
                    break;
                }
                case 6: {
                    System.out.println("display elements");
                    list.display();
                    break;
                }
                case 7: {
                    System.out.println("deleteAtEnd");
                    list.deleteAtEnd();
                    break;
                }
                case 8: {
                    System.out.println("Print Reverse ");
                    list.printReverse();
                    break;
                }
                case 9: {
                    System.out.println("printAtPos");
                    System.out.println("Enter Position : ");
                    int pos = sc.nextInt();
                    list.printAtPos(pos);
                    break;
                }
                case 10: {
                    System.out.println("Print Middle");
                    list.printMiddle();
                    break;
                }
                case 11: {
                    System.out.println("Exiting");
                    break;
                }
                default: {
                    System.out.println("Invalid Choice");
                    break;
                }
            }
        } while (n != 11);
    }
}
