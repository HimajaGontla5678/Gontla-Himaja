import java.util.*;
public class Graph{
	private Map<Integer,List<Integer>>adjList;
	public Graph(){
		adjList = new HashMap<>();
	}
	public void addVertex(int v){
		adjList.putIfAbsent(v,new ArrayList<>());
	}
	public Map<Integer,List<Integer>>getadjList(){
		return adjList;
	}
}