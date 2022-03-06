
public class DequeStack {
	//본 클래스를 정의하는데 필요한 필드를 정의
	private Deque deque1;
	
	//생성자 deque 생성
	public DequeStack(){
		deque1=new Deque();
	}
	
	//현재 dequestack가 비었는지 확인
	public boolean isEmpty(){
		return deque1.isEmpty();
	}
	
	//현재 dequestack로 삽입
	public void push(char x ){
		deque1.insertFirst(x);
	}
	
	//현재 dequestack의 노드 하나를 삭제
	public char pop(){
		char x=deque1.deleteFirst();
		return x;
	}
}
