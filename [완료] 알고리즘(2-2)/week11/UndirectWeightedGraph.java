
public class UndirectWeightedGraph {
	private String V; // �׷����� Node ����
	private Edge E[]; // �׷����� Edge ����

	// Edge ����Ÿ�� �ʱ�ȭ���ִ� �޼ҵ�
	public void initEdge() {
		V = "";
		E = new Edge[9];

		// ��ĭ ä��� : �׷����� �ϼ��ϼ���
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

	// ��忡 ���� ������ �߰���Ų��.
	private void addNode(char v1, char v2) {
		addNode(v1);
		addNode(v2);
	}

	// ��忡 ���� ������ �߰���Ű�� ���� �޼ҵ�
	private void addNode(char node) {
		if (V.indexOf(node) == -1) {// ��ĭ ä��� : ���ڿ� V�� �Ű������� ���� node�� �ִ���
			V = V + node; // Ȯ���ϰ� ���ٸ� V�� node �߰�
		}
		// ���ڿ� V�� �������� �����Ѵ�.
		
	}

	// Kruskal �˰��� ���� ����ó�� �޼ҵ�
	public void kruskal() {

		System.out.println(":::�Էµ� Edge ����::: (������ �̿��ؼ� ������)");
		for (int i = 0; i < E.length; i++) {
			System.out.println(E[i]);
		}

		Sort();

		System.out.println("\n:::���ĵ� Edge ����::: ");
		for (int i = 0; i < E.length; i++) {
			System.out.println(E[i]);
		}

		//
		System.out.println("\n:::�ּ� ��� Edge ����::: ");
		UNION_FIND uf = new UNION_FIND( V.toCharArray() ); // ������ ���� ���ջ��� //toCharArray: ���ڿ��� �߶� ���ڷ� ����

		// Edge �� ����ŭ �����ݺ�
		for (int i = 0, k = 1; i < E.length; i++) {

			// Find �����ڸ� �̿��ؼ� ����Ŭ������ Ȯ���� (find ���ο� union ��������)
			if ( uf.find(E[i].VERTEX_1, E[i].VERTEX_2) ) {
				visit(i); // ã�Ƴ� �ִܰ�ο� ���� ó��

			// ���Ʈ���� Edge �� ���� V-1 �̵Ǹ� ����.
			if (k==-1){// ��ĭ ä��� : k�� v�� ũ�� -1�� �Ǹ� 
				break;
			}
			else k++;
		}
	}

 }

	// �ּҺ�� ������ �湮�������� ���� ó��
	public void visit(int i) {
		System.out.println(E[i]);
	}

	public void Sort() {
		for (int i = 0; i < E.length - 1; i++) // �ʱ� ���� �����ϱ� ���� ����ϴ� for��
			for (int j = i + 1; j < E.length; j++) // �񱳸� ���� for��
				if (E[i].WEIGHT > E[j].WEIGHT) // i��°�� j��°�� ���Ͽ� i��°���� �۴ٸ�
				{
					Edge temp;
					temp = E[i];// ��ĭ ä��� : i��° ���� temp�� ����
					E[i] = E[j];// ��ĭ ä��� : i��° ���� j��° ���� ����
					E[j] = temp;// ��ĭ ä��� : j��° ���� temp�� ���� ����
				}
	}
}