public class DequeQueue {
	//본 클래스를 정의하는데 필요한 필드를 정의
	private Deque deque1;
	
	//생성자 deque 생성
	public DequeQueue(){
		deque1=new Deque();
	}
	
	//현재 dequequeue가 비었는지 확인
	public boolean isEmpty(){
		return deque1.isEmpty();
	}
	
	//현재 dequequeue로 삽입
	public void enqueue(char x ){
		deque1.insertFirst(x);
	}
	//현재 dequequeue의 노드 하나를 삭제
	public char dequeue(){
		char x=deque1.deleteLast();
		return x;
	}
}
