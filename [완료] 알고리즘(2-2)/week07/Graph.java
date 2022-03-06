import java.util.*;

class Graph {
	Node header[] = new Node[10];
	boolean visited[] = new boolean[10];

	public Graph() {
		for (int i = 0; i < 10; i++) {
			header[i] = new Node(999); // 999로 초기화
			visited[i] = false; // 방문여부 검사
		} // 반복문 종료
	} // 생성자 종료

	public void build() { // 그래프를 생성
		header[0] = new Node(0, new Node(1, new Node(2, new Node(3))));
		header[1] = new Node(1, new Node(0, new Node(4)));
		header[2] = new Node(2, new Node(0, new Node(4, new Node(5))));
		header[3] = new Node(3, new Node(0, new Node(5)));
		header[4] = new Node(4, new Node(1, new Node(2, new Node(6))));
		header[5] = new Node(5, new Node(2, new Node(3, new Node(6))));
		header[6] = new Node(6, new Node(4, new Node(5)));
	}

	public void display(int n) {
		Node m = header[n];
		m = m.link;
		while (m != null) {
			System.out.print(m.data + " ");
			m = m.link;
		} // while문 의 종료
	}// display 함수의 종료

	public void DFS(int m) { // int m은 시작 할 부분을 의미
		boolean visited[] = new boolean[10];
		int v[] = new int[10];

		for (int i = 0; i < 10; i++) {
			visited[i] = false; // 방문여부 확인
			v[i] = 0; // 방문횟수
		}

		Stack s = new Stack();
		s.push(header[m].data); // 시작 정점을 스택에 저장

		while (!s.isEmpty()) {
			int j = (Integer) s.pop();// int형 변수 j에 pop한 값을 저장 (pop한 값을 Integer형으로 변환해야 함)
			if (visited[j] == false) {
				System.out.print(j + " ");// j출력
				visited[j] = true;// visited배열의 j번째를 방문한 것으로 체크
			}

			while (header[j] != null) {
				int k = header[j].data;
				if (!visited[k]) 
					s.push(k);// k를 스택에 push
					header[j] = header[j].link;// 다음 링크로 이동
			}
		}
	}
	
	public void BFS(int m) {
		boolean visited[]= new boolean[10];
		
		for(int i=0; i<10; i++) {
			visited[i]=false;
		}
		
		ListQueue q= new ListQueue();
		Node n = header[m];
		q.enqueue(n); //m에 대한 정점을 인큐한다.
		
		while(!q.isEmpty()) {
			Node p = (Node) q.dequeue(); //디큐하고 순회 포인터 가르킨다.
			if(visited[p.data]==false) {
				System.out.print(p.data+" ");//p의 데이터 출력
				visited[p.data]=true;//visited 배열의 p의 데이터 번째를 방문한 것으로 마크
			}
			
			while(p.link !=null){ //제일 가까운 정점으로 이동하고 방문하지 않았다면 인큐한다.
				p=p.link;//p를 다음 링크로 이동
				if(visited[p.data]==false)//visited 배열의 p데이터 번째를 방문하지 않았다면
					q.enqueue(header[p.data]);//헤더의 p 데이터 번째를 enqueue
			}
		}
	}
}
