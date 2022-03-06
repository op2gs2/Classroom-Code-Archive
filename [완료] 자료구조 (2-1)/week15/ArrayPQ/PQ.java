package ArrayPQ;

public class PQ {
	private int qSize = 10; // �迭�� �ʱ� ũ��
	private long[] queue; // �켱������ ������ �迭�� ����
	private String[] name; // �̸��� ������ �迭�� ����
	private int nItems; // ť�� �մ԰���

	public PQ() {// ������
		name = new String[qSize];
		queue = new long[qSize];
		nItems = 0;
	}

	public void enqueue(String str, long item) { // �迭�� ���� �־���
		int i;
		
		//������ ũ��� �������� ũ�Ⱑ ���� ���
		if (nItems == qSize) {
			System.out.println("PQ full");
			isFull();
			return;
		}
		
		//����ִ� ������ ���� ���
		if (nItems == 0) {
			name[0] = str;
			queue[0] = item;
			nItems++;
		} 
		
		//����ִ� ������ ���� ���
		else {
			for (i = nItems - 1; i >= 0; i--) {
				if (item > queue[i]) {// �����Ϸ��� �ڷᰡ ũ��
					queue[i + 1] = queue[i]; // �����ڷḦ �ϳ� �ڷ� �̵�
					name[i + 1] = name[i];
				} else
					break; // �����Ϸ��� �ڷᰡ �۰ų� ������ �̵�����
			}
			queue[i + 1] = item;
			name[i + 1] = str;
			nItems++;
		}
	}

	public String dequeue() { // �迭�� ���� ���� ���� ������ �Ѱ���
		String str;
		//���� ����� ���� ���
		if (nItems <= 0) {
			return "PQ empty";
		}
		
		//���� ���� �� ����
		str = name[nItems - 1];
		nItems--;
		return str;

	}

	public void isFull() { // �迭�� �� ���ִ��� Ȯ�� �ϰ�, �� ������ ��� ũ�⸦ 10�� �÷���
		//���� ũ�Ⱑ ū ���
		//��¹����� �ּ��� ��ü��
		if (nItems == qSize) {
			qSize += 10;
			System.out.println("Queueũ�� 10 ����");
			long[] temp = new long[qSize];
			String[] temp2 = new String[qSize];
			for (int i = 0; i < queue.length; i++) {
				System.out.println(i + "��° ��� ���� ��");
				temp[i] = queue[i];
				temp2[i] = name[i];
			}
			queue = temp;
			name = temp2;
			System.out.println("���ο� �Լ� ��ü�Ϸ�");

		}
	}

	public void isEmpty() { // �迭�� ����ִ��� Ȯ����
		if (nItems == 0) {
			System.out.println("������ �������");
		}
	}

	public void Peek() { // �迭 �� ���� ���Ҹ� ���
		System.out.println("���� �տ� ��ġ�� �մ���?" + name[(nItems - 1)]);
	}
}
