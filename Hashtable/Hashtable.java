
/*Implement a hash table using linear probing with a table size of 10 and a hash function of x % 10 for indexing.
 *  The hash table should efficiently store and retrieve key-value pairs.*/

package Hashtable;

public class Hashtable {

	private int size;
	private int count;
	private Node[] table;

	public Hashtable(int size) {
		this.size = size;
		this.table = new Node[size];
		this.count = 0;

	}

	private int hashFunction(int key) {
		return key % size; // this will count the index
	}

	public void insert(int key, String value) {
		int index = hashFunction(key);

		// Linear probing to find the next available slot
		while (table[index] != null) {
			if (table[index].key == key) { // Update existing key
				table[index].value = value;
				return;
			}
			index = (index + 1) % size; // Move to the next index
		}

		table[index] = new Node(key, value); // Insert the new key-value pair
		count++;
	}

	public String retrieve(int key) {
		int index = hashFunction(key);

		while (table[index] != null) {
			if (table[index].key == key) {
				return table[index].value; // Return the value associated with the key
			}
			index = (index + 1) % size; // Move to the next index
		}

		return null; // Key not found
	}

	public void printTable() {
		System.out.println("Hash table contents are:");
		for (int i = 0; i < size; i++) {
			if (table[i] != null) {

				System.out.println("Index " + i + ": key " + table[i].key + ", Value '" + table[i].value);
			}
		}
	}

	public static void main(String[] args) {
		Hashtable obj = new Hashtable(5);

		obj.insert(1, "adi");
		obj.insert(2, "P");
		obj.insert(3, "null");

		obj.printTable();

		System.out.println(obj.retrieve(1));
	}
}
