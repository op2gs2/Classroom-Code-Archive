
public class DequeStack {
	//�� Ŭ������ �����ϴµ� �ʿ��� �ʵ带 ����
	private Deque deque1;
	
	//������ deque ����
	public DequeStack(){
		deque1=new Deque();
	}
	
	//���� dequestack�� ������� Ȯ��
	public boolean isEmpty(){
		return deque1.isEmpty();
	}
	
	//���� dequestack�� ����
	public void push(char x ){
		deque1.insertFirst(x);
	}
	
	//���� dequestack�� ��� �ϳ��� ����
	public char pop(){
		char x=deque1.deleteFirst();
		return x;
	}
}
