

interface Queue {
	boolean isEmpty(); // ť�� �����ΰ��� �˻�
	void enqueue(Object x); // ���� x�� ����
	Object dequeue(); // ���Ҹ� �����ϰ� ��ȯ
	void remove(); // ���Ҹ� ����
	Object peek(); // ���Ұ��� ��ȯ
} // Queue interface

class ListNode {
	Object data;
	ListNode link;
} // end of class ListNode

class ListQueue implements Queue // p244 in textbook
{
	private ListNode front;
	private ListNode rear;
	private int count;

	public ListQueue() // ���� ť
	{
		front = null;
		rear = null;
		count = 0;
	}

	public boolean isEmpty() {
		return (count == 0);
	}

	public void enqueue(Object x) { // ť�� ���� x�� ����
		ListNode newNode = new ListNode();
		newNode.data = x;
		newNode.link = null;

		if (count == 0) { // ť(����Ʈ)�� ������ ���
			front = rear = newNode;
		} else {
			rear.link = newNode;
			rear = newNode;
		}
		count++;
	} // end enqueue()

	public Object dequeue() {
		// ť���� ���Ҹ� �����ϰ� ��ȯ
		if (count == 0)
			return null;
		Object item = front.data;
		front = front.link;
		if (front == null) // ����Ʈ�� ��带 ���� �� ������ �� ���
		{
			rear = null;
		}
		count--;
		return item;
	} // end dequeue()

	public void remove() { // ť���� ���Ҹ� ����
		if (count == 0)
			return;
		else
			front = front.link;
		if ((front == null)) {
			rear = null;
		}
		count--;
	} // end remove()

	public Object peek() { // ť���� ���� �˻�
		if (count == 0)
			return null;
		else
			return front.data;
	} // end peek()

} // end ListQueue class
