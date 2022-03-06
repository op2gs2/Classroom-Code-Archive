package CircularQ;


public class circleQ {
	//�ʵ� ����
	private int Qsize = 10;
	private int arrayQ[];
	private int front, rear;

	// ������
	public circleQ() {
		arrayQ = new int[Qsize];
		front = rear = 0; //
	}

	// �Է� �޼ҵ�
	void enqueue(int x) {
		// ���� �ֱ����� ������ Ȯ��
		rear = (rear + 1) % Qsize;
		if (front == rear) {
			System.out.println("Queue full");
		}
		// �Ŀ� ���� ������
		arrayQ[rear] = x;
	}

	// ��� �޼ҵ�
	int dequeue() {
		// ���� ���� �� ���� ���
		if (front == rear) {
			System.out.println("Queue empty");
			return -99;
		} else {
			// ���� �� �� ������ Ȯ���� ����
			front = (front + 1) % Qsize;
			return arrayQ[front];
		}
	}
}
