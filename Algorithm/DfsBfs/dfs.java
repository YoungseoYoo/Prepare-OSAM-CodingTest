import java.util.*;

class DFS{
  int N;
  int start;
  List<Edge>[] graph;
  private boolean[] visited;
  public DFS(List<Edge>[] adjList, int startPoint){
    N = adjList.length;
    graph = adjList;
    visited = new boolean[N];
    start = startPoint;
    for (int i = 0; i < N; i++) visited[i] = false;
    dfs(start);
    for (int i = 0; i < N; i++) if (!visited[i]) dfs(i);
  }
  private void dfs(int i){
    visited[i] = true;
    System.out.print(i);
    for (Edge e : graph[i]){
      if (!visited[e.adjvertex]){
        dfs(e.adjvertex);
      }
    }
  }
}