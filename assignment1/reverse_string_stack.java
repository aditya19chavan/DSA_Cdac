package assignment1;

import java.util.Scanner;

public class reverse_string_stack {



		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Que1 obj = new Que1();
			System.out.println("Enter word");
			String word = sc.next();
			obj.create_stack(word.length());
			
			for(int i=0;i<word.length();i++)
				obj.push(word.charAt(i));
				
		 String r_word = " ";
			
				while(obj.is_Empty()!=true)
					r_word+=obj.pop();
				
				System.out.println("Reverse is:"+r_word);
				}

		}
