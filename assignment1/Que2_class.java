package assignment1;

import LinkedList.Node;

public class Que2_class {
	
		Node root;// linked list uses container ship-uses has a relation

		void create_list() {
			root = null;// preparing with empty root
		}

		void insert_left(int data) {
			Node n = new Node(data);
			if (root == null) {
				root = n;// n becomes 1st so root
			} else {
				n.next = root;// 1
				root = n;// 2
			}
			System.out.println(root.data + " inserted");

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
			System.out.println(root.data + " inserted");

		}




void search_list(int data) {
	if (root == null)
		System.out.println("List Empty");
	else {
		Node t = root;
		while (t != null) {
			if (t.data == data)// match found
			{
				System.out.println(t.data + " found in list");
				break;
			}
			t = t.next;
		}
		if (t == null)// not found
			System.out.println(data + " not found in list");
	}

}
}