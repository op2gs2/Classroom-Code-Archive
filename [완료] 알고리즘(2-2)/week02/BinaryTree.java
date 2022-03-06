package array;

public class BinaryTree {
	int right;
	int left;

	public int leftSubTree(int bt) {
		int result = bt * 2;
		return result;
	}

	public int rightSubTree(int bt) {
		int result = bt * 2 + 1;
		return result;
	}

}
