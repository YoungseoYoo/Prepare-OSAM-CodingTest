import java.util.*;

List<Edge>[] adjList = new List[N];
for (int i = 0; i < N; i++){
  adjList[i] = new LinkedList<>();
  for (int j = 0; j < N; j++){
    if (/*정점 i와 j사이에 간선이 존재하면*/){
      Edge e = new Edge(j);
      adjList[i].add(e);
    }
  }
}