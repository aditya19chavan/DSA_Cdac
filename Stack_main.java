package stack;

import java.util.Scanner;

public class Stack_main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    	Stack_class obj = new Stack_class();
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        obj.createtwo_stacks(size);
        int ch,e;

        do{
            System.out.println("Menu:");
            System.out.println("1. Push to Stack 1");
            System.out.println("2. Pop from Stack 1");
            System.out.println("3. Peek at Stack 1");
            System.out.println("4. Check if Stack 1 is empty");
            System.out.println("5. Push to Stack 2");
            System.out.println("6. Pop from Stack 2");
            System.out.println("7. Peek at Stack 2");
            System.out.println("8. Check if Stack 2 is empty");
            System.out.println("9. Print Stack 1");
            System.out.println("10. Print Stack 2");
            System.out.println("11. Exit");
            System.out.println("Enter your choice:");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter an element to push to Stack 1:");
                     e = sc.nextInt();
                    obj.push1(e);
                    break;
                case 2:
                    obj.pop1();
                    break;
                case 3:
                    System.out.println("Top element of Stack 1: " + obj.peek1());
                    break;
                case 4:
                    if (obj.is_Empty2()) {
                        System.out.println("Stack 1 is empty");
                    } else {
                        System.out.println("Stack 1 is not empty");
                    }
                    break;
                case 5:
                    System.out.println("Enter an element to push to Stack 2:");
                    e = sc.nextInt();
                    obj.push2(e);
                    break;
                case 6:
                    obj.pop2();
                    break;
                case 7:
                    System.out.println("Top element of Stack 2: " + obj.peek2());
                    break;
                case 8:
                    if (obj.is_Empty2()) {
                        System.out.println("Stack 2 is empty");
                    } else {
                        System.out.println("Stack 2 is not empty");
                    }
                    break;
                case 9:
                    obj.print_stack1();
                    break;
                case 10:
                    obj.print_stack2() ;
                    break;
                case 11:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }while (ch != 0);
    }
}