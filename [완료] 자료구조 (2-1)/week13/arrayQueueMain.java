package CircularQ;

public class arrayQueueMain {  //circular queue
	public static void main(String args[]){
		//answer of Assignments No.3
		circleQ cq1=new circleQ();
		cq1.enqueue(10);
		cq1.enqueue(20);
		System.out.println(cq1.dequeue());
		cq1.enqueue(30);
		cq1.enqueue(40);
		System.out.println(cq1.dequeue());
		System.out.println(cq1.dequeue());
		int temp=cq1.dequeue();
		System.out.println(temp);
		cq1.enqueue(temp);
	}
}
