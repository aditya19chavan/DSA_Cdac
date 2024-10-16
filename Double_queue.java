class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Queue class to implement two queues in a single array
class Queue {
    Node head1; // front of queue 1
    Node head2; // front of queue 2
    Node tail; // rear of the array
    int size; 

    public Queue() {
        head1 = null;
        head2 = null;
        tail = null;
        size = 0;
    }

    // Enqueue from queue 1
    public void enqueue1(int data) {
        Node newNode = new Node(data);
        if (head1 == null) {
            head1 = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Enqueue from queue 2
    public void enqueue2(int data) {
        Node newNode = new Node(data);
        if (head2 == null) {
            head2 = newNode;
            tail = newNode;
        } else {
            newNode.next = head2;
            head2 = newNode;
        }
        size++;
    }

    // Dequeue from queue 1
    public int dequeue1() {
        if (head1 == null) {
            System.out.println("Queue 1 is empty");
            return -1;
        }
        int data = head1.data;
        head1 = head1.next;
        size--;
        return data;
    }

    // Dequeue from queue 2
    public int dequeue2() {
        if (head2 == null) {
            System.out.println("Queue 2 is empty");
            return -1;
        }
        int data = head2.data;
        head2 = head2.next;
        size--;
        return data;
    }

    // Print queue 1
    public void printQueue1() {
        Node temp = head1;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Print queue 2
    public void printQueue2() {
        Node temp = head2;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        while (true) {
            System.out.println("1. Enqueue from queue 1");
            System.out.println("2. Enqueue from queue 2");
            System.out.println("3. Dequeue from queue 1");
            System.out.println("4. Dequeue from queue 2");
            System.out.println("5. Print queue 1");
            System.out.println("6. Print queue 2");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int ch = Integer.parseInt(System.console().readLine());
            switch (ch) {
                case 1:
                    System.out.print("Enter data to enqueue in queue 1: ");
                    int data1 = Integer.parseInt(System.console().readLine());
                    queue.enqueue1(data1);
                    break;
                case 2:
                    System.out.print("Enter data to enqueue in queue 2: ");
                    int data2 = Integer.parseInt(System.console().readLine());
                    queue.enqueue2(data2);
                    break;
                case 3:
                    int dequeuedData1 = queue.dequeue1();
                    if (dequeuedData1 != -1) {
                        System.out.println("Dequeued data from queue 1: " + dequeuedData1);
                    }
                    break;
                case 4:
                    int dequeuedData2 = queue.dequeue2();
                    if (dequeuedData2 != -1) {
                        System.out.println("Dequeued data from queue 2: " + dequeuedData2);
                    }
                    break;
                case 5:
                    System.out.println("Queue 1: ");
                    queue.printQueue1();
                    break;
                case 6:
                    System.out.println("Queue 2: ");
                    queue.printQueue2();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
