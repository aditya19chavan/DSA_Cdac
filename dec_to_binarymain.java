package Stack;

import java.util.Scanner;

public class dec_to_binarymain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		dec_to_binary obj = new dec_to_binary();

		

		System.out.println("Enter the  number");
		int n = sc.nextInt();

		obj.create_stack(64);
		while (n > 0) {
			int rem = n % 2;
			n = n / 2;
			obj.push(rem);
		}

		System.out.println("Binary is:");
		while (obj.is_Empty() != true)
			System.out.println(obj.pop());

	}

}
