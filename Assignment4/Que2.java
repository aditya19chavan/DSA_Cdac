
//B) Write a  program to create doubly link list and display nodes having odd value.

package Assignment4;

import java.util.Scanner;

import LinkedList.Dnode;
import LinkedList.DoublyLL_class;

public class Que2 {
	Dnode root;// linked list uses container ship-uses has a relation

	void create_list() {
		root = null;// preparing with empty root
	}

	public class Dnode {
		int data;
		Dnode left, right, last;

		Dnode(int data) {
			this.data = data;
			left = right = last = null;

		}
	}

	void insert_left(int data) {
		Dnode n = new Dnode(data);
		if (root == null) {
			root = n;// n becomes 1st so root
		} else {
			n.right = root;// 1
			root.left = n; // 2
			root = n;// 3

			root.left = null;
		}
		System.out.println(root.data + " inserted");

	}

	void insert_right(int data) {
		Dnode n = new Dnode(data);
		if (root == null)
			root = n;// n becomes 1st so root=
		else {
			Dnode t = root;
			while (t.right != null) {
				t = t.right;
			}
			t.right = n;
			n.left = t;
		}
		System.out.println(root.data + " inserted");

	}

	void print_list() {
		if (root == null)
			System.out.println("List Empty");
		else {
			Dnode t = root;
			while (t != null) {
				System.out.print("<-|" + t.data + "|->");
				t = t.right;
			}
		}
	}

	void count_odd() {
		if (root == null) {
			System.out.println("List Empty");
			return;
		}
		Dnode t = root;
		int count = 0;
		while (t != null) {
			if (t.data % 2 != 0) {
				System.out.println( "<-|" + t.data + "|->" );
				count++;
			}
		
			t = t.right;
			
		}
		System.out.println("Number of odd numbers: " + count);
	}

	public static void main(String[] args) {

		Que2 obj = new Que2();
		Scanner in = new Scanner(System.in);
		int ch, e, key;
		obj.create_list();// creating LinkedList
		do {
			System.out.println(
					"\n1.Insert Left\n2.Insert Right\n3.Print\n4.count_odd\n0.Exit :");
			ch = in.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter element:");
				e = in.nextInt();
				obj.insert_left(e);
				System.out.println("Element Inserted");
				break;

			case 2:
				System.out.println("Enter element:");
				e = in.nextInt();
				obj.insert_right(e);
				System.out.println("Element Inserted");
				break;
			
			case 3:
				System.out.println("Elemets in list are:");
				obj.print_list();
				break;
				
				
				
			case 4:
				System.out.println("odd elemets in list are:");
			
				obj.count_odd();

			case 0:
				System.out.println("Exiting....");
				break;

			default:
				System.out.println("Wrong option selected");
				break;

			}

		} while (ch != 0);
	}
}
