
/*D) Write a program which accept the string and reverse each word of the string using Static implementation of stack.
Example: Input - This is an input string
   Output - sihTsinatupnignirts.*/

package Assignment4;

import java.util.Scanner;

import Stack.Stack_char_class;

public class Que4 {
	 private int maxsize, tos;
	    private char[] stack;

	    public void create_stack(int i) {
	        tos = -1; // initialize tos
	        stack = new char[i]; // create size
	        maxsize = i; // maximum size
	    }

	    void push(char e) { // push 
	        tos++;
	        stack[tos] = e;
	    }

	    boolean is_Full() { // check if full
	        return tos == maxsize - 1;
	    }

	    char pop() { // pop
	        char temp = stack[tos];
	        tos--;
	        return temp;
	    }

	    boolean is_Empty() { // check if empty
	        return tos == -1;
	    }

	    int peek() { // show 
	        return stack[tos];
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String input = sc.nextLine(); // Read the entire line
	        String[] words = input.split(" "); // Split the input into words

	        StringBuilder reversedString = new StringBuilder(); // To store the final output

	        for (String word : words) {
	            Que4 obj = new Que4();
	            obj.create_stack(word.length());

	            for (int i = 0; i < word.length(); i++) // Push each character of the word onto the stack
	                obj.push(word.charAt(i));

	            // Pop each character to reverse the word
	            String r_word = "";
	            while (!obj.is_Empty()) // Continue until the stack is empty
	                r_word += obj.pop();

	            reversedString.append(r_word).append(" "); // Append the reversed word to the final output
	        }

	        System.out.println("Reversed string: " + reversedString.toString().trim()); // Print the final reversed string
	    }
	}
