
public class DLinkedListMain {
	public static void main(String args[]){
		//리스트관련 객체 생성
		DLinkedList L=new DLinkedList();
		//첫 번째 노드로 각 데이터 삽입
		L.insertFirst("Kim");
		L.insertFirst("Choi");
		L.insertFirst("Lee");
		L.insertFirst("Park");
		//해당하는 노드를 삭제
		L.deleteNode("Lee");
		//첫 번째 노드로 각 데이터 삽입
		L.insertFirst("Yoo");
		L.insertFirst("Hong");
		//마지막 노드를 삭제
		L.deleteLast();
		//리스트를 출력함
		L.printList();
		//해당 데이터를 찾아 출력함
		L.findData("Choi");//4번째 데이터가 choi 
		System.out.println(L.findData("Choi"));
	}
}
    