package Assignment3;
import java.util.*;
public class Que3 {


	
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
		   
		   public class Dnode {
				int data;
				Dnode left, right,last;

				Dnode(int data) {
					this.data = data;
					left = right=last = null;
					
					
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

	
public static void main(String args[]) {
	Que3 obj = new Que3();
	Scanner in = new Scanner(System.in);
	int ch, e, key;
	obj.create_list();// creating LinkedList
	do {
		System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left:\n4.Delete right\n5.Print\n0.Exit :");
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
			obj.delete_left();
			break;

		case 4:
			obj.delete_right();
			break;
		case 5:
			obj.print_list();
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
