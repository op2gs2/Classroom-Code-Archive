package ArrayPQ;

public class PQ {
	private int qSize = 10; // 배열의 초기 크기
	private long[] queue; // 우선순위에 관련한 배열을 선언
	private String[] name; // 이름과 관련한 배열을 선언
	private int nItems; // 큐의 손님갯수

	public PQ() {// 생성자
		name = new String[qSize];
		queue = new long[qSize];
		nItems = 0;
	}

	public void enqueue(String str, long item) { // 배열에 값을 넣어줌
		int i;
		
		//공간의 크기와 아이템의 크기가 같을 경우
		if (nItems == qSize) {
			System.out.println("PQ full");
			isFull();
			return;
		}
		
		//들어있는 내용이 없을 경우
		if (nItems == 0) {
			name[0] = str;
			queue[0] = item;
			nItems++;
		} 
		
		//들어있는 내용이 있을 경우
		else {
			for (i = nItems - 1; i >= 0; i--) {
				if (item > queue[i]) {// 삽입하려는 자료가 크면
					queue[i + 1] = queue[i]; // 기존자료를 하나 뒤로 이동
					name[i + 1] = name[i];
				} else
					break; // 삽입하려는 자료가 작거나 같으면 이동종료
			}
			queue[i + 1] = item;
			name[i + 1] = str;
			nItems++;
		}
	}

	public String dequeue() { // 배열의 값을 빼고 안의 내용을 넘겨줌
		String str;
		//만약 사람이 없을 경우
		if (nItems <= 0) {
			return "PQ empty";
		}
		
		//값이 있을 때 내용
		str = name[nItems - 1];
		nItems--;
		return str;

	}

	public void isFull() { // 배열이 꽉 차있는지 확인 하고, 꽉 차있을 경우 크기를 10씩 늘려줌
		//만약 크기가 큰 경우
		//출력문으로 주석을 대체함
		if (nItems == qSize) {
			qSize += 10;
			System.out.println("Queue크기 10 증가");
			long[] temp = new long[qSize];
			String[] temp2 = new String[qSize];
			for (int i = 0; i < queue.length; i++) {
				System.out.println(i + "번째 요소 복사 중");
				temp[i] = queue[i];
				temp2[i] = name[i];
			}
			queue = temp;
			name = temp2;
			System.out.println("새로운 함수 대체완료");

		}
	}

	public void isEmpty() { // 배열이 비어있는지 확인함
		if (nItems == 0) {
			System.out.println("공간이 비어있음");
		}
	}

	public void Peek() { // 배열 내 선두 원소를 출력
		System.out.println("가장 앞에 위치한 손님은?" + name[(nItems - 1)]);
	}
}
