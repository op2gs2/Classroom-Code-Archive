public class DLinkedList {
	//���� ���� ����Ű�� ������
	private DListNode head;
	
	//Default constructor
	public DLinkedList() {
	}

	//����Ʈ�� ó������ ��带 �����ϴ� �ڵ�
	public void insertFirst(String x) {
		//��带 �����ϱ� ���� ���� �� ��带 ����� �ش�.
		DListNode newNode = new DListNode(x);
		if (head == null) { // ���� ����Ʈ�� ���Ҿ���
			head = newNode;
			return; // �ƹ��͵� �������� �ʰ� DLinedList()�� ����
		}
		//������ ��忡 ���ο� ��带 ������.
		newNode.rlink = head;
		head.llink = newNode;
		head = newNode;
	}
	
	//������ ��带 �������ִ� �ڵ�
	public void deleteLast() {
		//�ΰ��� ������ ����
		//�̴� �Ѱ��� �� ��� .link ����� �ϳ� �� ���� ����Ǳ� �����̴�.
		DListNode p = head;
		DListNode q = head;
		
		//�� ���� �����͸� ���������� �̵���Ű�� �ڵ�
		while(p!=null){
			q=p;
			p=p.rlink;	
		}
		
		//������ ��� ���� null�� �Ͽ� ������ ���� ������.
		q.rlink=null;
	}

	// Z�� �� ��° ������������ ��ȯ�ϴ� �޼ҵ�
	public int findData(String z) { 
		//Declare Count Variable
		int cnt = 0;
		//������ ����
		DListNode p = head;
		//�����͸� ���������� �̵���Ű�� �ڵ�
		//�׷��鼭 ī��Ʈ������ ���� �ϳ��� ������Ŵ
		while((p!=null)){
			cnt++;
			if (z==p.data){
				return cnt;
			}
			p=p.rlink;
		}
		//����� ī��Ʈ������ ��ȯ
		return cnt;
	}

	//�ش��ϴ� ��带 ����
	public void deleteNode(String y) {
		//������ ����
		DListNode p = head;
		
		//���������� �̵������ִ� �ڵ�
		while (p.rlink != null) {
			//���� p�� ó���� ������ ������忡 ��ǥ ���� ������
			if ((p.data == y) && (p == head)) {
				//head�� ���������� �������� �����
				head = head.rlink;
				head.llink = null;
				//���� p�� ����Ű�� ��尡 y���
			} else if (p.data == y) {
				//p�� ����Ű�� ��带 ������ �� ���� ���� ����Ű���� 
				p.llink.rlink = p.rlink;
				p.rlink.llink = p.llink;
			}
		}
	}
	
	//����Ʈ�� �����
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
