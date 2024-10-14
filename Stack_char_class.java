package Stack;



public class Stack_char_class {
	private int  maxsize, tos;
	private char[] stack;

	public void create_stack(int i) {
		tos = -1; // initialize tos
		stack = new char[i]; // create size
		maxsize = i; // maximum size
	}

	void push(char e) {          //push 

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
