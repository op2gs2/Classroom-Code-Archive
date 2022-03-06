public class PQ {
	QlistNode front; // 리스트의 선두를 표시하기 위한 변수
	int num_node = 0; // 손님의 수를 계산하기 위한 변수

	public PQ() {
	}

	void enqueue(String name, int priority) { // 리스트에 값을 넣는 메소드
		QlistNode p; // 노드를 가르키기 위한 변수
		QlistNode newNode = new QlistNode(); // 노드 선언 및 생성
		// 새로운 노드의 내용을 삽입
		newNode.name = name;
		newNode.priority = priority;
		newNode.link = null;

		// 안에 내용이 없거나 새로들어올 내용이 우선 순위가 높을 경우
		if ((front == null) || (newNode.priority < front.priority)) {
			newNode.link = front;
			front = newNode;
		}
		// 그 이외의 경우
		else {
			p = front;
			while (p.link != null && p.link.priority <= newNode.priority) {
				p = p.link;
			}
			newNode.link = p.link;
			p.link = newNode;
		}

		num_node++;// 손님 수 증가
	}

	String dequeue() { // 선두원소 제거
		String name = "";
		// 비어 있을 경우
		if (front == null) {
			System.out.println("Queue underflow");
		}
		// 그렇지 않을 경우
		else {
			name = front.name;
			front = front.link;
		}
		num_node--; // 손님 수 감소
		return name; // 삭제되는 내용 반환
	}

	int numberofitem() {// 우선순위큐에 들어있는 손님의 수 계산
		return num_node;
	}

	String peek() { // 가장 앞에 앉아있는 손님은?
		// 비어 있지 않을 경우
		if (front != null) {
			String name = front.name;
			return name;
		}
		// 비어있는 경우
		else {
			return "안에 손님이 없습니다. 손님을 넣어주세요.";
		}
	}
}
