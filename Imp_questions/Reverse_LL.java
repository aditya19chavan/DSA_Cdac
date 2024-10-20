
//reverse the linked list

package Imp_questions;



public class Reverse_LL {
	Node root;
	Stack_class obj = new Stack_class();

	void create_list() {
		root = null;// preparing with empty roo
	}

	 void reverse() {
	        if (root == null) {
	            System.out.println("List Empty");
	            return;
	        }

	        // Create stack with the current length of the list
	        int length = 0;
	        Node t = root;
	        while (t != null) {
	            length++;
	            t = t.next;
	        }

	        obj.create_stack(length);

	        // Push all elements onto the stack
	        t = root;
	        while (t != null) {
	            obj.push(t.data);
	            t = t.next;
	        }

	        // Write back the reversed data into the linked list
	        t = root;
	        while (t != null) {
	            t.data = obj.pop();
	            t = t.next;
	        }
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

	public static void main(String[] args) {
		Reverse_LL list1 = new Reverse_LL();

		list1.create_list();

		list1.insert_right(10);
		list1.insert_right(20);
		list1.insert_right(50);
		list1.insert_right(60);
		list1.insert_right(80);
		System.out.println("List has : ");
		list1.print_list();
		
		list1.reverse();
		System.out.println("Reverse list is: ");
		list1.print_list();

	}

}
