package assignment1;
import java.util.Scanner;

import Queue.Queue_class;

public class Que2_main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Que2_class obj = new Que2_class();
	      obj.create_list();
	       System.out.println("Enter element:");
           e = in.nextInt();
           obj.insert_left(e);
           System.out.println("Element Inserted");

}
