
//merge two sorted lists;
//1 list to be created in sorted in sorted manner
//2 function will merge both into new linked list which is sorted

//implementation

//insert right-- will enter elements in sorted manner

//create 2 sorted list
//create merger method will take both inked lists by taking roots of both and returns root of 3rd merged list ref of coding merger method in merge sort

package Imp_questions;

public class merge_linkedlist {

	Node root;

	void create_list() {
		root = null;// preparing with empty root
	}

	void insert_right(int data) {
		Node n = new Node(data);
		if (root == null)
			root = n;// n becomes 1st so root=
		else {
			Node t = root;
			while (t.next != null) {
				t = t.next;
			}
			t.next = n;
		}
		System.out.println(data + " inserted");

	}

	void print_list() {
		if (root == null)
			System.out.println("List Empty");
		else {
			Node t = root;
			while (t != null) {
				System.out.print("|" + t.data + "|->");
				t = t.next;
			}
		}
	}

	static merge_linkedlist merger_list(Node r1, Node r2) {
		Node i, j;
	//	Node root3;
		merge_linkedlist obj3 = new merge_linkedlist();
		obj3.create_list();
		i = r1;
		j = r2;

		// compare and copy in order
		while (i != null && j != null) {
			if (i.data < j.data) {
				obj3.insert_right(i.data);
				i = i.next;
			} else {
				obj3.insert_right(j.data);
				j = j.next;
			}

		}
		// copy leftover
		while (i != null) {
			obj3.insert_right(i.data);
			i = i.next;
		}
		while (j != null) {
			obj3.insert_right(j.data);
			j = j.next;
		}
		return obj3;
	}

	public static void main(String[] args) {
		merge_linkedlist list1 = new merge_linkedlist();

		list1.create_list();

		list1.insert_right(10);
		list1.insert_right(20);
		list1.insert_right(50);
		list1.insert_right(60);
		list1.insert_right(80);
		System.out.println("Sorted Linked list 1: ");
		list1.print_list();

		merge_linkedlist list2 = new merge_linkedlist();
		list2.create_list();
		list2.insert_right(12);
		list2.insert_right(24);
		list2.insert_right(11);
		list2.insert_right(34);
		list2.insert_right(25);

		System.out.println("Sorted Linked list 2: ");
		list2.print_list();

		merge_linkedlist list3 = new merge_linkedlist();
		list3 = merger_list(list1.root, list2.root);

		System.out.println("Merged list is");
		list3.print_list();
	}
}
