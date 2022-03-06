package ArrayPQ;
public class ArrayPQ {
	public static void main(String[] args){//메인 함수
		PQ aQ=new PQ();
		aQ.enqueue("kim",30);
		System.out.println(aQ.dequeue());
		aQ.enqueue("park",40);
		aQ.enqueue("Lee",35);
		aQ.Peek();
		System.out.println(aQ.dequeue());
		System.out.println(aQ.dequeue());
		aQ.isEmpty();
	}
}
