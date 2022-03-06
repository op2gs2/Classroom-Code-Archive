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
		 * �����ð��� �ߴ� ��� Ʈ���� ��������.
		 * BinaryTree ������ ���ϴ� ��ŭ ���� �˴ϴ�.
		 * */
		
		
		btree_l_l = new BinaryTree(new BinaryTree(),"C",new BinaryTree());
		btree_l_r = new BinaryTree(new BinaryTree(),"E",new BinaryTree());
		btree_l = new BinaryTree(btree_l_l , "B" , btree_l_r);
		
		btree_r_l = new BinaryTree(new BinaryTree(),"F",new BinaryTree());
		btree_r_r = new BinaryTree();
		btree_r=new BinaryTree(btree_r_l , "D", btree_r_r);
		
		btree = new BinaryTree(btree_l, "A", btree_r);
		
		// inorder traversing
		System.out.println("\n���� ����Ʈ�� ��ȸ :");
		btree.inorder(btree);

		// preorder traversing
		System.out.println("\n���� ����Ʈ�� ��ȸ :");
		btree.preorder(btree);

		// postorder traversing
		System.out.println("\n���� ����Ʈ�� ��ȸ :");
		btree.postorder(btree);

		// Test of ArrayQueue
		//BinaryTree pointer;
		System.out.println("\n���� ����Ʈ�� ��ȸ :");

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
		 * ArrayQueue��ü�� �޼ҵ带 �����ؼ� ���� ����Ʈ���� �����Ͻÿ�
		 * */
		}
		 
	} 
  
