
public class DLinkedListMain {
	public static void main(String args[]){
		//����Ʈ���� ��ü ����
		DLinkedList L=new DLinkedList();
		//ù ��° ���� �� ������ ����
		L.insertFirst("Kim");
		L.insertFirst("Choi");
		L.insertFirst("Lee");
		L.insertFirst("Park");
		//�ش��ϴ� ��带 ����
		L.deleteNode("Lee");
		//ù ��° ���� �� ������ ����
		L.insertFirst("Yoo");
		L.insertFirst("Hong");
		//������ ��带 ����
		L.deleteLast();
		//����Ʈ�� �����
		L.printList();
		//�ش� �����͸� ã�� �����
		L.findData("Choi");//4��° �����Ͱ� choi 
		System.out.println(L.findData("Choi"));
	}
}
    