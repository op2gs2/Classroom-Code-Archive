
public class arrayStacktMain {
	public static void main(String arg[]){
		int i;
		arrayStack stack1 = new arrayStack();
		//stack1.top=-1;
		for(i=10;i<=50;i+=10){
			stack1.push(i);
		}
		System.out.println("Push한 값 출력(Pop)");
		while(!stack1.empty()){
			System.out.println(stack1.pop()+", ");
		}
		
	}
}
