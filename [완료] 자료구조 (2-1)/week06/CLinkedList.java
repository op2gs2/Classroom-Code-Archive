
public class CLinkedList {
	//포인터들 선언
	private CListNode head, tail;
	private CListNode temp; // 필요한 곳을 가리키는 포인터
	//리스트 처음에 노드를 추가하는 메소드
	public void addFirst(int x){
		CListNode cnewNode=new CListNode();
		cnewNode.data=x;
		// empty list일 때 실행
		if(head==null){
			head=cnewNode; 
			tail=cnewNode;
			cnewNode.clink=head;
		}
		else{
			temp=head;
			cnewNode.clink=temp;
			head=cnewNode;//여기까지가 노드를 만들고 연결하는 과정
			//연결한 노드로 리스트의 헤드를 지정
			tail.clink=head;
		}
	}
	//마지막 노드를 없애는 메소드
	public void deleteLast(){
		if(head==null){
			System.out.println("Nothing to delete");
		}
		else if(head==tail){//원소가 1개이면
			head=null; tail=null;
		}
		else{ //원소가 2개 혹은 그 이상 
			CListNode p, q;
			p=null; q=head;
			while(q!=tail){
				p=q; q=q.clink;
			}
			tail=p;
			p.clink=head;
			
		}
	}
	//리스트를 출력하는 메소드
	public void print(){
		CListNode p=head;
		if(p!=null){ //공백리스트가 아닐경우
			while((p!=tail)&&(p!=null)){//원형연결리스트의 노드방문코드
				//노드를 방문하면서 출력함
				System.out.print(p.data+"->");
				p=p.clink;
			}
			System.out.print(p.data+"->"); //여기까지가 끝
			p=p.clink;  //마지막->선두원소이동
			System.out.println(p.data);
		}
		else { System.out.println("empty list");}
	}
	//노드의 갯수를 출력하는 메소드
	public int getNoofNode(){
		CListNode p=head;
		int cnt=1;
		while((p!=tail)&&(p!=null)){//노드 방문코드를 이용한다.
			++cnt;
			p=p.clink;
		}
		return cnt;
	}
	public void addLast(int num){ //원형연결리스트 마지막에 원소추가
        CListNode cnewNode=new CListNode();
        cnewNode.data=num;
        if(head==null){// empty list
            head=cnewNode; 
            tail=cnewNode;
            cnewNode.clink=head;
        }
        else{
            temp=tail;
            temp.clink=cnewNode;
            cnewNode.clink=head;//여기까지가 노드를 리스트의 마지막으로 연결하는 코드
            tail=temp.clink;//꼬리를 정의해줌
        }
    }
	public CLinkedList(){	//생성자
	}
}
