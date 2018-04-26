import java.util.*;

public class DFS_BFS_matrix {
	int [][] graph;
	int [] DFSvisited, BFSvisited;
	int N, M;
	public DFS_BFS_matrix() {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		int Start = scan.nextInt();
		
		graph = new int[N+1][N+1];
		DFSvisited = new int[N+1];
		BFSvisited = new int[N+1];
		
		for(int m=0; m<M; m++) {
			int first = scan.nextInt();
			int second = scan.nextInt();
			
			graph[first][second] = 1;
			graph[second][first] = 1;
		}
		
		DFS(Start);
		System.out.println();
		BFS(Start);
	}
	
	public void DFS(int s) {
		DFSvisited[s] = 1;
		System.out.print(s + " ");
		
		for(int i=1; i<N+1; i++) {
			if( graph[s][i] == 1 && DFSvisited[i] != 1 ) {
				DFS(i);
			}
		}
	}
	
	public void BFS(int s) {
		Queue<Integer> queue = new LinkedList();
		queue.add(s);
		
		while(!queue.isEmpty()) {
			int pop = queue.poll();
			if(BFSvisited[pop] == 1)
				continue;
			System.out.print(pop + " ");
			BFSvisited[pop] = 1;
			for(int i=1; i<N+1; i++) {
				int temp = graph[pop][i];
				if(temp == 1) 
					queue.add(i);
			}
		}
	}
	
	
	public static void main(String [] args) {
		new DFS_BFS_matrix();
	}
}