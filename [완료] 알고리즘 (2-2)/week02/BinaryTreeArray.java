package array;
/*���1: �б� ��带 �߽����� �����Ͽ� �����ϱ�*/
public class BinaryTreeArray {
	public static void main(String[] args) {
		int left; //���� ����� ���� ��
		int right; //���� ����� ������ ��
		int bt=1; //���� ��� �ε���
		
		//���� �κ�
		char[] stock = new char[30];
		BinaryTree BT = new BinaryTree();
		
		
		/*�Է� �κ�*/
		/*�� �б� ����� ������ Ȥ�� �������� �����Ͽ� ����*/
		//bt==1
		stock[bt]='A';
		left=BT.leftSubTree(bt);
		right=BT.rightSubTree(bt);
		stock[left]='B';
		stock[right]='C';
		
		//bt==2
		bt++;
		left=BT.leftSubTree(bt);
		right=BT.rightSubTree(bt);
		stock[left]='D';
		stock[right]='E';
		
		//bt==3
		bt++;
		left=BT.leftSubTree(bt);
		stock[left]='F';
		
		//bt==5
		bt=5;
		left=BT.leftSubTree(bt);
		stock[left]='G';	
		
		//bt==10
		bt=10;
		right=BT.rightSubTree(bt);	
		stock[right]='H';

		/*��ºκ�*/
		for(int i =1; i<stock.length; i++){
			System.out.println("BT��"+ i+"��° ����:"+stock[i]);
		}
	}

}
