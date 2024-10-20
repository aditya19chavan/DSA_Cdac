
/*//using queue convert given binary data to decimal   1101  -> 13
  1] Read bit in Queue()
Enqueue(b)


2] Dequeue()
Dequeue() * 2^size-1*/

package Imp_questions;

import java.util.Scanner;

public class binaryTodecimal_Queue {

	private int Q[], maxsize, front, rear;

	public void create_Queue(int size) {
		maxsize = size;
		front = 0;
		rear = -1; // Initially no element, so rear = -1
		Q = new int[size]; // Create queue of given size
	}

	void Enqueue(int e) { // Enqueue
		if (!is_Full()) {
			rear++;
			Q[rear] = e;
			System.out.println("Element " + e + " inserted in queue.");
		} else {
			System.out.println("Queue is full. Cannot insert " + e);
		}
	}

	boolean is_Full() { // Check if full
		return rear == maxsize - 1;
	}

	int Dequeue() { // Dequeue
		if (!is_Empty()) {
			int temp = Q[front];
			front++;
			return temp;
		} else {
			throw new RuntimeException("Queue is empty. Cannot dequeue.");
		}
	}

	boolean is_Empty() { // Check if empty
		return front > rear;
	}

	void print_Queue() {
		System.out.println("Queue has:");
		for (int i = front; i <= rear; i++) {
			System.out.print(Q[i] + "---");
		}
		System.out.println();
	}

	public int binaryToDecimal() {
		int decimalValue = 0;
		int size = rear - front + 1;

		for (int i = 0; i < size; i++) {
			int bit = Dequeue();
			decimalValue += bit * Math.pow(2, size - 1 - i);
		}
		return decimalValue;
	}

	public static void main(String[] args) {
		binaryTodecimal_Queue obj = new binaryTodecimal_Queue();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the queue: ");
		int size = scanner.nextInt();
		obj.create_Queue(size);

		System.out.print("Enter binary digits (0 or 1) separated by spaces: ");
		for (int i = 0; i < size; i++) {
			int bit = scanner.nextInt();
			if (bit == 0 || bit == 1) {
				obj.Enqueue(bit);
			} else {
				System.out.println("Invalid input. ");

			}
		}

		int decimalValue = obj.binaryToDecimal();
		System.out.println("Decimal value: " + decimalValue);

	}
}
