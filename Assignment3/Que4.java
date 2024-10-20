  /*Write a  program to read n integers and create two lists such that all positive numbers are in one list 
  and negative numbers are in another list. Display both the lists.

*/


package Assignment3;

public class Que4 {
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

	static Que4 merger_list(Node r1, Node r2) {
		Node i, j;
	//	Node root3;
		Que4 obj3 = new Que4();
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
		Que4 list1 = new Que4();

		list1.create_list();

		list1.insert_right(10);
		list1.insert_right(20);
		list1.insert_right(50);
		list1.insert_right(60);
		list1.insert_right(80);
		System.out.println("Sorted Linked list 1: ");
		list1.print_list();

		Que4 list2 = new Que4();
		list2.create_list();
		list2.insert_right(-12);
		list2.insert_right(-24);
		list2.insert_right(-11);
		list2.insert_right(-34);
		list2.insert_right(-25);

		System.out.println("Sorted Linked list 2: ");
		list2.print_list();

		Que4 list3 = new Que4();
		list3 = merger_list(list1.root, list2.root);

		System.out.println("Merged list is");
		list3.print_list();
	}
}

