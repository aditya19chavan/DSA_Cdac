package Queue;

public class Queue_class_circular {
	private int Q[], maxsize, front,rear,count=0;

	public void create_Queue(int size) {
		maxsize = size; 
	    front = 0; 
	    rear = -1;   //initially no element so rear = -1
		Q = new int[size]; // create size

	}

	void  Enque(int e) {          //enque
rear=(rear+1)%maxsize;
count++;
	Q[rear] = e;
	System.out.println("Element" + e + "Inserted in queue:");
}
		

	

	boolean is_Full() {           //check is full
		if (count == maxsize )
			return true;
		else
			return false;
	}

	int Dequeue() {                   //Deque
		int temp = Q[front];
		front=(front+1)%maxsize;
		count--;
		return (temp);
		}

	boolean is_Empty() {                //check it is empty
		if (count==0)                 
			return true;
		else
			return false;
	}

	
	void print_Queue() {
		int i,c;
		i=front;
		c=0;
		System.out.println("Queue has");
		while(c<count) {
			System.out.println(Q[i]);
			i=(i+1)%maxsize;
			c++;
		}
	
		}
	}

