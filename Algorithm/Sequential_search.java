package Algorithm;

public class Sequential_search {

    // Method to perform sequential search
    int sequential_search(int a[], int key) {
        for (int i = 0; i < a.length; i++) {
            if (key == a[i]) {
                return i; // Return the index if the key is found
            }
        }
        return -1; // Return -1 if the key is not found
    }
    
    
    
    
    

    public static void main(String args[]) {
        int a[] = { 77, 11, 22, 33, 99, 44, 88, 55, 66 };
        
        int key = 33; // Key to search for
        Sequential_search searcher = new Sequential_search(); // Create an instance of SequentialSearch
        int r = searcher.sequential_search(a, key); // Call the sequential_search method
        
        // Check the result and print appropriate message
        if (r == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index: " + r); // Print the index of the found key
        }
    }
}