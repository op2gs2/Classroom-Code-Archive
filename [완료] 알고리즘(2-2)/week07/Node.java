

class Node {
	int data;
	Node link;

	Node(int n) {
		data = n;
		link = null;
	}

	Node(int n, Node m) {
		data = n;
		link = m;
	}
}; // end of class Node
