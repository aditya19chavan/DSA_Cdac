package Imp_questions;

import java.util.Scanner;

import LinkedList.inked_List_class;

public class LinkedList_main {

	public static void main(String[] args) {
		
			Scanner in = new Scanner(System.in);
			LinkedList obj = new LinkedList();
		      obj.create_list();//creating LinkedList
			int ch, e;

			  do {
		            System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left:\n4.Delete right\n5.Print\n6.Search element in List\n7.Delete element\n8.Insert after\n9.Insert before\n10.Sort list\n0.Exit :");
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
		                    
		                case 10:
		                 
		                    System.out.println("Sorted list:");
		                    obj.print_list(); // Display the sorted list
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


