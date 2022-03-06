import java.util.*;

class Graph {
	Node header[] = new Node[10];
	boolean visited[] = new boolean[10];

	public Graph() {
		for (int i = 0; i < 10; i++) {
			header[i] = new Node(999); // 999�� �ʱ�ȭ
			visited[i] = false; // �湮���� �˻�
		} // �ݺ��� ����
	} // ������ ����

	public void build() { // �׷����� ����
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
		} // while�� �� ����
	}// display �Լ��� ����

	public void DFS(int m) { // int m�� ���� �� �κ��� �ǹ�
		boolean visited[] = new boolean[10];
		int v[] = new int[10];

		for (int i = 0; i < 10; i++) {
			visited[i] = false; // �湮���� Ȯ��
			v[i] = 0; // �湮Ƚ��
		}

		Stack s = new Stack();
		s.push(header[m].data); // ���� ������ ���ÿ� ����

		while (!s.isEmpty()) {
			int j = (Integer) s.pop();// int�� ���� j�� pop�� ���� ���� (pop�� ���� Integer������ ��ȯ�ؾ� ��)
			if (visited[j] == false) {
				System.out.print(j + " ");// j���
				visited[j] = true;// visited�迭�� j��°�� �湮�� ������ üũ
			}

			while (header[j] != null) {
				int k = header[j].data;
				if (!visited[k]) 
					s.push(k);// k�� ���ÿ� push
					header[j] = header[j].link;// ���� ��ũ�� �̵�
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
		q.enqueue(n); //m�� ���� ������ ��ť�Ѵ�.
		
		while(!q.isEmpty()) {
			Node p = (Node) q.dequeue(); //��ť�ϰ� ��ȸ ������ ����Ų��.
			if(visited[p.data]==false) {
				System.out.print(p.data+" ");//p�� ������ ���
				visited[p.data]=true;//visited �迭�� p�� ������ ��°�� �湮�� ������ ��ũ
			}
			
			while(p.link !=null){ //���� ����� �������� �̵��ϰ� �湮���� �ʾҴٸ� ��ť�Ѵ�.
				p=p.link;//p�� ���� ��ũ�� �̵�
				if(visited[p.data]==false)//visited �迭�� p������ ��°�� �湮���� �ʾҴٸ�
					q.enqueue(header[p.data]);//����� p ������ ��°�� enqueue
			}
		}
	}
}
