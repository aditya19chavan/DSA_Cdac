package Assignment3;

/* Write a  program which accept the string and check whether the string is Palindrome or not using stack. 
 * (Use Static/Dynamic implementation of Stack)	*/
	import java.util.Scanner;

	class Dnode {
	    char data;
	    Dnode next;

	    Dnode(char data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class Stack {
	    private Dnode top;

	    public Stack() {
	        this.top = null;
	    }

	    public void push(char data) {
	        Dnode newNode = new Dnode(data);
	        newNode.next = top;
	        top = newNode;
	    }

	    public char pop() {
	        if (top == null) {
	            throw new IllegalStateException("Stack is empty");
	        }
	        char data = top.data;
	        top = top.next;
	        return data;
	    }

	    public boolean isEmpty() {
	        return top == null;
	    }
	}

	public class Que6 {
	    public static boolean isPalindrome(String str) {
	        Stack stack = new Stack();
	        int length = str.length();

	        // Push all characters of the string onto the stack
	        for (int i = 0; i < length; i++) {
	            stack.push(str.charAt(i));
	        }

	        // Pop characters from the stack and compare with the original string
	        for (int i = 0; i < length; i++) {
	            if (stack.pop() != str.charAt(i)) {
	                return false; // Not a palindrome
	            }
	        }
	        return true; // Is a palindrome
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        
	        if (isPalindrome(input)) {
	            System.out.println(input + " is a palindrome.");
	        } else {
	            System.out.println(input + " is not a palindrome.");
	        }
	        
	        
	    }
	}

