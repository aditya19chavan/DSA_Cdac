
/*A data structure that follows the Last-In-First-Out (LIFO) principle, meaning the last element added is the first one to be removed.  
Efficiently manage two stacks within a single array, ensuring optimal space utilization and avoiding overflows.
Provide a user-friendly interface with options to perform various operations on the stacks, such as pushing, popping, peeking, checking emptiness, and displaying elements.
Example
  Enter the capacity of the array: 5 
 Menu:
1. Push to Stack 1 
2. Pop from Stack 1 
3. Peek at Stack 1 
4. Check if Stack 1 is empty 
5. Push to Stack 2 
6. Pop from Stack 2 
7. Peek at Stack 2 
8. Check if Stack 2 is empty 
9. Exit
*/

package stack;

public class Stack_class {
	private int stack[], maxsize, tos1, tos2;

	public void createtwo_stacks(int size) {
		stack = new int[size];
		tos1 = -1;
		tos2 = size;
	}

	// pushing element to stack 1
	public void push1(int e) {
		if (tos1 < tos2 - 1) {
			stack[++tos1] = e;
			System.out.println("Element " + e + " pushed to stack 1");
		} else {
			System.out.println("Stack 2 is full");
		}
	}

	// pop
	public int pop1() {
		if(tos1>=0) {
			int temp=stack[--tos1];
			System.out.println("Element " + temp + " popped from stack 1");
		return temp;
		}else {
			System.out.println("stack is empty");
			return -1;
		}
	}

    public int peek1() {   //peek1
        if (tos1 >= 0) {
            return stack[tos1];
        } else {
            System.out.println("Stack 1 is empty");
            return -1;
        }
    }
	
	// Push element to stack 2
	public void push2(int e) {
		if (tos1 < tos2 - 1) {
			stack[tos2--] = e;
			System.out.println("Element " + e + " pushed to stack 2");
		} else {
			System.out.println("Stack 2 is full");
		}
	}

	// Pop element from stack 2
	public int pop2() {
		if (tos2 < maxsize) {
			int temp = stack[tos2++];
			System.out.println("Element " + temp + " popped from stack 2");
			return temp;
		} else {
			System.out.println("Stack 2 is empty");
			return -1;
		}
	}
public int peek2() {
	if(tos2<maxsize) {
		return stack[tos2];
	}else {
		System.out.println("stack 2 is empty");
		return -1;
	}
}

public boolean is_Empty2() {
	return tos2==maxsize;
}

public void print_stack1() {       //printing elements of stack 1
	if(tos1>=0) {
		System.out.println("Elements of stack 1");
	for(int i=tos1;i>=0;i--) {
		System.out.println(stack[i]);
	}
}else {
	System.out.println("stack 1 is empty");
}
}

public void print_stack2() {    //printing elements of stack 2
    if (tos2 < maxsize) {
        System.out.println("Elements of stack 2:");
        for (int i = tos2; i < maxsize; i++) {
            System.out.println(stack[i]);
        }
    } else {
        System.out.println("Stack 2 is empty");
    }
}

}
