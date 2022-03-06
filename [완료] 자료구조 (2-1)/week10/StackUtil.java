import java.util.Stack;

public class StackUtil {
	public static void main(String args[]) {
		//Stack 타입 객체 생성후
		Stack s1 = new Stack();
		//문제에서 제시한 명령 수행
		s1.push(10); 
		s1.push(20); 
		s1.push(30);
		s1.pop();
		s1.peek();
		s1.push(40);
		s1.pop();
		s1.push(50);
		
		//그리고 스택의 내용을 출력
		int size = s1.size();
		System.out.println("스택크기: " + size);
		System.out.println("스택출력순서: ");
		while (!s1.empty()) {
			Integer iobj = (Integer) s1.pop();
			System.out.println(iobj.intValue() + " ");
		}
	}
}