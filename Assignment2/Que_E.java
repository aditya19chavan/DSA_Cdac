
/* E)Write a  program to create a singly Link list and display its alternative nodes. 
(start displaying from first node)	*/

package Assignment2;

import java.util.Scanner;

import LinkedList.Node;


public class Que_E {
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
	
	
	
	void print_alternate_list() {
		if(root==null)
			System.out.println("List is Empty");
		else {
			Node t=root;
		while(t!=null) {
			System.out.print("|" + t.data + "|->");
			t=t.next.next;
		}
	}
	}

	public static void main(String args[]) {

		Que_E obj = new Que_E();
		Scanner in = new Scanner(System.in);

		obj.create_list();// creating LinkedList
		int ch, e;

		do {
			System.out.println("\n1.Insert Left\n2.Print\n3.Print-Alternate\n0.Exit :");
			ch = in.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter element:");
				e = in.nextInt();
				obj.insert_left(e);
				System.out.println("Element Inserted");
				break;

			case 2:
				System.out.println("Elements Are:");
				obj.print_list();
				
				break;
				
			case 3:
				System.out.println("Elements Are:");
				obj.print_alternate_list();
				
				break;

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
