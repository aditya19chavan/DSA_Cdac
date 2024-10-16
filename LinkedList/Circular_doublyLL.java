package LinkedList;

public class Circular_doublyLL {
	Dnode root;// linked list uses container ship-uses has a relation

	void create_list() {
		root = null;// preparing with empty root
	}

	void insert_left(int data) {
		Dnode n = new Dnode(data);
		if (root == null) {
			root = n;// n becomes 1st so root
		} else {
			n.last = root;
			n.right = root;// 1
			root.left = n; // 2
			root = n;// 3
			root.last =n;
            root.right=null;
			root.left = null;
			root.right = root;

		}
		System.out.println(root.data + " inserted");

	}

	void insert_right(int data) {
		Dnode n = new Dnode(data);
		if (root == null)
			root = n;// n becomes 1st so root=
		else {
			Dnode t = root;
			root.left=t;
			while (t.right != null) {
				t = t.right;
			}
			
			t.right = n;
			n.left = t;
		
			
		}
		System.out.println(root.data + " inserted");

	}

	void delete_left() {
		if (root == null) {
			System.out.println("Empty List");
		} else {
			Dnode t;
			t = root;// 1
			root = root.right;// 2
			root.left = null;
			root.last=root;
			t.right=root;
			root.left=t;
			
			System.out.println(t.data + " deleted");
		}
	}
	
	
	void delete_right() {
		if (root == null)
			System.out.println("Empty List");
		else {
			Dnode t, t2;
			t = root;// 1
			while (t.right != null)
				t = t.right;

			if (t == root)// single node
 			root = null;// reset root as only node left
			else {
				t2 = t.left;// 3
				t2.right = root;// 4
				root.right=t2;
			}
			System.out.println(t.data + " deleted");
		}
	}
	
	
	void print_list() {
		if (root == null)
			System.out.println("List Empty");
		else {
			Dnode t = root;
		
				System.out.print("<-|" + t.data + "|->");
				t = t.right;
			
			
		}
	}
	

}
