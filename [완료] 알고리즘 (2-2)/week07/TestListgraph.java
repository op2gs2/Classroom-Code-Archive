

import java.util.*;

class TestListgraph {
	public static void main(String[] args) {
		Graph g = new Graph(); // Graph 객체 생성
		g.build(); // Graph클래스에 있는 build 함수 실행
		System.out.println("그래프의 인접 리스트 표현");
		
		
		for (int i = 0; i < g.header.length; i++) {
			if(g.header[i].data == 999)
				break;
			System.out.print(i + "= ");
			g.display(i);
			System.out.println();
		} // end of for loop
	
		/*
		System.out.println("DFS()"); // DFS 출력
		g.DFS(0);
		System.out.println();
		*/

		System.out.println("BFS()"); // BFS 출력
		g.BFS(0);
		
		
		
	} // end of main
} // end of TestListgraph

