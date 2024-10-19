package Assignment2;

import Assignment2.Node;

public class Que_C {
	public class Tree_class {

		private Node root;

		void create_Tree() {
			root = null;
		}

		void insert(Node r, Node n) {
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

		void inorder(Node r) {
			if (r != null) {// LPR
				inorder(r.left);// L
				System.out.print(r.data + ",");// P
				inorder(r.right);// R
			}
		}

		Node get_root() {
			return root;
		}

		public static void main(String args[]) {
			Que_C obj = new Que_C();
			obj.create_Tree();
			Node x = new Node(10);
			obj.insert(obj.get_root(), new Node(10));
			obj.insert(obj.get_root(), new Node(30));
			obj.insert(obj.get_root(), new Node(20));
			obj.insert(obj.get_root(), new Node(5));
			obj.insert(obj.get_root(), new Node(15));
			System.out.println("Tree has n integers:");
			obj.inorder(obj.root);

		}

	}
}
