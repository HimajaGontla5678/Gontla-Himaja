public class Graph{
	Private Map<Integer,List<Integer>>adjList;
	private boolean isDirected;
	public Graph(boolean isDirected){
		this.isDirected = isDirected;
		adjList = new HashMap<>();
	}
	public void addEdge(int src,int dest){
		adjList.putIfAbsent(src,newArrayList<>());
		adjList.putIfAbsent(dest,newArrayList<>());
		adjList.get(src).add(dest);
		if(!isDirected){
			adjList.get(dest).add(src);
		}
		public void removeEdge(int src,int dest){
			List<Integer>srcList=adjList.get(src);
			List<Integer>destList=adjList.get(dest);
			if(srcList!=null)srcList.remove((Integer)dest);
			if(!isDirected&&destList!=null)destList