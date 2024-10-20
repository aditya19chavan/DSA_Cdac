package Imp_questions;

public class Stack_class {
	private int stack[], maxsize, tos;

	public void create_stack(int size) {
		tos = -1; // initialize tos
		stack = new int[size]; // create size
		maxsize = size; // maximum size
	}

	public void push(int e) {          //push 

		tos++;
		stack[tos] = e;
		System.out.println("Element" + e + "Pushed:");

	}

	public boolean is_Full() {           //check is full
		if (tos == maxsize - 1)
			return true;
		else
			return false;
	}

	public int pop() {                           //pop
		int temp = stack[tos];
		tos--;
		return (temp);
	}

	public boolean is_Empty() {                //check it is empty
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

