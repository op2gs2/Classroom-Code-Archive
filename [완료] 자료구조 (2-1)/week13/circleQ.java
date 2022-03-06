package CircularQ;


public class circleQ {
	//필드 생성
	private int Qsize = 10;
	private int arrayQ[];
	private int front, rear;

	// 생성자
	public circleQ() {
		arrayQ = new int[Qsize];
		front = rear = 0; //
	}

	// 입력 메소드
	void enqueue(int x) {
		// 값을 넣기전에 공간을 확인
		rear = (rear + 1) % Qsize;
		if (front == rear) {
			System.out.println("Queue full");
		}
		// 후에 값을 대입함
		arrayQ[rear] = x;
	}

	// 출력 메소드
	int dequeue() {
		// 값을 넣을 수 없는 경우
		if (front == rear) {
			System.out.println("Queue empty");
			return -99;
		} else {
			// 삭제 전 앞 공간을 확보후 대입
			front = (front + 1) % Qsize;
			return arrayQ[front];
		}
	}
}
