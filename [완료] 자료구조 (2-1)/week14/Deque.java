public class Deque {
	// �� Ŭ������ �����ϴ� �� �ʿ��� �ʵ带 ����
	DequeNode first;
	DequeNode last;
	public Deque(){
		first=null; last=null;
	}
	// Deque�� ������� Ȯ��
	public boolean isEmpty(){
		return (first==null);
	}
	// Deque�� ù �κ����� ����
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
	
	// Deque�� ������ �κ����� ����
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
	
	// Deque�� ù �κ��� ����
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
	
	// Deque�� ������ �κ��� ����
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
	
	// Deque�� �� ��带 ���������� ���
	public void print(){  //�̺κ��� ä������
		DequeNode p=first;
		System.out.println("=========================");
		while(p!=null) {
			char temp=p.data;
			System.out.println(temp);
			p=p.rlink;
			
		}
	}
}
