package level;

class BinaryTree {
	BinaryTree ltree;
	// BinaryTree btree;
	Object data;
	BinaryTree rtree;

	public BinaryTree() {
		ltree = null;
		data = null;
		rtree = null;
		// ������
	}

	public BinaryTree(BinaryTree ltree, Object data, BinaryTree rtree) {
		this.ltree = ltree;
		this.data = data;
		this.rtree = rtree;
		// ������
	}

	public boolean isEmpty(BinaryTree btree) {
		if (btree == null)
			return true;
		else
			return false;
		// ��������˻�
	} // End of isEmpty

	public BinaryTree leftSubTree(BinaryTree btree) {
		if (isEmpty(btree) == true)
			return null;
		else
			return btree.ltree;
		// ���� ���� ��ȯ
	} // End of leftSubTree

	public BinaryTree rightSubTree(BinaryTree btree) {
		if (isEmpty(btree) == true)
			return null;
		else
			return btree.rtree;
		// ������ ���� ��ȯ
	} // End of rightSubTree

	public Object rootData(BinaryTree btree) {
		if (isEmpty(btree) == true)
			return null;
		else
			return btree.data;
		// ��Ʈ ����Ÿ ��ȯ
	} // End of rootData

	public void inorder(BinaryTree btree) {
		if (btree.data == null)
			return;

		inorder(btree.ltree);
		System.out.print(btree.data + " ");
		inorder(btree.rtree);
	} // End of inorder

	public void preorder(BinaryTree btree) {
		if (btree.data == null)
			return;

		System.out.print(btree.data + " ");
		preorder(btree.ltree);
		preorder(btree.rtree);
	} // End of Preorder

	public void postorder(BinaryTree btree) {
		if (btree.data == null)
			return;

		postorder(btree.ltree);
		postorder(btree.rtree);
		System.out.print(btree.data + " ");
	} // End of PostOrder
} // End of Class BinaryTree
