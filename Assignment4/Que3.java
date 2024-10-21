
/*C)Write a  program to accept names from the user and sort in alphabetical order using bubble sort 
-	Accept n name									
-	Bubble sort Function							
-	Display	*/

package Assignment4;

import java.util.Scanner;

public class Que3{

	static void bubble_sort(String str[]) {
		int i, j;
		String temp;
		for (j = 0; j < str.length; j++) {
			for (i = j + 1; i < str.length; i++) {
				if (str[i].compareTo(str[j]) < 0) {
					temp = str[j];
					str[j] = str[i];
					str[i] = temp;
				}
			}
			System.out.println(str[j]);
		}
	}

	public static void main(String args[]) {
		String str[] = { "Ajeet", "Steve", "Rick", "Becky", "Mohan" };
		bubble_sort(str);

	}
}