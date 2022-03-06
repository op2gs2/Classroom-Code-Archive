
public class DListNode {
	//노드의 구성요소 정의
	String data;
	DListNode llink;
	DListNode rlink;
	
	//노드를 생성하는 생성자
	public DListNode(){
		data=null;
		llink=null;
		rlink=null;
	}
	//노드에 data값을 넣어주는 생성자
	public DListNode(String x){
		data=x;
		llink=null;
		rlink=null;
	}
}
