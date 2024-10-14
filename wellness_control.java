package Stack;
import java.util.Scanner;

public class wellness_control {

	    static boolean check_wellness(String word)
	    {
	    	Stack_char_class obj = new Stack_char_class();//object created
	        obj.create_stack(word.length());
	        for(int index=0;index<word.length();index++)
	        {
	            if(word.charAt(index)=='{')
	                obj.push('{');
	            else if (word.charAt(index)=='}')
	            {
	                if(obj.is_Empty()!=true)
	                {
	                    char g=(char) obj.pop();
	                }
	                else
	                    return false;
	            }
	        }
	        return obj.is_Empty();
	    }
	    public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter data:");
	        String word=in.next();//read word from user
	        System.out.println(word+"is balanced:"+check_wellness(word));
	    }
	}
