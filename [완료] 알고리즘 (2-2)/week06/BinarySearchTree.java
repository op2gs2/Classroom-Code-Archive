package week06;

// Start of Binary Tree
class BinaryTree {
	BinaryTree llink;
	BinaryTree btree;
	Object data;
	BinaryTree rlink;

	public BinaryTree() {
		llink = null;
		data = null;
		rlink = null;
		// ������
	}

	public BinaryTree(Object data) {
		this.llink = null;
		this.data = data;
		this.rlink = null;
		// ������
	}

	public BinaryTree(BinaryTree llink, Object data, BinaryTree rlink) {
		this.llink = llink;
		this.data = data;
		this.rlink = rlink;
		// ������
	}

	public boolean isEmpty(BinaryTree btree) {
		if (btree == null) {
			return true;
		} else {
			return false;
		}
		// ��������˻�
	}

	public BinaryTree leftSubTree(BinaryTree btree) {
		if (isEmpty(btree) == true) {
			return null;
		} else {
			return btree.llink;
		}
		// ���� ���� ��ȯ
	}

	public BinaryTree rightSubTree(BinaryTree btree) {
		if (isEmpty(btree) == true) {
			return null;
		} else {
			return btree.rlink;
		}
		// ������ ���� ��ȯ
	}

	public Object rootData(BinaryTree btree) {
		if (isEmpty(btree) == true) {
			return null;
		} else {
			return btree.data;
		}
		// ��Ʈ ����Ÿ ��ȯ
	}

	public void inorder(BinaryTree btree) {
		if (btree == null)
			return;

		inorder(btree.llink);
		System.out.print(btree.data + " ");
		inorder(btree.rlink);
	} // End of inorder

	public void preorder(BinaryTree btree) {
		if (btree == null)
			return;

		System.out.print(btree.data + " ");
		preorder(btree.llink);
		preorder(btree.rlink);

	} // End of Preorder

	public void postorder(BinaryTree btree) {
		if (btree == null)
			return;

		postorder(btree.llink);
		postorder(btree.rlink);
		System.out.print(btree.data + " ");
	} // end of inorder

	// ////////////////////////////////////////////////////////////////
	// ���� Ž��Ʈ�� //
	// ////////////////////////////////////////////////////////////////
	private BinaryTree insertKey(BinaryTree T, String x) {
		// �������Ͻ� �ֻ��� ��忡 ����
		if (isEmpty(T)) {
			BinaryTree T1 = new BinaryTree(null, x, null);// ��ĭ25: ����, ������ ��ũ�� null�� �����ʹ� x�� ����Ʈ�� ����
			return T1;// ��ĭ26: ����Ʈ�� ��ȯ
		}
		// �Էµ� ���ڿ��� data���� ������ ���� ��ũ�� ����
		else if (x.compareTo((String) T.data) < 0) {
			T.llink = insertKey(T.llink, x);// ��ĭ27: ���� ��ũ�� �ٽ� insertKey�� ����Ͽ� ��ȯ�� ����
			return T;
		}
		// �Էµ� ���ڿ��� data���� ũ��� ������ ��ũ�� ����
		else if (x.compareTo((String) T.data) > 0) {
			T.rlink = insertKey(T.rlink, x);// ��ĭ28: ������ ��ũ�� �ٽ� insertKey�� ����Ͽ� ��ȯ�� ����
			return T;
		} else {

			return T;
		}
	}

	public void insert(String x) {
		btree = insertKey(btree, x);
	}

	public BinaryTree find(String x) {
		BinaryTree T = btree;
		int result;

		while (T != null) {
			// �񱳸� �ؼ� data���� �������� ���� ��ũ�� �i�ư�.
			if ((result = x.compareTo((String) T.data)) < 0) {
				T = T.llink;// ��ĭ29: ���� ��ũ �Ѿư�
			}
			// �񱳸� �ؼ� data�� �����Ƿ� �˻��� data�� ��ȯ��.
			else if (result == 0) {
				return T;
			}
			// �񱳸� �ؼ� data���� ŭ���� ������ ��ũ�� �i�ư�.
			else {
				T = T.rlink;// ��ĭ30: ������ ��ũ �Ѿư�
			}
		}
		return T;
	}

