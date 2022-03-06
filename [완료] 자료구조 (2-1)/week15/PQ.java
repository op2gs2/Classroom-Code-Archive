public class PQ {
	QlistNode front; // ����Ʈ�� ���θ� ǥ���ϱ� ���� ����
	int num_node = 0; // �մ��� ���� ����ϱ� ���� ����

	public PQ() {
	}

	void enqueue(String name, int priority) { // ����Ʈ�� ���� �ִ� �޼ҵ�
		QlistNode p; // ��带 ����Ű�� ���� ����
		QlistNode newNode = new QlistNode(); // ��� ���� �� ����
		// ���ο� ����� ������ ����
		newNode.name = name;
		newNode.priority = priority;
		newNode.link = null;

		// �ȿ� ������ ���ų� ���ε��� ������ �켱 ������ ���� ���
		if ((front == null) || (newNode.priority < front.priority)) {
			newNode.link = front;
			front = newNode;
		}
		// �� �̿��� ���
		else {
			p = front;
			while (p.link != null && p.link.priority <= newNode.priority) {
				p = p.link;
			}
			newNode.link = p.link;
			p.link = newNode;
		}

		num_node++;// �մ� �� ����
	}

	String dequeue() { // ���ο��� ����
		String name = "";
		// ��� ���� ���
		if (front == null) {
			System.out.println("Queue underflow");
		}
		// �׷��� ���� ���
		else {
			name = front.name;
			front = front.link;
		}
		num_node--; // �մ� �� ����
		return name; // �����Ǵ� ���� ��ȯ
	}

	int numberofitem() {// �켱����ť�� ����ִ� �մ��� �� ���
		return num_node;
	}

	String peek() { // ���� �տ� �ɾ��ִ� �մ���?
		// ��� ���� ���� ���
		if (front != null) {
			String name = front.name;
			return name;
		}
		// ����ִ� ���
		else {
			return "�ȿ� �մ��� �����ϴ�. �մ��� �־��ּ���.";
		}
	}
}
