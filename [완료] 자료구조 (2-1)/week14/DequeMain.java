public class DequeMain {
	public static void main(String[] args){
		//deque 실행
		Deque DQ =new Deque();
		System.out.println("Deque simulation");
		DQ.insertFirst('A');
		DQ.print();
		//DQ.deleteFirst();
		DQ.insertLast('B');
		DQ.print();
		DQ.insertLast('C');
		DQ.print();
		DQ.insertFirst('D');
		DQ.print();
		DQ.deleteFirst();
		DQ.print();
		DQ.deleteLast();
		DQ.print();
		//DQ.deleteLast();
		// Stack simulation  deque를 사용하여 스택을 흉내 push, pop
		
		//dequestack 실행
		System.out.println("\n"+"Stack Queue simulation");
		DequeStack dqstack1=new DequeStack();
		dqstack1.push('X');
		dqstack1.push('Y');
		dqstack1.push('Z');
		System.out.println(dqstack1.pop());
		System.out.println(dqstack1.pop());
		System.out.println(dqstack1.pop());
		
		
		// Queue simulation deque를 사용하여 큐를 흉내 enqueue, dequeue
		//dequequeue 실행
		System.out.println("\n"+"Deque simulation");
		DequeQueue dq1=new DequeQueue();
		dq1.enqueue('Y');
		dq1.enqueue('X');
		dq1.enqueue('Z');
		System.out.println(dq1.dequeue());
		System.out.println(dq1.dequeue());
		System.out.println(dq1.dequeue());
	}
}
