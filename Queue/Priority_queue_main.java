package Queue;

import java.util.Scanner;

public class Priority_queue_main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Priority_queue obj = new Priority_queue ();
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		obj.create_Queue(size);
		int ch, e;

		do {
			System.out.println("Queue Menu");
			System.out.println("-----------");
			System.out.println("1.Enque");
			System.out.println("2.Deque");
		
			System.out.println("3.Print all elemets in queue");
			System.out.println("0.Exit");
			System.out.println("-----------");
			System.out.println("Choice");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				if (obj.is_Full() != true) {

					System.out.println("Enter a number: ");
					e = sc.nextInt();
					obj.Enqueue(e);
				} else {
					System.out.println("Queue Full ");
				}
				break;

			case 2:
				if (obj.is_Empty() != true) {// not empty
					System.out.println("Element dequed: " + obj.Dequeue());
				} else {
					System.out.println("stack is empty");
				}
				break;

			

			case 3:
				if (obj.is_Empty() != true) {
					System.out.println("Elements are: ");
					obj.print_Queue();
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
