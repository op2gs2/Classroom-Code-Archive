import java.util.Stack;

public class StackUtil {
	public static void main(String args[]) {
		//Stack Ÿ�� ��ü ������
		Stack s1 = new Stack();
		//�������� ������ ��� ����
		s1.push(10); 
		s1.push(20); 
		s1.push(30);
		s1.pop();
		s1.peek();
		s1.push(40);
		s1.pop();
		s1.push(50);
		
		//�׸��� ������ ������ ���
		int size = s1.size();
		System.out.println("����ũ��: " + size);
		System.out.println("������¼���: ");
		while (!s1.empty()) {
			Integer iobj = (Integer) s1.pop();
			System.out.println(iobj.intValue() + " ");
		}
	}
}