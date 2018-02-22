
public class SelectionSort {
	int [] original;
	public SelectionSort (int [] array) {
		int min = array[0];
		int savej = 0; // save index!
		for(int i=0; i<array.length; i++) {
			min = array[i];
			savej = i;
			
			/* Find smallest number */
			for(int j=i+1; j<array.length; j++) {
				if(min > array[j]) {
					min = array[j];
					savej = j;
				}
			}
			
			/* Put the smallest front */ 
			int temp = array[i];
			array[i] = array[savej];
			array[savej] = temp;			
		}
		
	}
	
	
	
	public static void main(String args []) {
		int [] array = {5, 3, 6, 2, 10}; 
		//int [] arrayA = new int[5];
		//int [] arrayB;
		//arrayB = new int[] {5, 3, 6, 2, 10};
		
		new SelectionSort(array);
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}	
}
