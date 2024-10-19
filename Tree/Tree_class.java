package Tree;

public class Tree_class {
   
	private Node root;

	void create_Tree() {
		root = null;
	}

	void insert(Node r, Node n)// in bst manner //r is root , n is new node
	{
		if (root == null)
			root = n;
		else {
			if (n.data < r.data)// if less to left
			{
				if (r.left == null)// empty left
				{
					r.left = n;
					System.out.println(n.data + " inserted");
				} else
					insert(r.left, n);// recursion call
			} else// if equal or greater than to right
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
	Node get_root() {        //get will take the root outside when the node is private
		return root;
	}

	public static void main(String args[]) {
		Tree_class obj = new Tree_class();
		obj.create_Tree();
		Node x = new Node(10);
		obj.insert(obj.get_root(), new Node(10));
		obj.insert(obj.get_root(), new Node(30));
		obj.insert(obj.get_root(), new Node(20));
		obj.insert(obj.get_root(), new Node(5));
		obj.insert(obj.get_root(), new Node(15));
		System.out.println("Tree has:");
		obj.inorder(obj.root);
		
		
	}

}
