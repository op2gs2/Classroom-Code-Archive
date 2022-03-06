package ListQ;

public class listQueue {
	//필드 생성
	private listNode front, rear;

	//생성자
	public listQueue() {
		front = null;
		rear = null;
	}

	//입력
	public void enqueue(int x) {
		//노드 생성
		listNode newNode = new listNode();
		newNode.data = x;
		//공간이 없을 경우 새로운 노드 생성
		if (front == null) {
			front = rear = newNode;
		} 
		//아니면, 그냥 값을 집어넣음
		else {
			rear.link = newNode;
			rear = newNode;
		}
	}

	//출력
	public int dequeue() {
		//
		int temp;
		//공간이 꽉 찬경우에
		if (front == null) {
			System.out.println("Queue Empty");
			return -99;
		}
		
		//아니면 값을 넣음
		temp = front.data;
		front = front.link;
		return temp;
	}
}
