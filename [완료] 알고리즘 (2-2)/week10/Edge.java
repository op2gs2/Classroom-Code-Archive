public class Edge {
	char VERTEX_1;  // edge �� ���� ���� ��
	char VERTEX_2;  // edge �� ���� �ٸ� ������ ��
	int WEIGHT;     // edge �� ����ġ

	// Edge �� ���� �Է��ϱ� ���� ������
	public Edge(char v1, int w, char v2) {
		VERTEX_1 = v1;
		VERTEX_2 = v2;
		WEIGHT = w;
	}

	public String toString() {
		return VERTEX_1 + "-" + VERTEX_2 + " ����ġ:" + WEIGHT;
	}
}

