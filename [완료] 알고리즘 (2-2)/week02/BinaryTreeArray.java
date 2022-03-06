package array;
/*방법1: 분기 노드를 중심으로 접근하여 수행하기*/
public class BinaryTreeArray {
	public static void main(String[] args) {
		int left; //현재 노드의 왼쪽 값
		int right; //현재 노드의 오른쪽 값
		int bt=1; //현재 노드 인덱스
		
		//선언 부분
		char[] stock = new char[30];
		BinaryTree BT = new BinaryTree();
		
		
		/*입력 부분*/
		/*각 분기 노드의 오른쪽 혹은 왼쪽으로 접근하여 수행*/
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

		/*출력부분*/
		for(int i =1; i<stock.length; i++){
			System.out.println("BT의"+ i+"번째 원소:"+stock[i]);
		}
	}

}
