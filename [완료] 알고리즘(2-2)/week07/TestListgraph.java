

import java.util.*;

class TestListgraph {
	public static void main(String[] args) {
		Graph g = new Graph(); // Graph ��ü ����
		g.build(); // GraphŬ������ �ִ� build �Լ� ����
		System.out.println("�׷����� ���� ����Ʈ ǥ��");
		
		
		for (int i = 0; i < g.header.length; i++) {
			if(g.header[i].data == 999)
				break;
			System.out.print(i + "= ");
			g.display(i);
			System.out.println();
		} // end of for loop
	
		/*
		System.out.println("DFS()"); // DFS ���
		g.DFS(0);
		System.out.println();
		*/

		System.out.println("BFS()"); // BFS ���
		g.BFS(0);
		
		
		
	} // end of main
} // end of TestListgraph

