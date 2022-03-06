package ListQ;

public class listQueueMain {
	public static void main(String args[]){
		System.out.println("Hello World");
		listQueue cq1=new listQueue();
		//answer of Assignments No.4
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
