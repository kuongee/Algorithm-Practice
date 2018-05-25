import java.util.*;


public class Main {
	int [][] map;
	int [][] canGo;
	int [][] visited;
	int N;
	public Main() {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		map = new int[N][N];
		canGo = new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				map[i][j] = scan.nextInt();
			}
		}
		
		visited = new int [N][N];
		for(int i=0; i<N; i++) {
			dfs(i, i);
			for(int j=0; j<N; j++) {
				System.out.print(canGo[i][j] + " " );
			}
			System.out.println();
		}
		
	}
	
	public void dfs(int top, int idx) {
		for(int n=0; n<N; n++) {
			if(map[idx][n] == 1 && canGo[top][n] == 0) {
				canGo[top][n] = 1;
				dfs(top, n);
			}
		}
	}
	
	public static void main(String [] args) {
		new Main();
	}
}