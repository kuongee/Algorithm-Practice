
public class MaxHeap {
	public int size;
	public int [] heap;
	
	public MaxHeap(int [] arr) {
		heap = new int[arr.length + 1];
		for(int i=0; i<arr.length; i++) {
			insert(arr[i]);
		}
	}
	
	public void insert(int item) {
		size++;
		heap[size] = item;
		heapify(size);
	}
	
	public void heapify(int c) {
		int parent = c / 2;
		int curr = c;
		while(curr > 1 && heap[parent] < heap[curr]){
			int temp = heap[parent];
			heap[parent] = heap[curr];
			heap[curr] = temp;
			
			curr = parent;
			parent = curr / 2;
		}
	}
	
	public int extractMax() {
		int item = heap[1];
		heap[1] = heap[size];
		heap[size] = 0;
		sinkDown(1);
		size--;
		return item;
	}
	
	public void sinkDown(int curr) {
		int max = curr;
		int leftChild = max * 2;
		int rightChild = max * 2 + 1;

		if(leftChild < size && heap[max] < heap[leftChild])
			max = leftChild;
		if(rightChild < size && heap[max] < heap[rightChild])
			max = rightChild;
		
		if(max != curr) {
			int temp = heap[curr];
			heap[curr] = heap[max];
			heap[max] = temp;
			sinkDown(max);
		}
	}
	
	public static void main(String [] args) {
		int [] array = {30, 25, 1, 3, 5, 6, 9, 43, 24, 8};
		System.out.print("Origin: ");
		for(int a = 0; a < array.length; a++) {
			System.out.print(array[a] + " ");
		}
		System.out.println();
		
		MaxHeap mh = new MaxHeap(array);
		System.out.print("Make Heap: ");
		for(int a = 1; a < mh.heap.length; a++) {
			System.out.print(mh.heap[a] + " ");
		}
		System.out.println();
		
		System.out.print("Extract Max item: ");
		System.out.println(mh.extractMax() + " " + mh.extractMax());
		for(int a = 1; a < mh.heap.length; a++) {
			System.out.print(mh.heap[a] + " ");
		}
	}
}
