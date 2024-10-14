package Stack;

import java.util.Scanner;

public class String_reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack_char_class obj = new Stack_char_class();
		System.out.println("Enter word");
		String word = sc.next();
		obj.create_stack(word.length());
		
		for(int i=0;i<word.length();i++)//character by charater copy element to stack till all characters are over
			obj.push(word.charAt(i));
			
	 String r_word = " ";
		
			while(obj.is_Empty()!=true)//pop and copy each poped element to reverse string till stack over r_word+=obj.pop();
				 r_word+=obj.pop();
			System.out.println("Reverse is:"+r_word);//print reverse string 
			}

	}


