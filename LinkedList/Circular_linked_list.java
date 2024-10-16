package LinkedList;

public class Circular_linked_list {
	Node root, last;// linked list uses container ship-uses has a relation

	void create_list() {
		root = last = null;// preparing with empty root and last
	}

	void insert_left(int data) {
		Node n = new Node(data);
		if (root == null) {
			root = last = n;// n becomes 1st so root
			last.next = root;
		} else {
			n.next = root;// 1
			root = n;// 2
			last.next = root; // 3
		}
		System.out.println(data + " inserted");

	}

	void delete_left() {
		if (root == null) {
			System.out.println("Empty list");
		} else {
			Node t;
			t = root;// 1
			if (root == last)
				root = last = null;           
			else {
				root = root.next;// 2
				last.next = root; //3
			}
			System.out.println(t.data + " deleted");
		}
	}

	void insert_right(int data) {
		Node n = new Node(data);
		if (root == null) {
			root=last = n;// n becomes 1st so root=
		last.next = root;
	}
		else {
			last.next=n;//1
			last=n;//2
			last.next=root;//3
		}
		System.out.println(root.data + " inserted");

	}

	   void delete_right() {
           if (root == null)
               System.out.println("Empty List");
           else {
               Node t, t2;
               t = t2 = root;//1
               if(root==last)
                   root=last=null;
               else
               {
                   while (t != last) //2
                   {
                       t2 = t;
                       t = t.next;
                   }
                   last=t2;//3
                   last.next=root;//4
               }
               System.out.println(t.data + " deleted");
           }
       }

	  void print_list() {
          if (root == null)
              System.out.println("List Empty");
          else {
              Node t = root;
              do{
                  System.out.print("|" + t.data + "|->");
                  t = t.next;
              } while (t != root);
          }
      }

}
