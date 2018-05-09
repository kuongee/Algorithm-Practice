import java.util.*;
/*
 * BoJ 11279
 */
public class BOJ_11279 {
	PriorityQueue<Integer> pq;
	
	public BOJ_11279() {
		pq = new PriorityQueue<Integer>(100000, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				// o1 is the current item
				return o2 - o1; // make max heap				
			}
		});
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for(int n=0; n<N; n++) {
			int X = scan.nextInt();
			if(X == 0) {
				int item;
				if(pq.size() == 0) {
					item = 0;
				}
				else {
					item = pq.poll();
				}
				System.out.println(item);				
			}
			else {
				pq.offer(X);
			}
		}
			
	}
	

	public static void main(String [] args) {
		new BOJ_11279();
	}

}
