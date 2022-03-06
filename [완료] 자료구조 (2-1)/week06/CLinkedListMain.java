
public class CLinkedListMain {
	public static void main(String args[]){
		//리스트를 만들어서 리스트를 테스트하는 메인 메소드
		System.out.println("CL1=(20,4, 3, 7) 만들기  20->4->3->7->20");
		CLinkedList CL1=new CLinkedList();
		//리스트를 출력하는 메소드
		CL1.print();
		//리스트 처음에 노드를 추가하는 메소드
		CL1.addFirst(7);
		CL1.addFirst(3);
		CL1.addFirst(4);
		CL1.addFirst(20);
		//리스트를 출력하는 메소드
		CL1.print();
		//마지막 노드를 없애는 메소드
		//CL1.deleteLast();
		//CL1.deleteLast();
		CL1.deleteLast();
		CL1.deleteLast();
		//리스트를 출력하는 메소드
		CL1.print();
		//노드의 갯수를 출력
		System.out.println(CL1.getNoofNode());//갯수 출력해보라
		CL1.addLast(84); //마지막에 노드추가
		//리스트를 출력하는 메소드
		CL1.print();
		
	}

}
