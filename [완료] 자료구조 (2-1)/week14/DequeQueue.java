public class DequeQueue {
	//�� Ŭ������ �����ϴµ� �ʿ��� �ʵ带 ����
	private Deque deque1;
	
	//������ deque ����
	public DequeQueue(){
		deque1=new Deque();
	}
	
	//���� dequequeue�� ������� Ȯ��
	public boolean isEmpty(){
		return deque1.isEmpty();
	}
	
	//���� dequequeue�� ����
	public void enqueue(char x ){
		deque1.insertFirst(x);
	}
	//���� dequequeue�� ��� �ϳ��� ����
	public char dequeue(){
		char x=deque1.deleteLast();
		return x;
	}
}