	// �̻� ����
	private void printNode(BinaryTree T) {
		if (T != null) {
			System.out.print("(");
			printNode(T.llink);
			System.out.print(T.data);
			printNode(T.rlink);
			System.out.print(")");
		}
	}

	public void printBST() {
		printNode(btree);
		System.out.println();
	}

	public void deleteKey(String key) {
		BinaryTree current = btree;
		BinaryTree parrent = current;

		while (current.data != key) {
			if (current == null) { // Ű ���� ���� ��� ���� (������ ��尡 ���� ���)
				return;
			}
			parrent = current;
			if (key.compareTo((String) current.data) < 0) { // key���� ��Ʈ���� ���� ���
				// ��ĭ 1: currnet�� ���� ���� ����Ʈ���� ����
				current = current.leftSubTree(current);
			} else { // key���� ��Ʈ���� ū ���
						// ��ĭ 2: currnet ���� ������ ����Ʈ���� ����
				current = current.rightSubTree(current);
			}
		}

		// �ڽ��� ���� ���� ����� ����
		if (current.llink == null && current.rlink == null) {
			if (current == btree) {
				btree = null;
			} 
			else if (current == parrent.llink) { //������ ��尡 �θ����� �����϶�
				// ��ĭ 3
				parrent.llink=null;

			} 
			else { //������ ��尡 �θ����� �������϶�
				// ��ĭ 4
				parrent.rlink=null;
			}
		}
		
		// ���� �� Ű ���� ã�� �� �ڽ��� �ϳ��̸鼭 �����ڽĸ� ����
		else if (current.rlink == null) {
			if (current == btree) {
				btree = current.llink;
			}

			else if (current == parrent.llink) {
				// ��ĭ 5
				//STEP1. ������ ���� ��带 �����ϱ�
				BinaryTree temp = current.llink;
				//STEP2. ������ ����� ��ũ�� �����ֱ�
				current = null;
				//STEP3. ������ ��带 ������ ��� �θ� ��忡 �ٿ��ֱ�
				parrent.llink = temp;
			}

			else {
				// ��ĭ 6
				//STEP1. ������ ���� ��带 �����ϱ�
				BinaryTree temp = current.llink;
				//STEP2. ������ ����� ��ũ�� �����ֱ�
				current = null;
				//STEP3. ������ ��带 ������ ��� �θ� ��忡 �ٿ��ֱ�
				parrent.rlink = temp;
			}
		}
		// ������ Ű ���� ã�� �� �ڽ��� �ϳ��̸鼭 ���� �ڽĸ� ����
		else if (current.llink == null) {
			if (current == btree) {
				btree = current.rlink;
			} else if (current == parrent.llink) {
				// ��ĭ 7
				BinaryTree temp = current.rlink;
				current = null;
				parrent.llink = temp;
			} else {
				// ��ĭ 8
				BinaryTree temp = current.rlink;
				current = null;
				parrent.rlink = temp;
			}
		}

		// ������ Ű ���� ã�� �� �ڽ��� ���϶�
		else {
			BinaryTree Min = MinNode(current);
			if (current == btree) {
				btree = Min;
			} else if (current == parrent.llink) {
				// ��ĭ 9
			} else {
				// ��ĭ 10
			}
			Min.llink = current.llink;
		}
		//Max -> Min ���� ������ ã�� ��� ����
	}

	private BinaryTree MinNode(BinaryTree deleteTree) {
		BinaryTree MinParent = null;
		BinaryTree Min = null;
		BinaryTree current = deleteTree.rlink;
		while (current != null) {
			// ��ĭ 11
			current = current.llink;
		}

		if (Min != deleteTree.rlink) {
			// ��ĭ 12
			Min = deleteTree.rlink;
		}
		return Min;
	}
} // end of BinaryTree class
