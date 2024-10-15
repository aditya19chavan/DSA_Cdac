package LinkedList;

import java.util.Scanner;



public class Dynamic_queue_main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Dynamic_queue_class obj = new Dynamic_queue_class();

		int size = sc.nextInt();

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
				System.out.println("Enter element");
				e = sc.nextInt();
				obj.Enqueue(e);
				break;

			case 2:
				obj.Dequeue();
				break;

			case 3:
				obj.print_queue();
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
