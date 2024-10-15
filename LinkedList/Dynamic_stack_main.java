package LinkedList;

import java.util.Scanner;

public class Dynamic_stack_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dynamic_stack_class obj = new Dynamic_stack_class();
		System.out.println("Enter the size of array");

		obj.create_stack();
		int ch, e;

		do {
			System.out.println("Stack Menu");
			System.out.println("-----------");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Print all elemets");
			System.out.println("0.Exit");
			System.out.println("-----------");
			System.out.println("Choice");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				e = sc.nextInt();
				obj.push(e);

				break;

			case 2:

				obj.pop();

				break;

			case 3:

				obj.peek();

			case 4:
				obj.print_stack();
			case 0:
				System.out.println("Thanks for using code");
				break;
			default:
				System.out.println("Wrong option selsected:");
				break;
			}

		} while (ch != 0);

	}

}
