
/*A) Write a menu driven program for singly linked list-
-	To create linked list.
-	To display linked list
-	To search node in linked list.
-	Insert at last position*/

package Assignment4;

import java.util.*;

import LinkedList.Node;

public class Que1 {

	public class Node {
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;

		}

	}

	Node root;// linked list uses container ship-uses has a relation

	void create_list() {
		root =  null;// preparing with empty root and last
	}

	void insert(int data) {
		Node n = new Node(data);
		if (root == null) {
			root = n;// n becomes 1st so root
		} else {
			n.next = root;// 1
			root = n;// 2
		}
		System.out.println(root.data + " inserted");

	}

	public class Dnode {
		int data;
		Dnode left, right, last;

		Dnode(int data) {
			this.data = data;
			left = right = last = null;

		}
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
	
	
	void insert_after(int key, int new_data) {
		Node n = new Node(new_data);
		if (root == null)
			System.out.println("List Empty");
		else {
			Node t = root;
			while (t != null) {
				if (t.data == key)// match found
				{
					System.out.println(t.data + " found in list");
					n.next = t.next;// 1
					t.next = n;
					System.out.println(new_data + " inserted in list");
					break;
				}
				t = t.next;
			}
			if (t == null)// not found
				System.out.println(key + " not found in list");

		}
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
	
	
	
	public static void main(String args[]) {
		Que1 obj = new Que1();
		Scanner in = new Scanner(System.in);
		int ch, e, key;
		obj.create_list();// creating LinkedList
		do {
			System.out.println("\n1.Insert Right\n2.Print\n3.Search\n0.Exit :");
			ch = in.nextInt();
			switch (ch) {

			case 1:
				System.out.println("Enter element:");
				e = in.nextInt();
				obj.insert(e);
				System.out.println("Element Inserted");
				break;

			case 2:
				obj.print_list();
				break;
			case 3:
				 System.out.println("Enter element to insert before:");
                 e = in.nextInt();
                 System.out.println("Enter element to search:");
                 key = in.nextInt();
                 obj.insert_after(key,e);
                 System.out.println("Element Inserted");
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
