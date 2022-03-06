package week03;

public class BinaryTreeTest {
	public static void main(String[] args) {
		BinaryTree btTree;
		BinaryTree ltTree;
		BinaryTree rtTree;
		//BinaryTree current;
		
		ltTree = new BinaryTree(new BinaryTree(), "B", new BinaryTree());
		rtTree = new BinaryTree(new BinaryTree(), "C", new BinaryTree());
		btTree = new BinaryTree(ltTree, "A", rtTree);
		
		//inorder
		System.out.println("전위순회");
		btTree.inorder(btTree);
		System.out.println();
		
		//preorder
		System.out.println("중위순회");
		btTree.preorder(btTree);
		System.out.println();
		
		//postorder
		System.out.println("후위순회");
		btTree.postorder(btTree);
	}

}
