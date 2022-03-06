
public class UndirectWeightedGraph {
	private String V; // 그래프의 Node 집합
	private Edge E[]; // 그래프의 Edge 집합

	// Edge 데이타를 초기화해주는 메소드
	public void initEdge() {
		V = "";
		E = new Edge[9];

		// 빈칸 채우기 : 그래프를 완성하세요
		E[0] = new Edge('0', 5, '1');
		E[1] = new Edge('0', 4, '2');
		E[2] = new Edge('1', 2, '2');

		E[3] = new Edge('1', 7, '3');
		E[4] = new Edge('2', 11, '4');
		E[5] = new Edge('2', 6, '3');

		E[6] = new Edge('3', 3, '4');
		E[7] = new Edge('3', 8, '5');
		E[8] = new Edge('5', 8, '4');

		addNode();
	}

	private void addNode() {
		for (int i = 0; i < E.length; i++)
			addNode(E[i].VERTEX_1, E[i].VERTEX_2);
	}

	// 노드에 대한 정보를 추가시킨다.
	private void addNode(char v1, char v2) {
		addNode(v1);
		addNode(v2);
	}

	// 노드에 대한 정보를 추가시키는 메인 메소드
	private void addNode(char node) {
		if (V.indexOf(node) == -1) {// 빈칸 채우기 : 문자열 V에 매개변수로 받은 node가 있는지
			V = V + node; // 확인하고 없다면 V에 node 추가
		}
		// 문자열 V에 정점들을 저장한다.
		
	}

	// Kruskal 알고리즘에 의한 연산처리 메소드
	public void kruskal() {

		System.out.println(":::입력된 Edge 집합::: (스택을 이용해서 역순임)");
		for (int i = 0; i < E.length; i++) {
			System.out.println(E[i]);
		}

		Sort();

		System.out.println("\n:::정렬된 Edge 집합::: ");
		for (int i = 0; i < E.length; i++) {
			System.out.println(E[i]);
		}

		//
		System.out.println("\n:::최소 비용 Edge 집합::: ");
		UNION_FIND uf = new UNION_FIND( V.toCharArray() ); // 연산을 위한 집합생성 //toCharArray: 문자열을 잘라서 문자로 저장

		// Edge 의 수만큼 루프반복
		for (int i = 0, k = 1; i < E.length; i++) {

			// Find 연산자를 이용해서 사이클인지를 확인함 (find 내부에 union 연산포함)
			if ( uf.find(E[i].VERTEX_1, E[i].VERTEX_2) ) {
				visit(i); // 찾아낸 최단경로에 대한 처리

			// 결과트리의 Edge 의 수가 V-1 이되면 종료.
			if (k==-1){// 빈칸 채우기 : k가 v의 크기 -1이 되면 
				break;
			}
			else k++;
		}
	}

 }

	// 최소비용 간선을 방문했을때에 대한 처리
	public void visit(int i) {
		System.out.println(E[i]);
	}

	public void Sort() {
		for (int i = 0; i < E.length - 1; i++) // 초기 값을 저장하기 위해 사용하는 for문
			for (int j = i + 1; j < E.length; j++) // 비교를 위한 for문
				if (E[i].WEIGHT > E[j].WEIGHT) // i번째와 j번째를 비교하여 i번째보다 작다면
				{
					Edge temp;
					temp = E[i];// 빈칸 채우기 : i번째 값을 temp에 저장
					E[i] = E[j];// 빈칸 채우기 : i번째 값에 j번째 값을 저장
					E[j] = temp;// 빈칸 채우기 : j번째 값에 temp에 값을 저장
				}
	}
}