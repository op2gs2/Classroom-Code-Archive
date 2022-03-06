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
		// 생성자
	}

	public BinaryTree(Object data) {
		this.llink = null;
		this.data = data;
		this.rlink = null;
		// 생성자
	}

	public BinaryTree(BinaryTree llink, Object data, BinaryTree rlink) {
		this.llink = llink;
		this.data = data;
		this.rlink = rlink;
		// 생성자
	}

	public boolean isEmpty(BinaryTree btree) {
		if (btree == null) {
			return true;
		} else {
			return false;
		}
		// 비었는지검사
	}

	public BinaryTree leftSubTree(BinaryTree btree) {
		if (isEmpty(btree) == true) {
			return null;
		} else {
			return btree.llink;
		}
		// 왼쪽 서브 반환
	}

	public BinaryTree rightSubTree(BinaryTree btree) {
		if (isEmpty(btree) == true) {
			return null;
		} else {
			return btree.rlink;
		}
		// 오른쪽 서브 반환
	}

	public Object rootData(BinaryTree btree) {
		if (isEmpty(btree) == true) {
			return null;
		} else {
			return btree.data;
		}
		// 루트 데이타 반환
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
	// 이진 탐색트리 //
	// ////////////////////////////////////////////////////////////////
	private BinaryTree insertKey(BinaryTree T, String x) {
		// 공백노드일시 최상위 노드에 삽입
		if (isEmpty(T)) {
			BinaryTree T1 = new BinaryTree(null, x, null);// 빈칸25: 왼쪽, 오른쪽 링크는 null로 데이터는 x인 이진트리 생성
			return T1;// 빈칸26: 이진트리 반환
		}
		// 입력된 문자열이 data보다 작으면 왼쪽 링크에 삽입
		else if (x.compareTo((String) T.data) < 0) {
			T.llink = insertKey(T.llink, x);// 빈칸27: 왼쪽 링크에 다시 insertKey를 사용하여 반환값 저장
			return T;
		}
		// 입력된 문자열이 data보다 크면면 오른쪽 링크에 삽입
		else if (x.compareTo((String) T.data) > 0) {
			T.rlink = insertKey(T.rlink, x);// 빈칸28: 오른쪽 링크에 다시 insertKey를 사용하여 반환값 저장
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
			// 비교를 해서 data보다 작음으로 왼쪽 링크를 쫒아감.
			if ((result = x.compareTo((String) T.data)) < 0) {
				T = T.llink;// 빈칸29: 왼쪽 링크 쫓아감
			}
			// 비교를 해서 data와 같으므로 검색된 data를 반환함.
			else if (result == 0) {
				return T;
			}
			// 비교를 해서 data보다 큼으로 오른쪽 링크를 쫒아감.
			else {
				T = T.rlink;// 빈칸30: 오른쪽 링크 쫓아감
			}
		}
		return T;
	}

	// 이상 없음
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
			if (current == null) { // 키 값을 갖는 노드 없음 (삭제할 노드가 없는 경우)
				return;
			}
			parrent = current;
			if (key.compareTo((String) current.data) < 0) { // key값이 루트보다 작은 경우
				// 빈칸 1: currnet의 값을 왼쪽 서브트리로 저장
				current = current.leftSubTree(current);
			} else { // key값이 루트보다 큰 경우
						// 빈칸 2: currnet 값을 오른쪽 서브트리로 저장
				current = current.rightSubTree(current);
			}
		}

		// 자식이 없는 리프 노드의 삭제
		if (current.llink == null && current.rlink == null) {
			if (current == btree) {
				btree = null;
			} 
			else if (current == parrent.llink) { //삭제할 노드가 부모노드의 왼쪽일때
				// 빈칸 3
				parrent.llink=null;

			} 
			else { //삭제할 노드가 부모노드의 오른쪽일때
				// 빈칸 4
				parrent.rlink=null;
			}
		}
		
		// 삭제 할 키 값을 찾은 후 자식이 하나이면서 왼쪽자식만 존재
		else if (current.rlink == null) {
			if (current == btree) {
				btree = current.llink;
			}

			else if (current == parrent.llink) {
				// 빈칸 5
				//STEP1. 삭제할 다음 노드를 저장하기
				BinaryTree temp = current.llink;
				//STEP2. 삭제할 노드의 링크를 끊어주기
				current = null;
				//STEP3. 저장한 노드를 삭제한 노드 부모 노드에 붙여주기
				parrent.llink = temp;
			}

			else {
				// 빈칸 6
				//STEP1. 삭제할 다음 노드를 저장하기
				BinaryTree temp = current.llink;
				//STEP2. 삭제할 노드의 링크를 끊어주기
				current = null;
				//STEP3. 저장한 노드를 삭제한 노드 부모 노드에 붙여주기
				parrent.rlink = temp;
			}
		}
		// 삭제할 키 값을 찾은 후 자식이 하나이면서 오른 자식만 존재
		else if (current.llink == null) {
			if (current == btree) {
				btree = current.rlink;
			} else if (current == parrent.llink) {
				// 빈칸 7
				BinaryTree temp = current.rlink;
				current = null;
				parrent.llink = temp;
			} else {
				// 빈칸 8
				BinaryTree temp = current.rlink;
				current = null;
				parrent.rlink = temp;
			}
		}

		// 삭제할 키 값을 찾은 후 자식이 둘일때
		else {
			BinaryTree Min = MinNode(current);
			if (current == btree) {
				btree = Min;
			} else if (current == parrent.llink) {
				// 빈칸 9
			} else {
				// 빈칸 10
			}
			Min.llink = current.llink;
		}
		//Max -> Min 제일 작은거 찾는 결로 변경
	}

	private BinaryTree MinNode(BinaryTree deleteTree) {
		BinaryTree MinParent = null;
		BinaryTree Min = null;
		BinaryTree current = deleteTree.rlink;
		while (current != null) {
			// 빈칸 11
			current = current.llink;
		}

		if (Min != deleteTree.rlink) {
			// 빈칸 12
			Min = deleteTree.rlink;
		}
		return Min;
	}
} // end of BinaryTree class
