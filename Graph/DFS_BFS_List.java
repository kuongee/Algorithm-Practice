import java.util.*;

public class DFS_BFS_List {
	ArrayList [] graph;
	int [] visited;
	
	public DFS_BFS_List() {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int Start = scan.nextInt();
		
		graph = new ArrayList[N+1];
		visited = new int[N+1];
		for(int i=1; i<N+1; i++) {
			graph[i] = new ArrayList();
			visited[i] = 0;
		}
		
		for(int m=0; m<M; m++) {
			int first = scan.nextInt();
			int second = scan.nextInt();
			
			graph[first].add(second);
			graph[second].add(first);
		}
		
		DFS(Start);
		for(int i=1; i<N+1; i++) {
			visited[i] = 0;
		}
		System.out.println();
		BFS(Start);
	}
	
	public void DFS(int s) {
		visited[s] = 1;
		System.out.print(s + " ");
		
		for(int i=0; i<graph[s].size(); i++) {
			int temp = (int)graph[s].get(i);
			if( visited[temp] != 1 ) {
				DFS(temp);
			}
		}
	}
	
	public void BFS(int s) {
		Queue<Integer> queue = new LinkedList();
		queue.add(s);
		
		while(!queue.isEmpty()) {
			int pop = queue.poll();
			if(visited[pop] == 1)
				continue;
			System.out.print(pop + " ");
			visited[pop] = 1;
			for(int i=0; i<graph[pop].size(); i++) {
				queue.add((Integer) graph[pop].get(i));
			}
		}
	}
	
	
	public static void main(String [] args) {
		new DFS_BFS_List();
	}
}