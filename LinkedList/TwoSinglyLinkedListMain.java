package UnionofLinkedList;

class Node {
    int data;
    Node next;

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class TwoSinglyLinkedListMain {
    public static void main(String[] args) {
    	twoSinglyListClass list1 = new twoSinglyListClass();
    	twoSinglyListClass list2 = new twoSinglyListClass();

        // Insert elements into the first list (sorted order)
        list1.insertSorted(1);
        list1.insertSorted(3);
        list1.insertSorted(5);
        list1.insertSorted(7);

        // Insert elements into the second list (sorted order)
        list2.insertSorted(2);
        list2.insertSorted(3);
        list2.insertSorted(6);
        list2.insertSorted(7);
        list2.insertSorted(8);

        // Print both lists
        System.out.println("List 1:");
        list1.printList();

        System.out.println("List 2:");
        list2.printList();

        // Find and print the union of both lists
        twoSinglyListClass unionList = twoSinglyListClass.findUnion(list1, list2);
        System.out.println("Union of List 1 and List 2:");
        unionList.printList();
    }
}
