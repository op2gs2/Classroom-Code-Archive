package array;

/*���2: �̾ �����غ���*/
public class BinaryTreeArray2 {
	public static void main(String[] args) {
		int left; // ���� ����� ���� ��
		int right; // ���� ����� ������ ��
		int bt = 1; // ���� ��� �ε���
		int current; // ������ ��带 �ӽ� ����

		// ���� �κ�
		char[] stock = new char[30];
		BinaryTree BT = new BinaryTree();

		/* �Է� �κ� */
		/*�� �ε����� �������� ���������� �����Ͽ� ���� */
		//1��° �ڽ�: 1��° �ε����� ���� ����
		current = bt;
		stock[bt] = 'A';
		left = BT.leftSubTree(bt);
		stock[left] = 'B';
		left = BT.leftSubTree(left);
		stock[left] = 'D';

		//2��° �ڽ�: 1��° �ε����� ������ ����
		right = BT.rightSubTree(current);
		stock[right] = 'C';
		left = BT.leftSubTree(right);
		stock[left] = 'F';

		//3��° �ڽ�: 2��° �ε����� ���� ����
		left = BT.leftSubTree(current);
		bt = left;
		right = BT.rightSubTree(bt);
		stock[right] = 'E';
		left = BT.leftSubTree(right);
		stock[left] = 'G';
		right = BT.rightSubTree(left);
		stock[right] = 'H';

		/* ��ºκ� */
		for (int i = 1; i < stock.length; i++) {
			System.out.println("BT��" + i + "��° ����:" + stock[i]);
		}
	}

}
