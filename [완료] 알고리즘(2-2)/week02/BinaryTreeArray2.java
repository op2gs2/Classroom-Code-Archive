package array;

/*방법2: 이어서 저장해보기*/
public class BinaryTreeArray2 {
	public static void main(String[] args) {
		int left; // 현재 노드의 왼쪽 값
		int right; // 현재 노드의 오른쪽 값
		int bt = 1; // 현재 노드 인덱스
		int current; // 지나온 노드를 임시 저장

		// 선언 부분
		char[] stock = new char[30];
		BinaryTree BT = new BinaryTree();

		/* 입력 부분 */
		/*각 인덱스의 방향으로 순차적으로 접근하여 수행 */
		//1번째 코스: 1번째 인덱스의 왼쪽 방향
		current = bt;
		stock[bt] = 'A';
		left = BT.leftSubTree(bt);
		stock[left] = 'B';
		left = BT.leftSubTree(left);
		stock[left] = 'D';

		//2번째 코스: 1번째 인덱스의 오른쪽 방향
		right = BT.rightSubTree(current);
		stock[right] = 'C';
		left = BT.leftSubTree(right);
		stock[left] = 'F';

		//3번째 코스: 2번째 인덱스의 왼쪽 방향
		left = BT.leftSubTree(current);
		bt = left;
		right = BT.rightSubTree(bt);
		stock[right] = 'E';
		left = BT.leftSubTree(right);
		stock[left] = 'G';
		right = BT.rightSubTree(left);
		stock[right] = 'H';

		/* 출력부분 */
		for (int i = 1; i < stock.length; i++) {
			System.out.println("BT의" + i + "번째 원소:" + stock[i]);
		}
	}

}
