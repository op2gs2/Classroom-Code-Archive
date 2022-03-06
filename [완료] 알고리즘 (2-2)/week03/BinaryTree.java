package week03;

public class BinaryTree {
	BinaryTree ltree;
	Object data; //it can be as a root node for free using data of tree.
	BinaryTree rtree;
	
	//default constructor
	public BinaryTree() {
		ltree =null;
		data=null;
		rtree=null;
	}

	//constructor
	public BinaryTree(BinaryTree ltree, Object data, BinaryTree rtree) {
		this.ltree = ltree;
		this.data = data;
		this.rtree = rtree;
	}
	
	//check data that is empty
	public boolean isEmpty(BinaryTree btree){
		if( (btree == null)){
			return true;
		}
		
		else{
			return false;
		}
	}
	
	//method below is return 
	//if some tree is not empty, return their left tree
	public BinaryTree leftSubTree(BinaryTree btree){
		if(isEmpty(btree)==true){
			return null;
		}
		
		else{
			return btree.ltree;
		}
	}
	
	//if some tree is not empty, return their right tree
	public BinaryTree rightSubTree(BinaryTree btree){
		if(isEmpty(btree)==true){
			return null;
		}
		
		else{
			return btree.rtree;
		}
	}
	
	//if some tree is not empty, return their data
	public Object rootData(BinaryTree btree){
		if(isEmpty(btree)==true){
			return null;
		}
		
		else{
			return btree.data;
		}
	}
	
	//L: 트리의 왼쪽 진행 / N은 트리 자기 자신 진행 / R은 트리의 오른쪽 진행
	//전,중,후라는 단어가 N의 위치를 나타냄
	
	//do 중위순회(inorder - LNR)
	public void inorder(BinaryTree btree){
		if(btree.data == null){
			return;
		}
		
		inorder(btree.ltree);
		System.out.print(btree.data+" ");
		inorder(btree.rtree);
	}
	
	//do 전위순회(preorder - NLR)
	public void preorder(BinaryTree btree){
		if(btree.data == null){
			return;
		}
		
		System.out.print(btree.data+" ");
		preorder(btree.ltree);
		preorder(btree.rtree);
	}
	
	//do 후위순회(postorder - LRN)
	public void postorder(BinaryTree btree){
		if(btree.data == null){
			return;
		}
		
		preorder(btree.ltree);
		preorder(btree.rtree);
		System.out.print(btree.data+" ");
	}

}
