import java.util.*;

public class MaxSum {
	
	public MaxSum() {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int prev = 0, max = 0, curr = 0;
		for(int n=0; n < N; n++) {
			int num = scan.nextInt();
			if(n == 0)
				max = num;
			if(prev == 0)
				curr = num;
			else
				curr = prev + num;
			
			//System.out.println("** " + curr);
			
			if(curr > max) {
				max = curr;
			}
			
			if(curr >= 0) {
				prev = curr;
			}
			else {
				prev = 0;
			}
		}		
		System.out.println(max);
	}

	public static void main(String [] args) {
		new MaxSum();
	}

}
