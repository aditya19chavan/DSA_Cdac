package UnionofLinkedList;

public class twoSinglyListClass {
    Node root;

    // Method to insert elements into the list in sorted order
    public void insertSorted(int data) {
        Node newNode = new Node(data);
        if (root == null || root.data >= newNode.data) {
            newNode.next = root;
            root = newNode;
        } else {
            Node current = root;
            while (current.next != null && current.next.data < newNode.data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Method to print the elements of the linked list
    public void printList() {
        Node temp = root;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Method to find the union of two sorted linked lists
    public static twoSinglyListClass findUnion(twoSinglyListClass list1, twoSinglyListClass list2) {
        twoSinglyListClass unionList = new twoSinglyListClass();
        Node l1 = list1.root;
        Node l2 = list2.root;

        // Traverse both lists and merge them in sorted order without duplicates
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                unionList.insertSorted(l1.data);
                l1 = l1.next;
            } else if (l1.data > l2.data) {
                unionList.insertSorted(l2.data);
                l2 = l2.next;
            } else { // l1.data == l2.data (equal elements, add only one)
                unionList.insertSorted(l1.data);
                l1 = l1.next;
                l2 = l2.next;
            }
        }

        // Add remaining elements of list1 (if any)
        while (l1 != null) {
            unionList.insertSorted(l1.data);
            l1 = l1.next;
        }

        // Add remaining elements of list2 (if any)
        while (l2 != null) {
            unionList.insertSorted(l2.data);
            l2 = l2.next;
        }

        return unionList;
    }
}