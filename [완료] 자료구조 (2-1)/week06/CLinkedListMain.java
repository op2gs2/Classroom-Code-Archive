
public class CLinkedListMain {
	public static void main(String args[]){
		//����Ʈ�� ���� ����Ʈ�� �׽�Ʈ�ϴ� ���� �޼ҵ�
		System.out.println("CL1=(20,4, 3, 7) �����  20->4->3->7->20");
		CLinkedList CL1=new CLinkedList();
		//����Ʈ�� ����ϴ� �޼ҵ�
		CL1.print();
		//����Ʈ ó���� ��带 �߰��ϴ� �޼ҵ�
		CL1.addFirst(7);
		CL1.addFirst(3);
		CL1.addFirst(4);
		CL1.addFirst(20);
		//����Ʈ�� ����ϴ� �޼ҵ�
		CL1.print();
		//������ ��带 ���ִ� �޼ҵ�
		//CL1.deleteLast();
		//CL1.deleteLast();
		CL1.deleteLast();
		CL1.deleteLast();
		//����Ʈ�� ����ϴ� �޼ҵ�
		CL1.print();
		//����� ������ ���
		System.out.println(CL1.getNoofNode());//���� ����غ���
		CL1.addLast(84); //�������� ����߰�
		//����Ʈ�� ����ϴ� �޼ҵ�
		CL1.print();
		
	}

}
