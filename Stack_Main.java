package Stack;

import java.util.Scanner;

public class Stack_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack_Class obj = new Stack_Class();
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		obj.create_stack(size);
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
				if (obj.is_Full() != true) {// not full {

					System.out.println("Enter a number: ");
					e = sc.nextInt();
					obj.push(e);
				} else {
					System.out.println("Stack Full ");
				}
				break;

			case 2:
				if (obj.is_Empty() != true) {// not empty
					System.out.println("Element popped is: " + obj.pop());
				} else {
					System.out.println("stack is empty");
				}
				break;

			case 3:
				if (obj.is_Empty() != true) {
					System.out.println("Peek element is " + obj.peek());
				} else {
					System.out.println("Stack is empty");
				}

			case 4:
				if (obj.is_Empty() != true) {
					System.out.println("Elements are: ");
					obj.print_Stack();
				} else {
					System.out.println("Stack is empty");
				}
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
