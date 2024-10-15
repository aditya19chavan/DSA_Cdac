package Queue;

public class Queue_class {
	private int Q[], maxsize, front,rear;

	public void create_Queue(int size) {
		maxsize = size; 
	    front = 0; 
	    rear = -1;   //initially no element so rear = -1
		Q = new int[size]; // create size

	}

	void  Enque(int e) {          //enque

		rear++;
		Q[rear] = e;
		System.out.println("Element" + e + "Inserted in queue:");

	}

	boolean is_Full() {           //check is full
		if (rear == maxsize - 1)
			return true;
		else
			return false;
	}

	int Dequeue() {                   //Deque
		int temp = Q[front];
		front++;
		return (temp);
		}

	boolean is_Empty() {                //check it is empty
		if (front > rear)                 
			return true;
		else
			return false;
	}

	
	void print_Queue() {
		System.out.println("Queue has");
		for (int i = front; i <=rear; i++) {
			System.out.println(Q[i]+"---");
		}
	}

}
