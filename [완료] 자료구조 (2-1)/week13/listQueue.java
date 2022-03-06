package ListQ;

public class listQueue {
	//�ʵ� ����
	private listNode front, rear;

	//������
	public listQueue() {
		front = null;
		rear = null;
	}

	//�Է�
	public void enqueue(int x) {
		//��� ����
		listNode newNode = new listNode();
		newNode.data = x;
		//������ ���� ��� ���ο� ��� ����
		if (front == null) {
			front = rear = newNode;
		} 
		//�ƴϸ�, �׳� ���� �������
		else {
			rear.link = newNode;
			rear = newNode;
		}
	}

	//���
	public int dequeue() {
		//
		int temp;
		//������ �� ����쿡
		if (front == null) {
			System.out.println("Queue Empty");
			return -99;
		}
		
		//�ƴϸ� ���� ����
		temp = front.data;
		front = front.link;
		return temp;
	}
}
