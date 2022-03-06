
public class CLinkedList {
	//�����͵� ����
	private CListNode head, tail;
	private CListNode temp; // �ʿ��� ���� ����Ű�� ������
	//����Ʈ ó���� ��带 �߰��ϴ� �޼ҵ�
	public void addFirst(int x){
		CListNode cnewNode=new CListNode();
		cnewNode.data=x;
		// empty list�� �� ����
		if(head==null){
			head=cnewNode; 
			tail=cnewNode;
			cnewNode.clink=head;
		}
		else{
			temp=head;
			cnewNode.clink=temp;
			head=cnewNode;//��������� ��带 ����� �����ϴ� ����
			//������ ���� ����Ʈ�� ��带 ����
			tail.clink=head;
		}
	}
	//������ ��带 ���ִ� �޼ҵ�
	public void deleteLast(){
		if(head==null){
			System.out.println("Nothing to delete");
		}
		else if(head==tail){//���Ұ� 1���̸�
			head=null; tail=null;
		}
		else{ //���Ұ� 2�� Ȥ�� �� �̻� 
			CListNode p, q;
			p=null; q=head;
			while(q!=tail){
				p=q; q=q.clink;
			}
			tail=p;
			p.clink=head;
			
		}
	}
	//����Ʈ�� ����ϴ� �޼ҵ�
	public void print(){
		CListNode p=head;
		if(p!=null){ //���鸮��Ʈ�� �ƴҰ��
			while((p!=tail)&&(p!=null)){//�������Ḯ��Ʈ�� ���湮�ڵ�
				//��带 �湮�ϸ鼭 �����
				System.out.print(p.data+"->");
				p=p.clink;
			}
			System.out.print(p.data+"->"); //��������� ��
			p=p.clink;  //������->���ο����̵�
			System.out.println(p.data);
		}
		else { System.out.println("empty list");}
	}
	//����� ������ ����ϴ� �޼ҵ�
	public int getNoofNode(){
		CListNode p=head;
		int cnt=1;
		while((p!=tail)&&(p!=null)){//��� �湮�ڵ带 �̿��Ѵ�.
			++cnt;
			p=p.clink;
		}
		return cnt;
	}
	public void addLast(int num){ //�������Ḯ��Ʈ �������� �����߰�
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
            cnewNode.clink=head;//��������� ��带 ����Ʈ�� ���������� �����ϴ� �ڵ�
            tail=temp.clink;//������ ��������
        }
    }
	public CLinkedList(){	//������
	}
}
