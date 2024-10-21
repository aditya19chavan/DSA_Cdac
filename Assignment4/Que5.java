
/*E) Write a  program to accept the names of cities and store them in array.
 *  Accept the city name from user and use linear search algorithm to check whether the city is present in array or not.	*/

package Assignment4;



public class Que5 {

    // Method to perform sequential search
    public int sequential_search(String[] str, String key) {
        for (int i = 0; i < str.length; i++) {
            if (key == str[i]) {
                return i; // Return the index if the key is found
            }
        }
        return -1; // Return -1 if the key is not found
    }
    
    
    
    
    

    public static void main(String args[]) {
        String[] str = {"Pune","Mumbai","Delhi","Chennai"};
        
        String key = "Pune"; // Key to search for
        Que5  obj = new Que5(); // Create an instance of SequentialSearch
        int r = obj.sequential_search(str, key); // Call the sequential_search method
        
        // Check the result and print appropriate message
        if (r == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index: " + r); // Print the index of the found key
        }
    }
}
