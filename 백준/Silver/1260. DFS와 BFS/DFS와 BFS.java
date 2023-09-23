import java.util.*;
import java.io.*;
public class Main {
	static int N;
	static ArrayList<ArrayList<Integer>> list;
	static boolean[] visited;
	static StringBuilder sdfs = new StringBuilder();
	static StringBuilder sbfs = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine()," ");
		
		N = Integer.parseInt(st.nextToken());	// 정점 개수
		int M = Integer.parseInt(st.nextToken());	// 간선 개수
		int V = Integer.parseInt(st.nextToken());	// 탐색 시작 정점 번호
		
		list = new ArrayList<>();
		for(int i=0;i<N+1;i++) {	// 1 based 
			list.add(new ArrayList<>());
		}
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(in.readLine()," ");
			int p1 = Integer.parseInt(st.nextToken());
			int p2 = Integer.parseInt(st.nextToken());
			list.get(p1).add(p2);
			list.get(p2).add(p1);
		}
		for(int i=1;i<=N;i++) {
			list.get(i).sort(null);
		}
		
		int size = list.get(V).size();
		visited = new boolean[N+1];
		dfs(V, size);
		visited = new boolean[N+1];
		bfs(V);
		System.out.println(sdfs);
		System.out.println(sbfs);
	}
    
    
	static void dfs(int target, int size) {
		if(visited[target]) return;
		
		visited[target] = true;
		sdfs.append(target).append(" ");
		
		for(int i=0;i<size;i++) {
			int x = list.get(target).get(i);
			if(!visited[x])
				dfs(x,list.get(x).size());
		}
	}
	
	static void bfs(int target) {
		visited[target] = true;		
		Queue<Integer> q = new LinkedList<>();
		q.offer(target);
		
		while(!q.isEmpty()) {
			int curr = q.poll();
			sbfs.append(curr).append(" ");
			
			for(int i=0;i<list.get(curr).size();i++) {
				int tmp = list.get(curr).get(i);
				if(visited[tmp]) continue;
				
				visited[tmp] = true;
				q.offer(tmp);
			}
		}
	
	}
}
