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
			root.left=root;
			root.right=root;
			root.last=root;
		} else {
	                n.left=root.left;
			n.right = root;
			//root.left.right = n; 
			root.left = n;
			root.last =n;
           
			

		}
		System.out.println(root.data + " inserted");

	}

	void insert_right(int data) {
		Dnode n = new Dnode(data);
		if (root == null)
			root = n;// n becomes 1st so root
			root.left=root;
		        root.right=root;
		        root.last=root;
		else {
	                n.left=root;
			n.right=root.right;
			//root.right.left=n;
			root.right=n;
			root.last=n;
		
			
		}
		System.out.println(root.data + " inserted");

	}

	void delete_left() {
		if (root == null) {
			System.out.println("Empty List");
		} else {
			Dnode t =root.left;
			t = root;// 1
			root.left = t.left;// 2
			t.left.right=t.left;
			root.last=t.left;
			
			System.out.println(t.data + " deleted");
		}
	}
	
	
	void delete_right() {
		 if (root == null) {
            System.out.println("Empty List");
        } else {
            Dnode t = root.right;
            root.right = t.right;
            t.right.left = root;
            root.last = t.right;
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
			 } while (t != root);
            System.out.println();
        }
    }
 void print_reverse() {
        if (root == null) {
            System.out.println("List Empty");
        } else {
            Dnode t = root.last;
            do {
                System.out.print("<-|" + t.data + "|->");
                t = t.left;
            } while (t != root.last);
            System.out.println();
			
		}
	}
	

}
