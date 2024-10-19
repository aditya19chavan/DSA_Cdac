package Algorithm;

public class Sorting_Main {

	static void bubble_sort(int a[]) {
		int i, j, temp;
		for (i = 0; i < a.length - 1; i++)// given n-1 passes
		{
			for (j = 0; j < a.length - 1; j++)// compare and swap if needed
			{
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	static void selection_sort(int a[]) {
		int i, j, min, pos;
		for (i = 0; i < a.length - 1; i++)// given n-1 passes
		{
			min = a[i];// ref
			pos = i;// ref
			for (j = i + 1; j < a.length; j++) {
				if (a[j] < min) {
					pos = j;
					min = a[j];
				}
			}
			// swap
			a[pos] = a[i];
			a[i] = min;
		}
	}

	static void insertion_sort(int a[]) {
		int i, j, new_element;
		for (i = 0; i < a.length - 1; i++)// given n-1 passes
		{
			new_element = a[i + 1];// ref
			j = i + 1;// unsorted starts from
			while (j > 0 && new_element < a[j - 1]) {
				a[j] = a[j - 1];// pullback
				j--;
			}
			a[j] = new_element;
		}
	}

	static void quick_sort(int a[], int start, int end) {
		int i = start;
		int j = end;
		int pivot = start;
		while (i < j) {
			while (a[i] < a[pivot])
				i++;
			while (a[j] > a[pivot])
				j--;
			if (i < j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		if (i < end)
			quick_sort(a, i + 1, end);
		if (j > start)
			quick_sort(a, start, j - 1);
	}

	static void print_array(int a[]) {
		System.out.print("\nArray has:");
		for (int index = 0; index < a.length; index++) {
			System.out.print(a[index] + " , ");
		}
	}

	static void merger(int a[], int start, int mid, int end) {
		int i, j, temp[], tindex;
		i = start;
		j = mid + 1;
		// temp array to keep sorted data
		temp = new int[a.length];
		tindex = start;
		// compare and copy in order
		while (i <= mid && j <= end) {
			if (a[i] < a[j])
				temp[tindex++] = a[i++];
			else
				temp[tindex++] = a[j++];
		}
		// copy leftover
		while (i <= mid)
			temp[tindex++] = a[i++];
		while (j <= end)
			temp[tindex++] = a[j++];

		// copy back to a from temp
		for (i = start; i <= end; i++)
			a[i] = temp[i];
	}

	static void merge_sort(int a[], int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			merge_sort(a, start, mid);
			merge_sort(a, mid + 1, end);
			merger(a, start, mid, end);
		}
	}

	public static void main(String args[]) {
		int a[] = { 77, 11, 22, 33, 99, 44, 88, 55, 66 };
		print_array(a);
		// bubble_sort(a);
		// selection_sort(a);
		// insertion_sort(a);
		// quick_sort(a,0,a.length-1);
		merge_sort(a, 0, a.length - 1);
		print_array(a);
	}
}