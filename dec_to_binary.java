package Stack;

public class dec_to_binary {
	private int stack[], maxsize, tos;

	public void create_stack(int size) {
		tos = -1; // initialize tos
		stack = new int[size]; // create size
		maxsize = size; // maximum size
	}

	void push(int e) {          //push 

		tos++;
		stack[tos] = e;
		System.out.println("Element" + e + "Pushed:");

	}

	boolean is_Full() {           //check is full
		if (tos == maxsize - 1)
			return true;
		else
			return false;
	}

	int pop() {                           //pop
		int temp = stack[tos];
		tos--;
		return (temp);
	}

	boolean is_Empty() {                //check it is empty
		if (tos == -1)
			return true;
		else
			return false;
	}

	int peek() {                      //show 
		return (stack[tos]);
	}

	void print_Stack() {
		for (int i = tos; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}

}

