import java.io.*;
import java.util.Stack;


public class KruskalTest {
	public static void main(String args[]) {
		UndirectWeightedGraph graph = new UndirectWeightedGraph();
		graph.initEdge();
		graph.kruskal();
	}
}

