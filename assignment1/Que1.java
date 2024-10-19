package assignment1;

public class Que1 {
    private int maxsize, tos;
    private char[] stack;

    public void create_stack(int i) {
        tos = -1;
        stack = new char[i];
        maxsize = i;
    }

    void push(char e) {
     
            tos++;
            stack[tos] = e;
       
            System.out.println("Element " +e+" pushed");
        }
 

    boolean is_Full() {
        return tos == maxsize - 1;
    }

    char pop() {
        if (!is_Empty()) { 
            char temp = stack[tos];
            tos--;
            return temp;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
           
        }
		return 0;
    }

    boolean is_Empty() {
        return tos == -1;
    }



    void print_stack() {
        for (int i = tos; i >= 0; i--)
            System.out.println(stack[i]);
    }
}