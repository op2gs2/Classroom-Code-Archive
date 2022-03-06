public class PQmain {
	public static void main(String[] args){
		PQ aQ= new PQ();
		//큐에 값을 대입
		aQ.enqueue("Kim",30);
		aQ.enqueue("Lee",20);
		aQ.enqueue("Pak",10);
		aQ.enqueue("Cho",70);
		
		//큐를 테스트
		System.out.println(aQ.numberofitem());
		System.out.println(aQ.peek());
		System.out.println(aQ.dequeue()); 
		System.out.println(aQ.dequeue()); 
		System.out.println(aQ.dequeue()); 
		System.out.println(aQ.dequeue()); 
		System.out.println(aQ.dequeue()); 
	}
}
