import java.util.*;

public class BubbleSort {
	static int [] bubbleSort(int [] array) {
		int [] sorted = array.clone();
		
		int len = sorted.length;
		for(int i=0; i<len; i++) {
			for(int j=0; j<len-1-i; j++) {
				if(sorted[j] > sorted[j+1]) {
					int temp = sorted[j];
					sorted[j] = sorted[j+1];
					sorted[j+1] = temp;
				}
			}
		}
		
		return sorted;
	}
	
	public static void main(String [] args) {
		int length = 7;
		int [] array = new int[length];
		Random rand = new Random();
		for(int i=0; i<length; i++) {
			array[i] = rand.nextInt(20) + 1;
		}
		
		System.out.print("before --> ");
		System.out.println(Arrays.toString(array));
		
		System.out.print("sorted --> ");
		System.out.println(Arrays.toString(bubbleSort(array)));
	}
}
