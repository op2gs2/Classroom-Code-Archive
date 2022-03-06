import java.util.Stack;

public class StackUtil1 {
	public static void main(String args[]) {
		//Stack 타입 객체 생성후
		Stack s1 = new Stack();
		//입력하기 위한 Integer형 객체 선언
		Integer iobj;
		//0~9까지 스택에 입력
		System.out.println("스택입력순서: ");
		for (int j = 0; j < 10; j++) {
			iobj = new Integer(j);
			s1.push(iobj);
			iobj = (Integer) s1.peek();
			System.out.println(iobj.intValue() + " ");
		}
		
		//스택을 출력함
		int size = s1.size();
		System.out.println("스택크기: " + size);
		System.out.println("스택출력순서: ");
		while (!s1.empty()) {
			iobj = (Integer) s1.pop();
			System.out.println(iobj.intValue() + " ");
		}
	}
}