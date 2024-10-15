package Queue;

public class Priority_queue {
	private int Q[], maxsize, front,rear;

	public void create_Queue(int size) {
		maxsize = size; 
	    front = 0; 
	    rear = -1;   //initially no element so rear = -1
		Q = new int[size]; // create size

	}

	 void Enqueue(int e) {                                  
	        rear++;
	        Q[rear]=e;
	        System.out.println("Element " + e + " Inserted in Queue");
	        for(int i=front;i<rear;i++)
	        {
	            for(int j=front;j<rear;j++)
	            {
	               // if(Q[j]>Q[j+1])//ASCENDING
	                	
	                    if(Q[j]<Q[j+1])//DESCENDING
	                {
	                    int temp=Q[j];
	                    Q[j]=Q[j+1];
	                    Q[j+1]=temp;
	                }
	            }
	        }
	    }

	boolean is_Full() {           //check is full
		if (rear == maxsize - 1)
			return true;
		else
			return false;
	}

	   int Dequeue() {
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
			System.out.print(Q[i]+"---");
		}
	}
}
