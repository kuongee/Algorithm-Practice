import java.util.*;

public class QuickSort {
	int [] array;
	
	public QuickSort(int [] array) {
		this.array = array;
		sort(array, 0, array.length-1);
		System.out.print("Sorted--> ");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}	
		System.out.println();
	}

	public void sort(int [] array, int left, int right) {
		int index = partition(array, left, right);
		if(left < index - 1)
			sort(array, left, index-1);
		if(right > index)
			sort(array, index, right-1);
		
	}

	public int partition(int [] array, int left, int right) {
		int pivot = array[(left + right) / 2];
		int i = left;
		int j = right;
		while(i <= j) {
			while(pivot > array[i]) 
				i++;
			while(pivot < array[j])
				j--;

			if(i <= j) {
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
				i++;
				j--;
			}
		} // while
		return i;		
	}

	public static void main(String [] args) {
		int length = 5;
		int [] array = new int[length];
		Random rand = new Random();
		for(int i=0; i<length; i++) {
			array[i] = rand.nextInt(20) + 1;
		}
		System.out.print("before --> ");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		new QuickSort(array);
	}
}
