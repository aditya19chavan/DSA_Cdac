package LinkedList;

import java.util.Scanner;

import Queue.Queue_class;

public class LinkedList_Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		inked_List_class obj = new inked_List_class();
	      obj.create_list();//creating LinkedList
		int ch, e;

		  do {
	            System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left:\n4.Delete right\n5.Print\n6.Search element in List\n7.Delete element\n8.Insert after\n9.Insert before\n0.Exit :");
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
	                case 6:
	                    System.out.println("Enter element:");
	                    e = in.nextInt();
	                    obj.search_list(e);
	                    break;
	                case 7:
	                    System.out.println("Enter element:");
	                    e = in.nextInt();
	                    obj.delete_element(e);
	                    break;
	                case 8:
	                    System.out.println("Enter element to insert after:");
	                    e = in.nextInt();
	                    System.out.println("Enter element to search:");
	                    int key = in.nextInt();
	                    obj.insert_after(key,e);
	                    System.out.println("Element Inserted");
	                    break;
	                    
	                case 9:
	                    System.out.println("Enter element to insert before:");
	                    e = in.nextInt();
	                    System.out.println("Enter element to search:");
	                    key = in.nextInt();
	                    obj.insert_before(key,e);
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
