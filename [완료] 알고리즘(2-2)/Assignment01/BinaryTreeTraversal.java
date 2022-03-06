package level;

class BinaryTreeTraversal {
	public static void main(String args[]) {
		BinaryTree btree;
		BinaryTree btree_l;
		BinaryTree btree_l_l;
		BinaryTree btree_l_r;
		BinaryTree btree_r_l;
		BinaryTree btree_r_r;
		BinaryTree btree_r;
		BinaryTree obj;
		/*(1)
		 * 수업시간에 했던 대로 트리를 만들어보세요.
		 * BinaryTree 변수는 원하는 만큼 만들어도 됩니다.
		 * */
		
		
		btree_l_l = new BinaryTree(new BinaryTree(),"C",new BinaryTree());
		btree_l_r = new BinaryTree(new BinaryTree(),"E",new BinaryTree());
		btree_l = new BinaryTree(btree_l_l , "B" , btree_l_r);
		
		btree_r_l = new BinaryTree(new BinaryTree(),"F",new BinaryTree());
		btree_r_r = new BinaryTree();
		btree_r=new BinaryTree(btree_r_l , "D", btree_r_r);
		
		btree = new BinaryTree(btree_l, "A", btree_r);
		
		// inorder traversing
		System.out.println("\n중위 이진트리 순회 :");
		btree.inorder(btree);

		// preorder traversing
		System.out.println("\n전위 이진트리 순회 :");
		btree.preorder(btree);

		// postorder traversing
		System.out.println("\n후위 이진트리 순회 :");
		btree.postorder(btree);

		// Test of ArrayQueue
		//BinaryTree pointer;
		System.out.println("\n레벨 이진트리 순회 :");

		ArrayQueue Q = new ArrayQueue();
		Q.enqueue(btree);
		Q.enqueue(btree_l);
		Q.enqueue(btree_r);
		Q.enqueue(btree_l_l);
		Q.enqueue(btree_l_r);
		Q.enqueue(btree_r_l);
		
		for(int i=Q.count; i>0; i--) {
			obj=(BinaryTree) Q.dequeue();
			System.out.print(obj.data+" ");
		}
		/*(2)
		 * ArrayQueue객체의 메소드를 참조해서 레벨 이진트리를 구현하시오
		 * */
		}
		 
	} 
  
