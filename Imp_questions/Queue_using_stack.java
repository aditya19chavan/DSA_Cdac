package Imp_questions;
import java.util.Scanner;

import Stack.Stack_Class;


public class Queue_using_stack {

	Stack_Class s1,s2;
	void create_Queue(int size)
	{
		Stack_Class s1=new Stack_Class();
		s1.create_stack(size);
		s2= new Stack_Class();
		s2.create_stack(size);
	}
	

}	