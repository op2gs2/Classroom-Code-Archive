public class DLinkedList {
	//가장 앞을 가리키는 포인터
	private DListNode head;
	
	//Default constructor
	public DLinkedList() {
	}

	//리스트의 처음으로 노드를 삽입하는 코드
	public void insertFirst(String x) {
		//노드를 삽입하기 전에 삽입 할 노드를 만들어 준다.
		DListNode newNode = new DListNode(x);
		if (head == null) { // 현재 리스트에 원소없음
			head = newNode;
			return; // 아무것도 돌려주지 않고 DLinedList()를 끝냄
		}
		//기존의 노드에 새로운 노드를 연결함.
		newNode.rlink = head;
		head.llink = newNode;
		head = newNode;
	}
	
	//마지막 노드를 삭제해주는 코드
	public void deleteLast() {
		//두개의 포인터 지정
		//이는 한개로 할 경우 .link 수행시 하나 더 가서 진행되기 때문이다.
		DListNode p = head;
		DListNode q = head;
		
		//두 개의 포인터를 마지막으로 이동시키는 코드
		while(p!=null){
			q=p;
			p=p.rlink;	
		}
		
		//삭제할 노드 전을 null로 하여 연결을 끊어 버린다.
		q.rlink=null;
	}

	// Z가 몇 번째 데이터인지를 반환하는 메소드
	public int findData(String z) { 
		//Declare Count Variable
		int cnt = 0;
		//포인터 지정
		DListNode p = head;
		//포인터를 마지막으로 이동시키는 코드
		//그러면서 카운트변수의 값을 하나씩 증가시킴
		while((p!=null)){
			cnt++;
			if (z==p.data){
				return cnt;
			}
			p=p.rlink;
		}
		//계산한 카운트변수를 반환
		return cnt;
	}

	//해당하는 노드를 삭제
	public void deleteNode(String y) {
		//포인터 지정
		DListNode p = head;
		
		//마지막으로 이동시켜주는 코드
		while (p.rlink != null) {
			//만약 p가 처음에 있을때 다음노드에 목표 값이 있으면
			if ((p.data == y) && (p == head)) {
				//head는 오른쪽으로 왼쪽으론 비워줌
				head = head.rlink;
				head.llink = null;
				//만약 p가 가르키는 노드가 y라면
			} else if (p.data == y) {
				//p가 가르키는 노드를 제외한 양 옆을 서로 가리키게함 
				p.llink.rlink = p.rlink;
				p.rlink.llink = p.llink;
			}
		}
	}
	
	//리스트를 출력함
	public void printList() {
		DListNode p;
		p = head;
		System.out.print("(");
		while (p != null) {
			System.out.print(p.data);
			p = p.rlink;
			if (p != null) {
				System.out.print(", ");
			}
		}
		System.out.println(")");
	}
}
