package Assignment2;

import java.util.*;
import Assignment2.Node;


public class Que_A {
	private Node root;

	void create_Tree() {
		root = null;
	}

	void insert(Node r, Node n)
	
	{
		if (root == null)
			root = n;
		else {
			if (n.data < r.data)
			{
				if (r.left == null)
				{
					r.left = n;
					System.out.println(n.data + " inserted");
				} else
					insert(r.left, n);
			} else
			{
				if (r.right == null)// empty left
				{
					r.right = n;
					System.out.println(n.data + " inserted");
				} else
					insert(r.right, n);// recursion call

			}

		}

	}

	void preorder(Node r) {
		if (r != null) {// PLR
			System.out.print(r.data + ",");// P
			preorder(r.left);// L
			preorder(r.right);// R
		}
	}

	void postorder(Node r) {
		if (r != null) {// LRP
			postorder(r.left);// L
			postorder(r.right);// R
			System.out.print(r.data + ",");// P

		}
	}

	Node Que_A() { 
		return root;
	}

	public static void main(String args[]) {
		Que_A obj = new Que_A();
		Scanner in = new Scanner(System.in);
		obj.create_Tree();
		Node x = new Node(10);
		obj.insert(obj.get_root(), new Node(10));
		obj.insert(obj.get_root(), new Node(30));
		obj.insert(obj.get_root(), new Node(20));
		obj.insert(obj.get_root(), new Node(5));
		obj.insert(obj.get_root(), new Node(15));
		System.out.println("Tree has:");
		int ch;

		do {
			System.out.println("\n1.preorder\n2.postorder\n0.Exit :");
			ch = in.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Pre order");
				obj.preorder(obj.root);
				break;

			case 2:
				System.out.println("Postorder is");
				obj.postorder(obj.root);

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

	private Node get_root() {
		
		return null;
	}

}
