public class Deque {
	// 본 클래스를 구현하는 데 필요한 필드를 정의
	DequeNode first;
	DequeNode last;
	public Deque(){
		first=null; last=null;
	}
	// Deque가 비었는지 확인
	public boolean isEmpty(){
		return (first==null);
	}
	// Deque의 첫 부분으로 삽입
	public void insertFirst(char item){
		DequeNode newNode = new DequeNode();
		newNode.data=item;
		newNode.llink=null;
		newNode.rlink=null;
		if(isEmpty()){// no node
			first=newNode; last=newNode;
		}
		else{
			newNode.rlink=first;
			newNode.llink=null;
			first.llink=newNode;
			first=newNode;
		}
	}
	
	// Deque의 마지막 부분으로 삽입
	public void insertLast(char item){
		DequeNode newNode = new DequeNode();
		newNode.data=item;
		newNode.llink=null;
		newNode.rlink=null;
		if(isEmpty()){ 
			first=newNode; last=newNode;
		}
		else{
			newNode.llink=last;
			newNode.rlink=null;
			last.rlink=newNode;
			last=newNode;
		}
	}
	
	// Deque의 첫 부분을 삭제
	public char deleteFirst(){
		if(isEmpty()){
			System.out.println("Deque empty"); return 0;
		}else {
			char data = first.data;
			if(first.rlink==null){ first=null; last=null;}
			else{ first=first.rlink; first.llink=null;}
			return data;
		}
	}
	
	// Deque의 마지막 부분을 삭제
	public char deleteLast(){
		if(isEmpty()){
			System.out.println("Deque empty"); return 0;
		}else {
			char data =last.data;
			if(last.llink==null){ first=null; last=null;}
			else { last=last.llink; last.rlink=null;
			}
			return data;
		}
	}
	
	// Deque의 각 노드를 순차적으로 출력
	public void print(){  //이부분을 채워보라
		DequeNode p=first;
		System.out.println("=========================");
		while(p!=null) {
			char temp=p.data;
			System.out.println(temp);
			p=p.rlink;
			
		}
	}
}
