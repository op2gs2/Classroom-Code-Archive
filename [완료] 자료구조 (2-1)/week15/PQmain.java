public class PQmain {
	public static void main(String[] args){
		PQ aQ= new PQ();
		//ť�� ���� ����
		aQ.enqueue("Kim",30);
		aQ.enqueue("Lee",20);
		aQ.enqueue("Pak",10);
		aQ.enqueue("Cho",70);
		
		//ť�� �׽�Ʈ
		System.out.println(aQ.numberofitem());
		System.out.println(aQ.peek());
		System.out.println(aQ.dequeue()); 
		System.out.println(aQ.dequeue()); 
		System.out.println(aQ.dequeue()); 
		System.out.println(aQ.dequeue()); 
		System.out.println(aQ.dequeue()); 
	}
}
