package Assignment3;

/*E)Write a  program to count all non-zero elements, odd numbers and even numbers in the singly linked list.*/

public class Que5 {
    Node root;

    void create_list() {
        root = null; // preparing with empty root
    }

    void insert_right(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = n; // n becomes the first node, so root = n
        } else {
            Node t = root;
            while (t.next != null) {
                t = t.next;
            }
            t.next = n;
        }
        System.out.println(data + " inserted");
    }

    void print_list() {
        if (root == null) {
            System.out.println("List Empty");
        } else {
            Node t = root;
            while (t != null) {
                System.out.print("|" + t.data + "|->");
                t = t.next;
            }
            System.out.println("null"); // Indicate the end of the list
        }
    }

    void count_nonzero() {
        if (root == null) {
            System.out.println("List Empty");
            return;
        }
        Node t = root;
        int count = 0;
        while (t != null) {
            if (t.data != 0) {
                count++;
            }
            t = t.next;
        }
        System.out.println("Number of non-zero numbers: " + count);
    }

    void count_odd() {
        if (root == null) {
            System.out.println("List Empty");
            return;
        }
        Node t = root;
        int count = 0;
        while (t != null) {
            if (t.data % 2 != 0) {
                count++;
            }
            t = t.next;
        }
        System.out.println("Number of odd numbers: " + count);
    }

    void count_even() {
        if (root == null) {
            System.out.println("List Empty");
            return;
        }
        Node t = root;
        int count = 0;
        while (t != null) {
            if (t.data % 2 == 0) {
                count++;
            }
            t = t.next;
        }
        System.out.println("Number of even numbers: " + count);
    }

    public static void main(String[] args) {
        Que5 list1 = new Que5();

        list1.create_list();
        list1.insert_right(10);
        list1.insert_right(20);
        list1.insert_right(50);
        list1.insert_right(60);
        list1.insert_right(80);
        System.out.println("Linked list 1: ");
        list1.print_list();
        list1.count_nonzero();
        list1.count_odd();
        list1.count_even();

        Que5 list2 = new Que5();
        list2.create_list();
        list2.insert_right(-12);
        list2.insert_right(-24);
        list2.insert_right(-11);
        list2.insert_right(-34);
        list2.insert_right(-25);
        System.out.println("Linked list 2: ");
        list2.print_list();
        list2.count_nonzero();
        list2.count_odd();
        list2.count_even();
    }
}